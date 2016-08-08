package com.zmags.javachallenge;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Created by karun on 21 Jul 2016
 */
public class TextFileAnalysisTest extends TestCase {

	@Test
	public void testWithFile() throws Exception {
		final String filePath = "C:/Users/karun/Desktop/text.txt";
		Map<String, Integer> map = TextFileAnalysis.sortData(filePath);
		assertNotNull(map);
		assertEquals(map.size(), 10);
		assertTrue(map.containsKey("your"));
	}

	@Test
	public void testData() throws Exception {
		final String filePath = "C:/Users/karun/Desktop/text1.txt";
		Map<String, Integer> map = TextFileAnalysis.sortData(filePath);
		System.out.println(map);
		assertNotNull(map);
		assertNotSame(map.size(), 10);
		assertTrue(map.containsKey("far"));
	}

	@Test
	public void testVerifyFile() {
		assertTrue(TextFileAnalysis.verifyFile("C:/Users/karun/Desktop/text.txt"));
		assertFalse(TextFileAnalysis.verifyFile("C:/Users/karun/Desktop/textiou.txt"));
	}

	@Test
	public void testSortOrder() {
		Map<String, Integer> unsortMap = new HashMap<>();
		unsortMap.put("a", 10);
		unsortMap.put("b", 5);
		unsortMap.put("d", 6);
		unsortMap.put("c", 1);
		unsortMap.put("e", 20);
		unsortMap.put("f", 9);
		unsortMap.put("g", 50);
		unsortMap.put("h", 60);
		unsortMap.put("i", 16);
		unsortMap.put("j", 22);
		unsortMap.put("k", 100);
		unsortMap.put("l", 54);
		unsortMap.put("m", 67);
		unsortMap.put("n", 17);

		final Map<String, Integer> sortedMap = TextFileAnalysis.sortMap(unsortMap);
		System.out.println("sortedMap = " + sortedMap);
		assertNotNull(sortedMap);
		assertEquals(sortedMap.size(), 10);
		assertTrue(sortedMap.entrySet().iterator().next().getKey().contains("k"));
		assertTrue(sortedMap.entrySet().iterator().next().getValue().equals(100));
	}

}
