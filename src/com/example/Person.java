package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class  Sample{
	
	private int id;
	private String name;
	private double sal;
	
	public Sample() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sample(int id, String name, double sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Sample [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	
}
public class Person {
	
	
	public static void main(String[] args) {
		
		List<Sample>list=new ArrayList<>();
		
		list.add(new Sample(1, "nari",500));
		list.add(new Sample(2,"ramu",800));
		list.add(new Sample(1,"mahi",900));
		
		 Map<Integer,List<Sample>> collect = list.stream()
				 .collect(Collectors.groupingBy(Sample::getId,Collectors.toList()));
		collect.entrySet().stream()
		.filter( entry-> entry.getValue().size()>1)
		.forEach(System.out::println);
		
		

	}

}
