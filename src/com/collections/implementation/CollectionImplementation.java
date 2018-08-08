package com.collections.implementation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Cognizant India";
		String b="amazon development center";
		String c="i learnt a lot today";
		Set<Character> ab=new TreeSet<Character>();
		for(int i=0;i<=a.length()-1;i++)
		{
			ab.add(a.charAt(i));
		}
		System.out.println("unique character in string "+a);
		for (Character eachCharS : ab) {
			System.out.print(eachCharS+", ");

		}
		System.out.println("");
		List<Character> bc=new ArrayList<Character>();
		for(int i=0;i<=b.length()-1;i++)
		{
			bc.add(b.charAt(i));
		}
		Collections.sort(bc);
		System.out.println("All character in alphabetic order of "+b);
		for (Character eachCharL : bc) {
			System.out.print(eachCharL+", ");
		}
		System.out.println("");
		List<Character> cd=new ArrayList<Character>();
		for(int i=0;i<=a.length()-1;i++)
		{
			cd.add(c.charAt(i));
		}
		Collections.sort(cd);
		System.out.println("Last character in alphabetic order of "+c);
		System.out.println(cd.get(cd.size()-1));
	}

}
