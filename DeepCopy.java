package com.cqupt.mauger.copy;

import java.util.Date;

/**
 * 深拷贝（对象拷贝）
 * 
 * 定义：
 * 	深拷贝是一个整个独立的对象拷贝，深拷贝会拷贝所有的属性,并拷贝属性指向的动态分配的内存。当对象和它所引用的对象一起拷贝时即发生深拷贝。
 * 	深拷贝相比于浅拷贝速度较慢并且花销较大。
 * 
 * 	简而言之，深拷贝把要复制的对象所引用的对象都复制了一遍。
 * 	
 * @author Mauger
 * @date 2018年4月24日  
 * @version 1.0
 */
public class DeepCopy implements Cloneable
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
		DeepCopy dc = null;
		try
		{
			dc = (DeepCopy) super.clone();
		} catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		dc.setBegin((Date) this.getBegin().clone());
		return dc;
	}
}
