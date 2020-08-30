package com.automation.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGMethods {

	@AfterMethod
	public void cleanUp() {
		System.out.println("After Test");
	}

	@Test(groups = "smoke")
	public void test1() {
		System.out.println("Executing Test 1");
	}

	@Test(groups = "regression")
	public void test2() {
		System.out.println("Executing Test 2");
	}

	@Test(groups = "regression")
	public void test3() {
		System.out.println("Executing Test 3");
	}

	@BeforeMethod
	public void setUp() {
		System.out.println("Before Test");
	}

}
