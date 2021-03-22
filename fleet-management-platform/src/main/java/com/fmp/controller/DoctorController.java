package com.fmp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/doctor")
public class DoctorController {
	
	private static List<String> inmemory = new ArrayList<>();
	
	@GetMapping
	public List<String> welcome() {
		String doc = "iam a doctor";
		
		return inmemory;
	}
	
	@DeleteMapping("/{name}")
	public List<String> delete(@PathVariable("name") String name) {
		inmemory.remove(name);
		
		return inmemory;
	}
	
	@PostMapping
	public  List<String> saveDoctor() {
		inmemory.add("john");
		inmemory.add("kane");
		inmemory.add("peter");
		
		return inmemory; 
	}
}