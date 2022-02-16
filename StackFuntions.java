package com.stackproject;

import java.util.Scanner;
import java.util.Stack;

public class StackFuntions {

	public static void main(String[] args) {
		Stack<String> bookstack = new Stack<String>();
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements you want to stack: ");
		// reading the number of elements from the that we want to enter
		n = sc.nextInt();
		// creates an array in the memory of length
		String[] array = new String[n];
		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < n; i++) {
			// reading array elements from the user
			array[i] = sc.next();
			bookstack.push(array[i]);
		}
		System.out.println("Array elements are: ");
		// accessing array elements using the for loop
		for (int i = 0; i < n; i++) {
			System.out.println(array[i]);
		}


		System.out.println("Book Array: " + bookstack);
		System.out.println("No Of books : " + bookstack.size());
		System.out.println("GetBook using index: " + bookstack.get(1));
		System.out.println("Top1: " + bookstack.peek());
		System.out.println("Search the book:" + bookstack.search("python"));



		while (!bookstack.isEmpty()) {
			System.out.println("Pop Book:" + bookstack.pop());
		}

	}
}


