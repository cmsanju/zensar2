package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
		
	Calculator obj;
	
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("before class");
	}
	
	@AfterClass
	public static void afterClass()
	{
		System.out.println("after class");
	}
	
	@Before
	public void setUp()
	{
		System.out.println("before test method");
		
		obj = new Calculator();
	}
	
	@After
	public void setDown()
	{
		System.out.println("after test method");
		
		obj = null;
	}
	
	@Test
	public void testAdd()
	{
		System.out.println("test add method");
		
		assertEquals(360, obj.add(300, 60));
	}
	
	@Test
	public void testMul()
	{
		System.out.println("test mul method");
		
		assertEquals(600, obj.mul(30, 20));
	}
	@Test
	public void testSub()
	{
		System.out.println("test sub method");
		
		assertEquals(202, obj.sub(300, 98));
	}
	
	@Test
	public void testGreetUser()
	{
		System.out.println("greet user mthod");
		
		assertEquals("Hi hello.", obj.greetUser("Hi hello."));
	}
	
}
