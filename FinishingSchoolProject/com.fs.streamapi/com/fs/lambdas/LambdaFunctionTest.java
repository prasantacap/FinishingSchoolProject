package com.fs.lambdas;

import org.junit.Assert;
import org.junit.Test;

public class LambdaFunctionTest {

	@Test
	public void showTest() {

		Display display = () -> {
			return "Capgemini";

		};

		String s = display.show();
		Assert.assertEquals("Capgemini", s);
	}

}
