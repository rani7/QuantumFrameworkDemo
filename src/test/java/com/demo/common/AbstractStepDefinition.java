package com.demo.common;

import com.demo.pages.PageDetails;

public class AbstractStepDefinition {
	
	public PageDetails pageDetails;
	
	public AbstractStepDefinition(){
		pageDetails=new PageDetails();
	}
}
