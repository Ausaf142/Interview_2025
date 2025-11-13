package com.me1.practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annot {

	@BeforeSuite
	public void BS() {
		System.out.println("before suit");
	}
	
	@BeforeTest
	public void BT() {
		System.out.println("before Test");	
	}
	@BeforeClass
	public void BC() {
		System.out.println("before Class");
	}
	@BeforeMethod
	public void BM() {
		System.out.println("before Method");
	}
	
	@Test
	public void demo() {
	System.out.println("test");
}
	@AfterMethod
	public void AM() {
	System.out.println("After Method");
}













}