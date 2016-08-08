package com.zmags.javachallenge;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by karun on 21 Jul 2016
 */
public class TextFileAnalysis {

	static final int size = 10;

	public static Map<String, Integer> sortData(String filePath) throws IOException {
		Map<String, Integer> result = new LinkedHashMap<String, Integer>();

		// Verify file Exists and it's extension
		if (verifyFile(filePath)) {
			// Reading data from the file
			HashMap<String, Integer> hashMap = readData(filePath);
			if (!hashMap.isEmpty()) {
				// Sorting the data
				result = sortMap(hashMap);
			}
		}
		return result;
	}

	/**
	 * @param filePath
	 */
	// Verify file Exists and it's extension
	public static boolean verifyFile(String filePath) {
		boolean verify = false;
		File file = new File(filePath);
		if (file.exists() && !file.isDirectory()) {
			int index = file.getAbsolutePath().lastIndexOf('.');
			if (index == -1) {
				System.err.print("File doesn't exists. Please enter valid file.");
			} else {
				if (filePath.substring(index + 1).equals("txt") || filePath.substring(index + 1).equals("doc") || filePath.substring(index + 1).equals("pdf")) {
					verify = true;
				} else {
					System.err.print("Please enter valid file. e.g .txt, .doc or .pdf for English text");
				}
			}
		}
		return verify;
	}

	/**
	 * @param filePath
	 * @param hashMap
	 * @throws IOException
	 */
	// Reading data from the file
	public static HashMap<String, Integer> readData(String filePath) throws IOException {
		HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
		String newLine;
		BufferedReader bufReader = null;
		FileInputStream inputFile = null;
		try {
			inputFile = new FileInputStream(filePath);
			bufReader = new BufferedReader(new InputStreamReader(inputFile, "UTF-8"));
			while ((newLine = bufReader.readLine()) != null) {
				if (!newLine.isEmpty()) {
					String[] wordsArray = newLine.split("[^a-zA-Z0-9']+");
					for (String aWordsArray : wordsArray) {
						if (aWordsArray.trim().length() > 0) {
							if (hashMap.containsKey(aWordsArray)) {
								int wordCount = hashMap.get(aWordsArray);
								hashMap.put(aWordsArray, (wordCount + 1));
							} else
								hashMap.put(aWordsArray, 1);
						}
					}
				}
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		} finally {
			if (bufReader != null)
				bufReader.close();
			if (inputFile != null)
				inputFile.close();
		}
		return hashMap;
	}

	// Sorting the data
	public static Map<String, Integer> sortMap(Map<String, Integer> unsortMap) {

		// Map to List conversion
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(unsortMap.entrySet());

		// Sort list with comparator and compare the Map values
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> orderOne, Map.Entry<String, Integer> orderTwo) {
				return (orderTwo.getValue()).compareTo(orderOne.getValue());
			}
		});

		// Convert sorted map to a Map
		Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
		int count = 0;

		for (Iterator<Map.Entry<String, Integer>> it = list.iterator(); it.hasNext();) {
			if (count < size) {
				Map.Entry<String, Integer> entry = it.next();
				sortedMap.put(entry.getKey(), entry.getValue());
				count++;
			} else {
				break;
			}
		}
		return sortedMap;
	}
}
