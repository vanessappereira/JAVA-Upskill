package Exercises;

import java.util.Scanner;

public class AWork4 {
	// 1. Show sum between 1 to 100 using while
	public static String sumWhile() {
		int sum = 0, i = 0;
		String result = "Sum of 1 to 100 is: ";
		while (i <= 100) {
			sum += i;
			i++;
		}
		return result + sum;
	}

	// 2. Show sum between 1 to 100 using for
	public static String sumFor() {
		int sum = 0, i = 0;
		String result = "Sum of 1 to 100 is: ";
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		return result + sum;
	}

	// 3. Create a function that returns the number of divisors of an integer n.
	// This function must iterate over the natural numbers up to n, counting the
	// numbers that are divisors of n.
	public static int divisors(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return count;
	}

	// 4. Create a function that returns the sum of the proper divisors of an
	// integer n (the set of divisors excludes itself number). This function must
	// iterate over the natural numbers until n (exclusive), accumulating the
	// numbers that are divisors of n.
	public static int sumDivisors() {
		int n, sum = 0, i = 1;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter a number: ");
		n = keyboard.nextInt();

		keyboard.close();

		while (i < n) {
			if (n % i == 0) {
				sum += i;
			}
			i++;
		}
		return sum;
	}

	// 5. Create a function that takes a natural number as an argument and returns
	// true if it is prime, or false otherwise.
	public static boolean isPrime() {
		int n;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter a number: ");
		n = keyboard.nextInt();

		keyboard.close();

		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	// 6. Create a function that allows you to know if there is a prime number in a
	// given (open) interval.
	public static boolean intervalPrime(int a, int b) {
		for (int i = a; i <= b; i++) {
			if (isPrime()) {
				return true;
			}
		}
		return false;
	}

	// 7. Construct a vector of natural numbers up to a given number n.
	public static int[] vectorNatural(int n) {
		int[] naturals = new int[n];
		for (int i = 0; i < naturals.length; i++) {
			naturals[i] = i + 1;
		}
		return naturals;
	}

	// 8. Construct a vector of random digits (numbers 0 to 9) given the length.
	public static int[] vectorRandom(int n) {
		int[] random = new int[n];
		for (int i = 0; i < random.length; i++) {
			random[i] = (int) (Math.random() * 10);
		}
		return random;
	}

	// 9. Construct a vector capable of storing 50 integers.
	// Then autofill it with the numbers 101 to 150, that is, in position number 0
	// it becomes 101, in position number 1 it becomes 102 and so on.
	public static int[] vectorIntegers() {
		int[] integers = new int[50];
		for (int i = 0; i < integers.length; i++) {
			integers[i] = i + 101;
		}
		return integers;
	}

	// 10. Copy (duplicate) a vector of integers, with the new vector having the
	// same size as the argument
	public static int[] duplicate(int[] v, int a) {
		int[] newInteger = new int[a];
		for (int i = 0; i < newInteger.length; i++) {
			if (i >= v.length) {
				newInteger[i] = 0;
			} else {
				newInteger[i] = v[i];
			}
		}
		return newInteger;
	}

	// 11. Count the number of occurrences of a given character.
	public static int countOccurrences() {
		int counter = 0;
		char ch;
		String str;
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter a string: ");
		str = keyboard.nextLine();

		System.out.println("Enter a character: ");
		ch = keyboard.next().charAt(0);

		keyboard.close();

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				counter++;
			}
		}
		return counter;
	}

	// 12. Construct a subvector of another vector, given the indices of the first
	// and last element to include. Example: subarry(2,4,{a,d,r,a,c,r,w})}->{r,a,c}
	public static String subarray() {
		int a, b;
		char[] v;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter a vector of characters: ");
		v = keyboard.next().toCharArray();
		
		System.out.println("Enter the first index: ");
		a = keyboard.nextInt();
		
		System.out.println("Enter the last index: ");
		b = keyboard.nextInt();
		
		keyboard.close();
		char[] newChar = new char[b - a + 1];

		for (int i = 0; i < newChar.length; i++) {
			newChar[i] = v[i + a];
		}
		return new String(newChar);
	}
}