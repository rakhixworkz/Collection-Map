package com.xworkz.Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class Company {

	public static void main(String[] args) {
		HashMap<Integer,String> company=new HashMap<Integer,String>();
		company.put(1234, "Ram");
		company.put(2456, "Shyam");
		company.put(3321, "Bhrat");
		company.put(4567, "Mohan");
		company.put(5673, "Lakhan");
		
		company.entrySet();
		Set <Entry<Integer,String>> entrySet=company.entrySet(); 
		Iterator<Entry<Integer,String>> iterator=entrySet.iterator();
		while(iterator.hasNext()) {
			Entry<Integer,String> next=iterator.next();
			System.out.println("key :"+next.getKey());
			System.out.println("value :"+next.getValue());
	}
	}

}
