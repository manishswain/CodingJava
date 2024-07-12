package Test;

import java.util.*;

public class Solution13 {
	public static void main(String[] args) {
		System.out.println("Enter the flight name");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int tClass = 0;
		int bClass = 0;
		int eClass = 0;
		double cardP = 0;
		double bill = 0;
		switch (s) {
			case "Air India":
				tClass = 3200;
				eClass = 6950;
				bClass = 10340;
				cardP = 10.5;
				break;
			case "Spice Jet":
				tClass = 3450;
				eClass = 7945;
				bClass = 9500;
				cardP = 7.5;
				break;
			case "Go Air":
				tClass = 3300;
				eClass = 7250;
				bClass = 9890;
				cardP = 9.5;
				break;
			case "Indigo":
				tClass = 3490;
				eClass = 7650;
				bClass = 9990;
				cardP = 8.5;
				break;
			default:
				System.out.println("Invalid data");
		}
		System.out.println("Enter the class:");
		String cl = sc.nextLine();
		System.out.println(cl);
		System.out.println("Enter the number of seats:");
		int no = sc.nextInt();
		System.out.println("Card Payment:");
		String cp = sc.next();
		int fclass = 0;
		switch (cl) {
			case "Travel class": {
				fclass = tClass;
				break;
			}
			case "Business class": {
				fclass = bClass;
				break;
			}
			case "Economic class": {
				fclass = eClass;
				break;
			}
		}
		if (cp.equals("Y")) {
			bill = (fclass * no) - (fclass * no * (cardP / 100));
		} else
			bill = fclass * no;
		System.out.println(bill);
	}
}