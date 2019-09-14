package com.myapp.appassembler;

import java.util.LinkedHashMap;

import com.myapp.appassembler.challenge.FindTwoNumbersSumOfTarget;
import com.myapp.appassembler.challenge.CountWordsInString;
import org.apache.log4j.Logger;

public class App {

	final static Logger logger = Logger.getLogger(App.class);
	public static void main(String[] args) {
		


		CountWordsInString sortStringToken = new CountWordsInString();
		LinkedHashMap<String, Integer> linkedHashMap = sortStringToken.sort("This is Thao and This is Thy");

		// challenge 1
		for (String key : linkedHashMap.keySet()) {
			System.out.println(key + "\t" + linkedHashMap.get(key));
		}

		// challenge 2

		FindTwoNumbersSumOfTarget findTwoNumbersSumOfTarget = new FindTwoNumbersSumOfTarget();
		int[] numbers = {3, 5, 4, 7};
		int[] foundThem = findTwoNumbersSumOfTarget.findThem(numbers, 7);
		System.out.println(foundThem[0] + " and " + foundThem[1]);



	}

}
