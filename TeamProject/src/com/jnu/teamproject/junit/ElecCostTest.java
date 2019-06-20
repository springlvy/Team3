package com.jnu.teamproject.junit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.jnu.teamproject.data.GetPythonData;


public class ElecCostTest {
	
	private String[] elecCost=new String[6];
	
	@Test
	public void test() throws Throwable {
		elecCost=GetPythonData.getElecCost("3319");
		assertEquals("当前剩余电量: 181.62度", elecCost[0]);
		//fail("Not yet implemented");
	}

}
