package com.sean.jdk.obj;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.extern.log4j.Log4j;

public class Main {
	
	public static void main(String[] args) {
		
		Obj[] os = new Obj[3];
        for (int i = 0; i < os.length; i++) {
			Obj o = new Obj("0"+i);
			 os[i]=o;
		}
		final List<Obj> lst = new ArrayList<Obj>();
		Obj _obj = null;
		for (Obj obj : os) {
			_obj = obj;
			lst.add(_obj);
		}
//       Iterable<Obj> it  = (Iterable<Obj>) lst.iterator();
      /* while(it.hasNext()){
    	   System.out.println(it.next().getName());
       }*/
       System.out.println("=======================");
     /*  Iterable<Obj> it = new Iterable<Obj>() {
		
		public Iterator<Obj> iterator() {
			// TODO Auto-generated method stub
			return lst.iterator();
		}
	};
       for (Obj obj : it) {
		System.out.println(obj.getName());
	}
       System.out.println("=======================");
       for (Obj obj : it) {
   		System.out.println(obj.getName());
   	}
	*/
	}
}
@Data
class Obj{
	
	String name;
	
	Person p;
	
	public Obj(String name) {
		this.p= new Person(name);
	}
}

class Person{
	String name;
	static{
		System.out.println("test");
	}
	public Person(String name) {
		this.name =  name;
	}
	public void setName(String name2) {
		this.name = name2;
		
	}
	public String getName() {
		return name;
	}
}