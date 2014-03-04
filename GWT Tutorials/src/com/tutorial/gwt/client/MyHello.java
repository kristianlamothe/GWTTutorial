package com.tutorial.gwt.client;

import com.google.gwt.core.client.EntryPoint;
//import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class MyHello implements EntryPoint {

	private LittleForm form = new LittleForm();
	
	@Override
	public void onModuleLoad() {
		// TODO Auto-generated method stub
//		RootPanel.get().add(myLabel);
//		form.setText("my new text");
		RootPanel.get().add(form);
	}

}
