package com.szf.common;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

public class TPSTest {

	@Test
	public void testTPS() throws ParseException {
		SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd");
		Date min = form.parse("2012-01-01");
		Date max = form.parse(form.format(new Date()));
		List list = new ArrayList<>();
		for (int i = 1; i <= 100; i++) {
			BigInteger a = new BigInteger("0");
			BigDecimal b = new BigDecimal("30000.00");
			BigInteger c = a.add(new BigInteger("0"+i));
			TPS t = new TPS(c, StringUtils.getZHName(), RodomUtils.radom(1, 100), b, DateUtils.random(min, max));
			list.add(t);
		}
		for (Object object : list) {
			System.out.println(object);
		}
		
	}

}
