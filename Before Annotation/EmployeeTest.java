package com.employee;

import static org.junit.Assert.assertArrayEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	 Object [] objarr=new Object[5];
	 @Before
	 public void inputs() {
		 objarr[0]=(new Employee("Akash",123,2000));
		 objarr[1]=(new Employee("Arnab",155,4000));
		 objarr[2]=(new Employee("Dev",173,5000));
		 objarr[3]=(new Employee("Deep",124,8000));
		 objarr[4]=(new Employee("Abhisek",163,3000));
	 }
	 @Test
	 public void compare() {
		 //we want to convert the list of objects to array of objects
		 Object[] objarr2=Employee.getEmpList().toArray();
		 assertArrayEquals(objarr, objarr2);
	 }
	 @After
	 public void output() {
		 System.out.println("Test case passed");
	 }
}
