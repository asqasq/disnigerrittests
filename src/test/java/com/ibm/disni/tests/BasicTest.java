package com.ibm.disni.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BasicTest {
	int value;
	@Before
	public void init() {
		value = 3;
	}
	@After
	public void destroy() {
	}
	

	@Test
	public void testGetBuffer() {
		Assert.assertEquals(value, 3);
	}

}
