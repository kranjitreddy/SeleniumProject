package com.jenkins.testbase;

public class TestClass {

	public static void main(String[] args) {
		
		
		ExcelReader obj=new ExcelReader("C:\\Users\\ranjit\\Desktop\\TestData.xlsx");
		
		System.out.println(obj.getCellData("Sheet1","TestData", 10));

	}

}
