package com.tms.lesson7.finalization;

public class SimpleObject extends Object
{
	private String name;

	public SimpleObject(String name)
	{
		this.name = name;
	}

	@Override protected void finalize() throws Throwable
	{
		System.out.println(name + "'s finalization");
		super.finalize();
	}
}
