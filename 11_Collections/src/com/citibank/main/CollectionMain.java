package com.citibank.main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionMain {

	public static void main(String[] args) {
		System.out.println("Main start");

		System.out.println("1. ArrayList");
		List<String> nameList = new ArrayList<String>();

		System.out.println("Name List Size :: " + nameList.size());
		System.out.println("Name List :: " + nameList);

		nameList.add("Paritosh");
		nameList.add("Abhishek");
		String name = new String("Kapil");
		nameList.add(name);

		System.out.println("Name List Size :: " + nameList.size());
		System.out.println("Name List :: " + nameList);
		System.out.println("Name at index 2 :: " + nameList.get(2));
		nameList.remove(2);
		System.out.println("After remove ");
		System.out.println("Name List Size :: " + nameList.size());
		System.out.println("Name List :: " + nameList);

		System.out.println("-----------------------------");
		System.out.println("2.HashSet");
		Set<Integer> numberSet = new HashSet<Integer>();
		System.out.println("numberSet Size :: " + numberSet.size());
		System.out.println("numberSet :: " + numberSet);

		numberSet.add(101);
		numberSet.add(10);
		numberSet.add(5);
		numberSet.add(101);
		numberSet.add(105);
		numberSet.add(5);

		System.out.println("After adding");
		System.out.println("numberSet Size :: " + numberSet.size());
		System.out.println("numberSet :: " + numberSet);

		System.out.println("-----------------------------");
		System.out.println("3.TreeSet");

		Set<String> nameTreeSet = new TreeSet<String>();
		System.out.println("nameTreeSet size :: " + nameTreeSet.size());
		System.out.println("nameTreeSet :: " + nameTreeSet);

		nameTreeSet.add("B");
		nameTreeSet.add("A");
		nameTreeSet.add("C");
		nameTreeSet.add("Z");
		nameTreeSet.add("B");
		
		System.out.println("After adding");
		System.out.println("nameTreeSet :: "+ nameTreeSet);
		
		
		System.out.println("Main end");
	}

}
