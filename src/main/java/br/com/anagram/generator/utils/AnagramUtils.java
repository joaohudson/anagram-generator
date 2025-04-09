package br.com.anagram.generator.utils;

import lombok.experimental.UtilityClass;

import java.util.HashSet;
import java.util.Set;

@UtilityClass
public class AnagramUtils {

	public static Set<String> generate(String text) {
		return generate(text.toCharArray(), 0);
	}

	private static Set<String> generate(char[] text, int start) {
		Set<String> result = new HashSet<>();

		if (start == text.length - 1) {
			result.add(new String(text));
			return result;
		}

		for (int i = start; i < text.length; i++) {
			ArrayUtils.swap(text, start, i);
			result.addAll(generate(text, start + 1));
			ArrayUtils.swap(text, start, i);
		}

		return result;
	}
}
