package com.springdemo.builder.view;

import java.util.HashMap;
import java.util.Map;

import com.springdemo.builder.FormData;
import com.springdemo.builder.FormFieldVo;

public class FormGroup{
	private static Map<String,FormControl> controls=null;
	static{
		controls=new HashMap<String,FormControl>();
		controls.put(FormControl.FORMCONTROL_TEXT, new FormControlText());
		controls.put(FormControl.FORMCONTROL_SELECT,new FormControlSelect());
	}
			
	public String doView(FormData formData, FormFieldVo field) throws Exception {
		FormControl control=FormGroup.controls.get(field.getFieldType());
		if (control==null){
			throw new Exception("form control type invalid");
		}
		
		if (formData.isFormHorizontal()) {
			return doFieldHorizontal(formData,field,control);
		} else {
			return doFieldVertial(formData,field,control);
		}
	}

	private String doFieldHorizontal(FormData formData,FormFieldVo field,FormControl control) throws Exception {
		return "<div class=\"form-group\">" 
				+ "<label class=\"col-xs-2 control-label\">"+ field.getFieldLabel()+"</label>"
				+ "<div class=\"col-xs-10\">" 
				+ control.doView(formData, field)
				+ "</div>"
				+ "</div>";
	}
	
	private String doFieldVertial(FormData formData,FormFieldVo field,FormControl control) throws Exception {
		return "<div class=\"form-group\">"+	
				"	<label>"+ field.getFieldLabel()+ "</label>"+
				control.doView(formData, field)+
			    "</div>";
	}
}
