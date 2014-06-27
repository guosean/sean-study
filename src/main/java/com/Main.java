package com;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import com.google.common.collect.Lists;

/**
 * @AUTHOR: guozb
 * @DATE: 2014-6-23
 */
public class Main {
  public static void main(String[] args) {
	List<String> list = new CopyOnWriteArrayList<String>();
	for (int i = 0; i < 5; i++) {
		list.add(String.valueOf(i));
	}
	Iterator<String> it = list.iterator();
	while(it.hasNext()){
		it.next();
//		it.remove();
		list.add("test");
	}
	System.out.println(list);
}
}
