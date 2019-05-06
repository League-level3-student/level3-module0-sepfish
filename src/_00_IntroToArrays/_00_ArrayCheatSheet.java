package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
			String[] names = new String[5];
			names[0] = "Lloyd";
			names[1] = "Colette";
			names[2] = "Raine";
			names[3] = "Genis";
			names[4] = "Sheena";
		//2. print the third element in the array
			System.out.println(names[2]);
		//3. set the third element to a different value
			names[2] = "Zelos";
		//4. print the third element again
			System.out.println(names[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
			for (int i = 0; i < 5; i++) {
				names[i] = "Jade Curtiss";
			}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
			for (int i = 0; i < names.length; i++) {
				System.out.println(names[i]);
			}
		//7. make an array of 50 integers
			int[] integers = new int[50];
		//8. use a for loop to make every value of the integer array a random number
			for (int i = 0; i < integers.length; i++) {
				Random rand = new Random();
				int random = rand.nextInt(50);
				integers[i] = random;
			}
		//9. without printing the entire array, print only the smallest number on the array
			int small = integers[0];
			for (int i = 0; i < integers.length; i++) {
				if (small > integers[i]) {
					small = integers[i];
				}
			}
			System.out.println("\nthe small boi is: " + small);
		//10 print the entire array to see if step 8 was correct
			System.out.println("\nhere is array: ");
			for (int i: integers) {
				System.out.print(i + ", ");
			}
			System.out.println("\n");
		//11. print the largest number in the array.
			int big = integers[0];
			for (int i = 0; i < integers.length; i++) {
				if (big < integers[i]) {
					big = integers[i];
				}
			}
			System.out.println("the big boi is: " + big);
		
		//12. print only the last element in the array
			System.out.println("\nthe last boi is: " + integers[integers.length - 1]);
	}
}
