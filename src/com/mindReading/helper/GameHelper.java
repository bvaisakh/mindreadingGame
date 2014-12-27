package com.mindReading.helper;

import java.util.ArrayList;
import java.util.Scanner;

import com.mindReading.model.Card;

/**
 * Class contains helper methods
 * 
 * @author bVaisakh
 * @email vaisakhb12@gmail.com
 * @since 27-Dec-2014
 */
public class GameHelper {

	/**
	 * creates 21 cards
	 * 
	 * @return ArrayList This holds 21 Cards.
	 */
	public ArrayList<Card> createCards() {
		ArrayList<Card> wholeCards = new ArrayList<>();
		int number = (int) (Math.random() * 12);
		int sign = (int) (Math.random() * 3);
		for (int i = 0; i < 21; i++) {
			if (number > 12) {
				number = 0;
			}
			if (sign > 3) {
				sign = 0;
			}
			wholeCards.add(new Card(number, sign));
			number++;
			sign++;
		}
		return wholeCards;
	}

	/**
	 * Reorders Card according to Set Number
	 * 
	 * @param ArrayList
	 *            This is reordered according to the setNumber
	 * @param int Corresponding to setNumber
	 * @return ArrayList This holds reordered Cards.
	 */
	public ArrayList<Card> split(ArrayList<Card> wholeCards, int setNumber) {
		ArrayList<Card> result = new ArrayList<Card>();
		int i = 0;
		if (setNumber == 1) {
			while (i < 21) {
				if (i % 3 == 2)
					result.add(wholeCards.get(i));
				i++;
			}
			i = 0;
			while (i < 21) {
				if (i % 3 == 0)
					result.add(wholeCards.get(i));
				i++;
			}
			i = 0;
			while (i < 21) {
				if (i % 3 == 1)
					result.add(wholeCards.get(i));
				i++;
			}
		}
		if (setNumber == 2) {
			while (i < 21) {
				if (i % 3 == 0)
					result.add(wholeCards.get(i));
				i++;
			}
			i = 0;
			while (i < 21) {
				if (i % 3 == 1)
					result.add(wholeCards.get(i));
				i++;
			}
			i = 0;
			while (i < 21) {
				if (i % 3 == 2)
					result.add(wholeCards.get(i));
				i++;
			}
		}
		if (setNumber == 3) {
			while (i < 21) {
				if (i % 3 == 1)
					result.add(wholeCards.get(i));
				i++;
			}
			i = 0;
			while (i < 21) {
				if (i % 3 == 2)
					result.add(wholeCards.get(i));
				i++;
			}
			i = 0;
			while (i < 21) {
				if (i % 3 == 0)
					result.add(wholeCards.get(i));
				i++;
			}
		}
		return result;
	}

	/**
	 * Method to show cards in set
	 * 
	 * @param wholeCards
	 *            It contains whole cards
	 */
	public void showInSets(ArrayList<Card> wholeCards) {
		int i = 1;
		System.out.println();
		System.out.println("\t---------\t\t---------\t\t---------");
		System.out.println("\t SET : 1 \t\t SET : 2 \t\t SET : 3");
		System.out.println("\t---------\t\t---------\t\t---------");
		for (Card card : wholeCards) {
			System.out.print("\t"+card.getSign() + " " + card.getNumber() + "\t");
			if (i % 3 == 0) {
				System.out.println();
			}
			i++;
		}
	}

	/**
	 * To take user input
	 * 
	 * @return int takes the set number containing guessed Card
	 */
	public int userInput() {
		System.out.println();
		System.out.println();
		System.out.println("Enter the set number containing Guessed card: ");
		Scanner in = new Scanner(System.in);
		int setNumber = in.nextInt();
		if (setNumber < 1 || setNumber > 3) {
			System.out.println("Invalid input, run again");
		}
		return setNumber;
	}
}
