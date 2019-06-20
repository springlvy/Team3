package com.jnu.teamproject.junit;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.jnu.teamproject.data.GetPythonData;

public class SchoolCardTest {

	@Test
	public void test() throws IOException {
		String[] InfoString=new String[2];
		InfoString=GetPythonData.getSchoolCardInfo("2016052382","Jcc169179");
		assertEquals("Óà¶î18.81Ôª", InfoString[0]);
		assertEquals("×´Ì¬Õý³£", InfoString[1]);
	}

}
