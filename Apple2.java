package com.cqupt.mauger.copy;

/**
 * 深拷贝
 * @author Mauger
 * @date 2018年4月25日  
 * @version 1.0
 */
public class Apple2 implements Cloneable
{
	public int num = 1;
    public StringBuilder name = new StringBuilder("Apple");

    public void addNum()
    {
        this.num = num +1;
        this.name = name.append(num);
    }

    public String toString()
    {
       return "name=" + name + ", num=" + num;
    }

    // 深拷贝
    @Override
    public Apple2 clone()
    {
        try
        {
        	Apple2 cloned = (Apple2) super.clone();
        	cloned.name = new StringBuilder(name);
            return cloned;
        } catch (CloneNotSupportedException ex)
        {
            ex.printStackTrace();
            return null;
        }
    }
    
    /**
     * 控制台打印：
     * apple1: name=Apple, num=1
     * apple1: name=Apple, num=1
     * apple2: name=Apple12, num=2
     * 
     * @param args
     */
    public static void main(String[] args)
    {
    	Apple2 apple1 = new Apple2();
		System.out.println("apple1: " + apple1);

		Apple2 apple2 = apple1.clone();
		apple2.addNum();
		System.out.println("apple1: " + apple1);
		System.out.println("apple2: " + apple2);
	}
}