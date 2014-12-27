package com.mindReading.main;

import java.util.ArrayList;

import com.mindReading.helper.GameHelper;
import com.mindReading.model.Card;

/**
 * Main class
 * @author bVaisakh
 * @email vaisakhb12@gmail.com
 * @since 27-Dec-2014
 */
public class MindReader {
	
	public static void main (String[] args) {
		
		/* Creates object of helper class */
		GameHelper helper = new GameHelper();
		
		/* Creates 21 cards and shows it */
		ArrayList<Card> cardSet = helper.createCards();
		helper.showInSets(cardSet);
		
		/* Takes set containing user guessed card and reorders set according to it */
		for (int i = 0; i < 2; i++) {
			cardSet = helper.split(cardSet, helper.userInput());
			helper.showInSets(cardSet);
		}
		
		/* Finds out the card */
		int position = helper.userInput();
		cardSet = helper.split(cardSet, position);
		System.out.println("The result is : " + cardSet.get(10).getSign() + " " + cardSet.get(10).getNumber());

	}
}
