package com.bridgelabz.linkedlist_problems;

public class LinkedListMain 
{

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
		
		/**UC4
		 * Inserting a new node 30 between 56 and 70.
		 */
		LinkedList<Integer> listInteger2 = new LinkedList<>();
		listInteger2.append(56);
		listInteger2.append(70);
		listInteger2.insertAfter(listInteger2.head,30);
		
		//print linked list
		System.out.println("After inserting 30 between 56 and 70 : ");
		listInteger2.print();
		
		/**UC5
		 * Delete the first element in linked list
		 */
		LinkedList<Integer> listInteger3 = new LinkedList<>();
		listInteger3.append(56);
		listInteger3.append(30);
		listInteger3.append(70);
		listInteger3.pop();
		
		//print linked list
		System.out.println("After removing the first element: ");
		listInteger3.print();
		
		/**UC6
		 * Delete the last element of linked list
		 */
		LinkedList<Integer> listInteger4 = new LinkedList<>();
		listInteger4.append(56);
		listInteger4.append(30);
		listInteger4.append(70);
		listInteger4.popLast();
		
		//print linked list
		System.out.println("After removing the last element : ");
		listInteger4.print();
		
	}
}
