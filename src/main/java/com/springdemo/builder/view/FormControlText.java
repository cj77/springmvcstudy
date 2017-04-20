package com.springdemo.builder.view;

import com.springdemo.builder.FormData;
import com.springdemo.builder.FormFieldVo;

public class FormControlText implements FormControl{
	public String doView(FormData formData, FormFieldVo field) throws Exception {
		String m="<input type=\"email\" class=\"form-control\" name=\""+field.getFieldName()+"\">";
		return m;
	}	
}
