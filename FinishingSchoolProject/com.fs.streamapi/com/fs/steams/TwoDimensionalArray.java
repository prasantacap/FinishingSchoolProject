package com.fs.steams;

import java.util.Arrays;

public class TwoDimensionalArray {

	public static int getResult(int a[][]) {

		return (int) Arrays.stream(a).count();

	}

	public static void main(String[] args) {

		int[][] numbers = { { 10, 50 }, { 33, 44 }, { 55, 66 } };

		getResult(numbers);

		System.out.println("count" + getResult(numbers));

	}

}
