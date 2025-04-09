package br.com.anagram.generator;

import br.com.anagram.generator.utils.AnagramUtils;

import java.util.Scanner;
import java.util.Set;

import static br.com.anagram.generator.constants.PatternConstantes.ONLY_LETTERS;

public class Main {
	public static void main(String[] args) {
		System.out.println("Enter a text containing letters only to generate the permutations:");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		if(!ONLY_LETTERS.matcher(input).matches()) {
			System.err.println("You must provide a non-empty text containing letters only.");
			return;
		}
		Set<String> result = AnagramUtils.generate(input);
		String resultDisplayText = String.join("\n", result);
		System.out.println(resultDisplayText);
	}
}