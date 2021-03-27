package com.sgtesting.actitime.stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksDemo {
	
	@Before
	public void setUp()
	{
		System.out.println("Connect Oracle 11g Database....");
	}
	
	@After
	public void tearDown()
	{
		System.out.println("DisConnect Oracle 11g Database....");
	}

}
