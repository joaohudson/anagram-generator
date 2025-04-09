package br.com.anagram.generator.utils;

import lombok.experimental.UtilityClass;

@UtilityClass
public class ArrayUtils {

	public static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
