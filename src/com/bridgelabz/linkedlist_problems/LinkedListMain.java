package com.bridgelabz.linkedlist_problems;

public class LinkedListMain {

	public static void main(String[] args) 
	{
		
		LinkedList<Integer> listInteger = new LinkedList<>();
		
		/**UC1&2
		 * Adding elements to linked list
		 */
		listInteger.add(70);
		listInteger.add(30);
		listInteger.add(56);

		//print linked list
		System.out.println("After adding elements to linked list: ");
		listInteger.print();
		
		/**UC3
		 * Appending elements to linked list
		 */
		LinkedList<Integer> listInteger1 = new LinkedList<>();
		listInteger1.append(56);
		listInteger1.append(30);
		listInteger1.append(70);
		
		//print linked list
		System.out.println("After appending elements to linked list: ");
		listInteger1.print();
	}
}
