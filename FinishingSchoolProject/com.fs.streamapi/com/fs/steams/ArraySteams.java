package com.fs.steams;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArraySteams {

	public static void main(String[] args) {

		int a[] = { 22, 33, 44, 55, 66, 77, 88, 99 };

		System.out.println("Sum is " + IntStream.of(a).sum());

		Arrays.stream(a).forEach(str -> System.out.print(str + " "));

	}
}
