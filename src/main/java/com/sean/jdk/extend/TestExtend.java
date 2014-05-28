package com.sean.jdk.extend;

public class TestExtend {
	
	public static void main(String[] args) {
	Parent  pt =	new Child();
	Child cd = new Child();
	System.out.println(pt.getName()+pt.getAge()+" "+pt.age);
	System.out.println(cd.getName()+cd.getAge()+" "+cd.age);
	}

}
class Parent{
	static{
		System.out.println("Parent");
	}
	public Parent() {
		this.name = "parent";
		this.age = 10;
		System.out.println("Parent build");
	}
	private  String name;
	public int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
class Child extends Parent{
	static{
		System.out.println("Child");
	}
	public Child() {
		System.out.println("Child build");
		this.name = "child";
		this.age = 20;
	}
	private String name;
//	public int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}