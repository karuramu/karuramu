package com.test.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MyMathtest {

	@Test
public 	void test() {
		MyMath myMath =new MyMath();
		int result = myMath.sum(new int[] {1,2,3});
		assertEquals(6,result);
	}

}
