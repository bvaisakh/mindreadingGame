package com.mindReading.model;

public class Card {

	private int number;
	private int sign;

	public String getNumber() {
		String result;
		switch (this.number) {
		case 0:
			result = "A";
			break;
		case 1:
			result = "2";
			break;
		case 2:
			result = "3";
			break;
		case 3:
			result = "4";
			break;
		case 4:
			result = "5";
			break;
		case 5:
			result = "6";
			break;
		case 6:
			result = "7";
			break;
		case 7:
			result = "8";
			break;
		case 8:
			result = "9";
			break;
		case 9:
			result = "10";
			break;
		case 10:
			result = "J";
			break;
		case 11:
			result = "Q";
			break;
		case 12:
			result = "K";
			break;
		default:
			result = "ERROR";
			break;
		}
		return result;
	}
	public void setNumber(int number) {
		if (number >= 0 && number < 13) {
			this.number = number;
		}
	}

	public String getSign() {
		String result;
		switch (this.sign) {
		case 0:
			result = "Spade  ";
			break;
		case 1:
			result = "Diamond";
			break;
		case 2:
			result = "Heart  ";
			break;
		case 3:
			result = "Club   ";
			break;

		default:
			result = "ERROR";
			break;
		}
		return result;
	}
	public void setSign(int sign) {
		if (sign >= 0 && sign < 4) {
			this.sign = sign;
		}
	}

	public Card(int number, int sign) {
		this.number = number;
		this.sign = sign;
	}
}
