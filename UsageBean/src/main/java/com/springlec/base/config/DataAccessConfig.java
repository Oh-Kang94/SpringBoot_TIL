package com.springlec.base.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springlec.base.service.CalcService;

@Configuration
public class DataAccessConfig {
	
	@Bean
	public CalcService calcService() {
		return new CalcService() {
			
			@Override
			public int addAction(int num1, int num2) throws Exception {
				// TODO Auto-generated method stub
				return num1+num2;
			}
		};
		
	}
}