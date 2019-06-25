package com.jnu.teamproject.junit;

import static org.junit.Assert.*;

import org.junit.Test;
import com.jnu.teamproject.data.UserInfo;
import com.jnu.teamproject.data.Serialization;

public class SerialiazableTest {

	@Test
	public void test() {
		UserInfo user=new UserInfo();
		user.setName("陈灿杰");
		user.setMajor("软件工程");
		user.setSex("男");
		user.setDorm("3313");
		user.setInstitution("智能科学与工程学院");
		user.setNumber("2016052382");
		
		user.setCardNumber("2016052382");
		user.setCardPassword("ccj123");
		user.setDigitJnuAccount("2016052382");
		user.setDigitJnuPassword("ccj803");
		user.setOfficeAccount("2016052382");
		user.setOfficePassword("ccj803");
		Serialization.write(user);
		
		UserInfo res=(UserInfo)Serialization.read();
		
		assertEquals(user.getName(),res.getName());
		assertEquals(user.getMajor(),res.getMajor());
		assertEquals(user.getSex(),res.getSex());
		assertEquals(user.getDorm(),res.getDorm());
		assertEquals(user.getInstitution(),res.getInstitution());
		assertEquals(user.getNumber(),res.getNumber());
		assertEquals(user.getCardNumber(),res.getCardNumber());
		assertEquals(user.getCardPassword(),res.getCardPassword());
		assertEquals(user.getDigitJnuAccount(),res.getDigitJnuAccount());
		assertEquals(user.getDigitJnuPassword(),res.getDigitJnuPassword());
		assertEquals(user.getOfficeAccount(),res.getOfficeAccount());
		assertEquals(user.getOfficePassword(),res.getOfficePassword());
		
	}

}
