package com.fs.steams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraySteams {

	public static void main(String[] args) {

		int a[] = { 22, 33, 44, 55, 66, 77, 88, 99 };

		// Sum
		System.out.println("Sum is " + IntStream.of(a).sum());

		// Each element print
		Arrays.stream(a).forEach(str -> System.out.print(str + " "));

		// Array to List
		int numbers[] = { 1, 2, 3, 4, 5 };
		// 1st approach
		System.out.println(Arrays.stream(numbers).boxed().collect(Collectors.toList()));
		// 2nd approach
		System.out.println(IntStream.of(numbers).boxed().collect(Collectors.toList()));

		// List to Array
		List<Integer> convertedList = Arrays.stream(numbers).boxed().collect(Collectors.toList());

		int convertedArray[] = convertedList.stream().mapToInt(i -> i).toArray();
		for (int i : convertedArray) {

			System.out.println(i);
		}

		// Remove Duplicates
		List<Integer> listWithDuplicates = new ArrayList<Integer>();
		listWithDuplicates.add(10);
		listWithDuplicates.add(10);
		listWithDuplicates.add(20);
		listWithDuplicates.add(30);
		listWithDuplicates.add(20);
		listWithDuplicates.add(10);
		listWithDuplicates.add(30);
		List<Integer> listWithoutDuplicates = listWithDuplicates.stream().distinct().collect(Collectors.toList());

		for (int i : listWithDuplicates) {

			System.out.println(listWithoutDuplicates);
		}

	}
}
