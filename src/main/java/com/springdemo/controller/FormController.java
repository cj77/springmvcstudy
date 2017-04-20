package com.springdemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springdemo.builder.FormBuilder;
import com.springdemo.builder.FormData;
import com.springdemo.builder.FormFieldVo;
import com.springdemo.builder.view.FormControl;

@Controller
public class FormController {
	private static final Logger log = Logger.getLogger(TestController.class.getName());
	@RequestMapping("/form.do")
    public String index(HttpServletRequest request,HttpServletResponse response){
		log.debug("request mapping /form");
		
		List<FormFieldVo> fields = newFields();
		FormData formData = new FormData();
		formData.setCols(2);
		formData.setFields(fields);
		formData.setFormHorizontal(true);
		FormBuilder builder = new FormBuilder(formData);
		
		request.setAttribute("FORMBUILDER", builder.builder());
        return "form";
    }
	
	private List<FormFieldVo> newFields(){
		List<FormFieldVo> fields = new ArrayList<FormFieldVo>();
		FormFieldVo field = new FormFieldVo();
		field.setFieldName("F_NAME");
		field.setFieldLabel("姓名");
		fields.add(field);
		
		field = new FormFieldVo();
		field.setFieldName("F_ADDRESS");
		field.setFieldLabel("地址");
		fields.add(field);
		
		field = new FormFieldVo();
		field.setFieldName("F_MESSAGE");
		field.setFieldLabel("留言");
		fields.add(field);
		
		field = new FormFieldVo();
		field.setFieldName("F_AREA");
		field.setFieldLabel("行政区");
		field.setFieldType(FormControl.FORMCONTROL_SELECT);
		fields.add(field);
		
		return fields;
	}
}
