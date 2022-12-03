package week03Assignments;

import java.util.Arrays;

public class ArraysAndMethods {
	public static void main(String[] args) {
			
	int [] ages = {3,9, 23, 64, 2, 8, 28, 93, 103}; 
	System.out.println(ages[0] - ages[ages.length - 1]);
	
	int sum = 0;
	for (int age : ages) {
		sum += age;
	}
	int average = sum / ages.length;
	System.out.println("The average of all the ages is " + average);
	
	//////////////////////////////////////////////////////////////////////////////////////////////
	
	String [] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
	
	int sumNames = 0;
	for (String name : names) {
		sumNames += name.length();
	}
	int averageLettersInNames = sumNames / names.length; 
	System.out.println("The average number of letters in the names is "  + averageLettersInNames);
	
	for (int i = 0; i < names.length; i++) {
		System.out.print(names[i] + " ");
	}
//To access the last element of ant array, you type out ex array[array.length - 1];
	System.out.println();
	System.out.println(names[names.length - 1]);
//To access the first element of any array you just need to print array[0], because 0 is always first
	System.out.println(names[0]);
	System.out.println(" ");
	
	
	
	////////////////////////////////////////////////////////////////////////////////////////////////
	//System.out.println("Problem number 5: ");
	

int [] nameLengths = new int[names.length]; 

for(int n = 0; n < names.length; n++) {
	nameLengths[n] = names[n].length();
}

	System.out.println(Arrays.toString(nameLengths));
	
	int sumOfLengths = 0;
	for (int len : nameLengths) {
		sumOfLengths += len; 
	}
	System.out.println(sumOfLengths);
	/////////////////////////////////////////////////////////////////////////////////////////////////
	//System.out.println("methods");
	System.out.println(" ");
	
	
	
	
	System.out.println(repeteWord("Meow", 3)); 
	
	System.out.println(fullName("Strider", "Meow"));
	
	int [] numbers = {54, 13, 46,99};
	int [] otherNums = {5, 8, 9};
	
	System.out.println(greaterThanHundred(numbers));
	System.out.println(greaterThanHundred(otherNums));
	
	double [] decimals = {12.54, 56.99, 23.56};
	System.out.println(averageOfDouble(decimals));
	
double [] decimalTwo = {89.97, 3.43, 5.43}; 
	System.out.println(oneGreaterThanTwo(decimals, decimalTwo));
	
	System.out.println(willBuyDrink(true, 43.56));
	
	System.out.println(buyCatFood(8, "Friday"));
	
	
	
	}
	public static String repeteWord (String word, int n) {
		String str = " ";
		for(int i = 0; i < n; i++) {
			str += word + " "; 
		}
		return str; 
	}
	
	public static String fullName (String nameF, String nameL) {
		 String fullName = nameF +" " + nameL; 
		 return fullName; 
	}
	public static boolean greaterThanHundred (int[] nums) {
		int sums = 0;
		for (int num : nums) {
			sums += num; 
		}
		if (sums > 100) {
			return true; 
		}else {
			return false; 
		}
	}
	public static double averageOfDouble (double[] nums) {
		double sum = 0;
		for(double num : nums) {
			sum += num; 
		}
		double average = sum / nums.length; 
		return average; 
	}
	
	public static boolean oneGreaterThanTwo(double[] ones, double[] twos) {
		double sumOne = 0;
		double sumTwo = 0; 
		
		for (double one : ones) {
			sumOne += one;
		}
		for(double two : twos) {
			sumTwo += two; 
		}
		double averageOne = sumOne / ones.length;
		double averageTwo = sumTwo / twos.length;
	if(averageOne > averageTwo) {
		return true;
	}else {
		return false;
	}
		
	}
	
	public static boolean willBuyDrink (boolean isHot, double money) {
		if(isHot = true && money > 10.50) {
			return true;
		}else {
			return false;
		}
	}
	public static boolean buyCatFood (int servingsLeft, String dayOfWeek) {
		if (servingsLeft < 10 && dayOfWeek == "Thursday") {
			return true;
		}
		else {
			return false; 
		}
			
	}/////////This method is to determine weather or not I need cat food, my cat food last about a month, if it thursday(payday) and I'm low, I need more food
	
	
	
}

