package com.springdemo.builder.view;

import com.springdemo.builder.FormData;
import com.springdemo.builder.FormFieldVo;

public abstract class View {
	public abstract String doView(FormData formData) throws Exception;
	
	public String diView(FormData formData ,FormFieldVo field) throws Exception{	
		return "";
	}
	
}
