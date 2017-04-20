package com.springdemo.builder;

import org.apache.log4j.Logger;

import com.springdemo.builder.view.FormView;

public class FormBuilder {
	private static final Logger log = Logger.getLogger(FormBuilder.class.getName());
	
	private FormData formData =null;
	public FormBuilder(FormData formData){
		this.formData = formData;
	}
	 
	public String builder(){
		try{
			FormView view = new FormView();
			return view.doView(formData);
		}catch(Exception e){
			log.error(e);
			return "";
		}		
	}
}
