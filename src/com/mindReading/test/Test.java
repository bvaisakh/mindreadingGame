package com.mindReading.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.mindReading.helper.GameHelper;
import com.mindReading.model.Card;

public class Test {

	public static void main(String[] args) {

		 GameHelper helper = new GameHelper();

		// System.out.println(helper.userInput());

		 ArrayList<Card> cardSet = helper.createCards();
		 helper.showInSets(cardSet);
		 cardSet = helper.split(cardSet, helper.userInput());
		 helper.showInSets(cardSet);
		// for (int i = 0; i < 2; i++) {
		// cardSet = helper.split(cardSet, helper.userInput());
		// helper.showInSets(cardSet);
		// }

//		 cardSet = helper.split(cardSet, 1);		 
//		 helper.showInSets(cardSet);

		// int position = (helper.userInput()- 1 * 0) + 3;
		// System.out.println("The result is : " +
		// cardSet.get(position).getSign() + " " +
		// cardSet.get(position).getNumber());
		// int setNumber = 1;
		// int[] set = { 0, 7, 14};
		// if (setNumber == 1) {
		// set[0] = 7;
		// set[1] = 0;
		// set[2] = 14;
		// } else if (setNumber == 2) {
		// set[0] = 0;
		// set[1] = 7;
		// set[2] = 14;
		// }
		// if (setNumber == 3) {
		// set[0] = 0;
		// set[1] = 14;
		// set[2] = 7;
		// }
		// for (int j = 0; j < 7; j++) {
		// System.out.println(set[0]++);
		// System.out.println(set[1]++);
		// System.out.println(set[2]++);
		//
		// }

//		int i = 0;
//		while (i < 21) {
//			if (i % 3 == 0)
//				System.out.println(i);
//			i++;
//		}
//		i = 0;
//		while (i < 21) {
//			if (i % 3 == 1)
//				System.out.println(i);
//			i++;
//		}
//		i = 0;
//		while (i < 21) {
//			if (i % 3 == 2)
//				System.out.println(i);
//			i++;
//		}
	}

}
