package com.springdemo.builder;

public class FormFieldVo {
	private String fieldName=null;
	private String fieldLabel=null;
	private String fieldType=null;
	public FormFieldVo(){
		fieldName="";
		fieldLabel="";
		fieldType="text";
	}
	
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public String getFieldLabel() {
		return fieldLabel;
	}
	public void setFieldLabel(String fieldLabel) {
		this.fieldLabel = fieldLabel;
	}
	public String getFieldType() {
		return fieldType;
	}
	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}
	
}
