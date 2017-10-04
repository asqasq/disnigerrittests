package com.ibm.disni.tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BasicTest {
	int value;
	@BeforeEach
	public void init() {
		value = 3;
	}
	@AfterEach
	public void destroy() {
	}
	

	@Test
	public void testGetBuffer() {
		//assertEquals(value, 3);
	}

}
