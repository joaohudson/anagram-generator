package br.com.anagram.generator.utils;

import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

class AnagramUtilsTest {

	@Test
	void shouldGenerateAnagramsWithSimpleText() {
		Set<String> anagrams = AnagramUtils.generate("abc");
		assertThat(anagrams)
				.hasSize(6)
				.contains("abc", "bca", "cba", "acb", "cab", "bac");
	}

	@Test
	void shouldGenerateAnagramsWithPalindrome() {
		Set<String> anagrams = AnagramUtils.generate("ovo");
		assertThat(anagrams)
				.hasSize(3)
				.contains("ovo", "voo", "oov");
	}

	@Test
	void shouldNoGenerateAnagramsWithEmptyInput() {
		Set<String> anagrams = AnagramUtils.generate("");
		assertThat(anagrams).isEmpty();
	}
}