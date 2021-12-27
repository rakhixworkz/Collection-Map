package com.xworkz.Collection.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class Tester {

	public static void main(String[] args) {
		HashMap<Integer,String> hashMap=new HashMap<Integer,String>();
		hashMap.put(1, "karnataka");
		hashMap.put(2, "Andhra Pradesh");
		hashMap.put(3, "Bihar");
		hashMap.put(4, "Tamilnadu");
		hashMap.entrySet();
		Set <Entry<Integer,String>> entrySet=hashMap.entrySet(); 
		Iterator<Entry<Integer,String>> iterator=entrySet.iterator();
		while(iterator.hasNext()) {
			Entry<Integer,String> next=iterator.next();
			System.out.println("key :"+next.getKey());
			System.out.println("value :"+next.getValue());
	}
	}
}
