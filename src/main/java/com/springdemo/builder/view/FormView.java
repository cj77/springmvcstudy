package com.springdemo.builder.view;

import com.springdemo.builder.FormData;

public class FormView extends View {

	@Override
	public String doView(FormData formData) throws Exception{
		View subview = new RowView();
		StringBuilder sb = new StringBuilder();
		if (formData.isFormHorizontal()) {
			sb.append("<form class=\"form-horizontal\">");
		} else {
			sb.append("<form class=\"form\">");
		}
		sb.append(subview.doView(formData));
		sb.append("<form>");
		return sb.toString();
	}

}
