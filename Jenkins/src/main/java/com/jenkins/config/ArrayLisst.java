package com.jenkins.config;

import java.util.ArrayList;
import java.util.List;

public class ArrayLisst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> list = new ArrayList<Integer>();
		
		List<String> strList=new ArrayList<String>();
		
		
		strList.add("Ranjit");
		strList.add("Sujit");
		
		System.out.println(strList);
		
		list.add(2);
		list.add(5);
		list.add(8);
		int lsize=list.size();
		
		if(!strList.isEmpty())
		{
			if(strList.contains("Sujit"))
			{
				System.out.println("Sujit is the brother of Ranjit");
			}
		}
			
		
		System.out.println("the size of the list is .."+lsize);
		
		
		if(!list.isEmpty())
		{
			System.out.println("the list is not Empty so now check for the list eligibility  ");
		
		if(list.contains(4))
		{
			System.out.println("the list is good to go ..");
		}
		else
		{
			System.out.println("Ignore the list  ..");
		}
		
		}
		
		for(int i=0;i<lsize;i++)
		{
			System.out.println("the elemement in the position "+i+" is  "+list.get(i));
			
		}
		
		
		

	}

}
