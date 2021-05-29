package com.fleet.platform.config;

import lombok.Data;

@Data
public class MedilabUserToken {

	private String access_token;
	private String type;
	private boolean isValid;
}
