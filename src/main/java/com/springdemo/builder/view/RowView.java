package com.springdemo.builder.view;

import com.springdemo.builder.FormData;

public class RowView extends View {

	@Override
	public String doView(FormData formData) throws Exception {
		String m = "";
		while (formData.hasNext()) {
			if (formData.getCols() == 1) {
				m += cols(formData);
			} else if (formData.getCols() > 1) {
				m += "<div class=\"row\">";
				m += cols(formData);
				m += "</div>";
			}
		}
		return m;
	}

	private String cols(FormData formData) throws Exception {
		String m = "";
		if (formData.getCols() == 1) {
			m += formGroup(formData);
		} else if (formData.getCols() == 2) {
			for (int i = 0; i < 2; i++) {
				m += "<div class=\"col-xs-6\">";
				m += formGroup(formData);
				m += "</div>";
			}
		} else if (formData.getCols() == 3) {
			for (int i = 0; i < 3; i++) {
				m += "<div class=\"col-xs-4\">";
				m += formGroup(formData);
				m += "</div>";
			}
		}
		return m;
	}

	private String formGroup(FormData formData) throws Exception {
		if (formData.hasNext()) {
			FormGroup formGroup = new FormGroup();
			return formGroup.doView(formData, formData.nextField());
		} else {
			return "";
		}
	}
}
