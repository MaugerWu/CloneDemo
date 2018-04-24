package com.cqupt.mauger.copy;

/**
 * 引用拷贝
 * 
 * 	创建一个指向对象的引用变量的拷贝。
 * 
 * @author Mauger
 * @date 2018年4月24日  
 * @version 1.0
 */
public class Copy
{
	public static void main(String[] args)
	{
		People p = new People("Mauger", 20);
		People p1 = p;
		p.showPeople();
		p1.showPeople();
	}
}

/**
 * People
 * @author Mauger
 * @date 2018年4月24日  
 * @version 1.0
 */
class People
{
	private String name;
	private int age;
	
	public People(String name, int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public void showPeople()
	{
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
}