package com.tms.lesson7.finalization;

import java.util.ArrayList;
import java.util.List;

public class FinalizationRunner
{

    public final static List<SimpleObject> objList = new ArrayList<>();

	public static void main(String[] args)
	{
		List<SimpleObject> soList  = new ArrayList<>();

//		for (int i = 0; i < 100; i++)
//		{
//			createObject(i);
//			soList.add(createObject(i));
//		}
//		new Thread(() -> {
//			try
//			{
//				Thread.sleep(2000);
//			}
//			catch (InterruptedException e)
//			{
//				e.printStackTrace();
//			}
//			System.gc();
//		}).start();
//
//		while (true) {
//
//		}

		int i = 0;
		while (i < 2500000) {
			createObject(i);
			soList.add(createObject(i));
			i++;
		}

        System.out.println("******************** Size of my list: " + soList.get(2495999));
	}

	private static SimpleObject createObject(int number)
	{
		return new SimpleObject("so" + number);
	}
}
