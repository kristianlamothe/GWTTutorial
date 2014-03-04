package com.tutorial.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class LittleForm extends Composite {

	//uses the LittleForm.ui.xml file to create objects that have been defined in the HTMLPanel tag
	//this will also invoke the constructor below.
	private static LittleFormUiBinder uiBinder = GWT.create(LittleFormUiBinder.class);

	interface LittleFormUiBinder extends UiBinder<Widget, LittleForm> {
	}

	public LittleForm() {
		initWidget(uiBinder.createAndBindUi(this));
	}

//	public void setText(String text){
//		//set the text
//	}
}
