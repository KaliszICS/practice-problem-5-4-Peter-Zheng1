/**

        * File: Lesson 5.4

        * Author: Peter

        * Date Created: May 10, 2026

        * Date Last Modified: May 10, 2026

        */

public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void stringSwap(String[] array, int num1, int num2){
		String temp = array[num1];
		array[num1] = array[num2];
		array[num2] = temp;
	}

	public static void reverse (int[] array){
		for (int i = 0; i < array.length /2; i++){
			int temp = array[i];
			array[i] = array[array.length -1 -i];
			array[array.length -1 - i] = temp;
		}
	}

	public static String[] toWordArray(String line){
		String[] firstSplit = line.split(" ");

		int counter = 0;
		for (int i = 0; i < firstSplit.length; i++){
			if (firstSplit[i].length() > 0){
				counter++;
			}
		}
				String[] words = new String[counter];

			int index = 0;
			for (int i = 0; i < firstSplit.length; i++){
				if (firstSplit[i].length() > 0){
					words[index] = firstSplit[i];
					index++;
				}
			}
		return words;
	}

}
