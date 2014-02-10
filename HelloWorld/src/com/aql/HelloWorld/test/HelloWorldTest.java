package com.aql.HelloWorld.test;

import junit.framework.Assert;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void test() {
		assertEquals(1, 1);
		assertThat("Case 1: ",1,is(2));
		
	}

}
