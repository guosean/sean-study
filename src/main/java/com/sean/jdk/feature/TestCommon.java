package com.sean.jdk.feature;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestCommon {
	@Test
	public void testSwitch(){
		int i=3;
		switch(i){
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		default:
			System.out.println("default");
		}
	}
	@Test
	public void testVars(){
		List<String> list = Arrays.asList("1","2");
		processList(list);
		for (String p : list) {
			System.out.println(p);
		}
	}
	private void processList(final List<String> list) {
		String p=null;  
		List<String> pl = list;
		for (int i = 0; i < pl.size(); i++) {
			p = pl.get(i);
			p = p+"t";
//			p.name = "t"+p.name;
		}
	}
	class Person{
		String name;
		public Person(String name){
			this.name = name;
		}
		public String toString(){
			return this.name;
		}
	}

}
