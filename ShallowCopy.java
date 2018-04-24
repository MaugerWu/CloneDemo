package com.cqupt.mauger.copy;

import java.util.Date;

/**
 * 浅拷贝（对象拷贝）
 * 
 * 定义：
 * 	被复制对象的所有变量都含有与原来的对象相同的值，而所有的对其他对象的引用仍然指向原来的对象。即对象的浅拷贝会对“主”对象进行拷贝，
 * 	但不会复制主对象里面的对象。”里面的对象“会在原来的对象和它的副本之间共享。
 * 
 * 	简而言之，浅拷贝仅仅复制所考虑的对象，而不复制它所引用的对象。

 * @author Mauger
 * @date 2018年4月24日  
 * @version 1.0
 */
public class ShallowCopy implements Cloneable
{
	private Date begin;
	
	public Date getBegin()
	{
		return this.begin;
	}
	
	public void setBegin(Date d)
	{
		this.begin = d;
	}
	
	@Override
	public Object clone()
	{
		Object obj = null;
		try
		{
			obj = super.clone();
		} catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return obj;
	}
}