package br.com.anagram.generator;

import br.com.anagram.generator.utils.AnagramUtils;

import java.util.Set;

public class Main {
	public static void main(String[] args) {
		if(args.length != 1) {
			throw new IllegalArgumentException("Single text parameter required!");
		}
		String input = args[0];
		Set<String> result = AnagramUtils.generate(input);
		String resultDisplayText = String.join("\n", result);
		System.out.println(resultDisplayText);
	}
}