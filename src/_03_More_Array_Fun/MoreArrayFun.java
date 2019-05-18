package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
		public static void main(String[] args) {
			String[] strings = new String[6];
			strings[0] = "Luke";
			strings[1] = "Tear";
			strings[2] = "Jade";
			strings[3] = "Anise";
			strings[4] = "Natalia";
			strings[5] = "Guy";
			
		printRandom(strings);
		}
	
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
		static void printAll(String[] str) {
			for (int i = 0; i < str.length; i++) {
				System.out.println(str[i]);
			}
		}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
		static void printAllRev(String[] str) {
			for (int i = 0; i < str.length; i++) {
				System.out.println(str[str.length - i - 1]);
			}
		}
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
		static void printEveryOther(String[] str) {
			for (int i = 0; i < str.length; i++) {
				if (i % 2 == 1) {
					System.out.println(str[i]);
				}
			}
		}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
		static void printRandom(String[] str) {
			boolean blns[] = new boolean[str.length];
			for (int j = 0; j < str.length; j++) {
				blns[j] = false;
			}
			
			//this is switching everything back to false :(
			for (int i = 0; i < str.length; i++) {
				if (!blns[i]) {
					Random random = new Random();
					int rand = random.nextInt(str.length);
					System.out.println(str[rand]);
					System.out.println(blns[i]);
				}
				blns[i] = true;
			}
		}
	
	
}
