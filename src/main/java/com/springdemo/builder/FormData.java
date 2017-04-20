package com.springdemo.builder;

import java.util.List;

public class FormData {
	private boolean formHorizontal = false;
	private int cols = 1;
	private List<FormFieldVo> fields = null;
	private int index = 0;

	public boolean hasNext() {
		if (index < fields.size()) {
			return true;
		} else {
			return false;
		}
	}

	public FormFieldVo nextField() {
		if (index>=fields.size()){
			throw new RuntimeException("index out range");
		}
		
		FormFieldVo field = fields.get(index++);
		return field;
	}

	public boolean isFormHorizontal() {
		return formHorizontal;
	}

	public void setFormHorizontal(boolean formHorizontal) {
		this.formHorizontal = formHorizontal;
	}

	public int getCols() {
		return cols;
	}

	public void setCols(int cols) {
		this.cols = cols;
	}

	public List<FormFieldVo> getFields() {
		return fields;
	}

	public void setFields(List<FormFieldVo> fields) {
		this.fields = fields;
	}
}
