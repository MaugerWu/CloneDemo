package com.cqupt.mauger.copy;

/**
 * 引用拷贝
 * @author Mauger
 * @date 2018年4月25日  
 * @version 1.0
 */
public class Apple
{
	public int num = 1;
    public StringBuilder name = new StringBuilder("Apple");

    public void addNum()
    {
        this.num = num + 1;
        this.name = name.append(num);
    }

    public String toString()
    {
       return "name=" + name + ", num=" + num;
    }
    
    /**
     * 控制台打印：
     * apple1: name=Apple, num=1
     * apple1: name=Apple2, num=2
     * apple2: name=Apple2, num=2
     * 
     * @param args
     */
    public static void main(String[] args)
    {
		Apple apple1 = new Apple();
		System.out.println("apple1: " + apple1);

		Apple apple2 = apple1;
		apple2.addNum();
		System.out.println("apple1: " + apple1);
		System.out.println("apple2: " + apple2);
	}
}