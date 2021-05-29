package com.fleet.platform.dao;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.fleet.platform.model.Vehicle;

@Repository
public class VehicleDaoImpl implements VehicleDao {

	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	@Override
	public Vehicle save(Vehicle vehilce) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
		Session ses = sessionFactory.openSession();
		Transaction tx = ses.beginTransaction();
		ses.save(vehilce);
		tx.commit();
		return vehilce;
	}

	@Override
	public Optional<Vehicle> findById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Transactional(isolation=Isolation.READ_COMMITTED,
			propagation=Propagation.REQUIRES_NEW)
	public List<Vehicle> findAll() {
		SessionFactory sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
		Criteria ct = sessionFactory.openSession().createCriteria(Vehicle.class);
		return ct.list();
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(String id) {
		// TODO Auto-generated method stub

	}

}
