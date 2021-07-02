package com.bridgelabz.linkedlist_problems;

public class LinkedList<T>
{
	Node<T> head;

	/**
	 * Method to add new nodes to linkedlist
	 * @param data
	 */
	public void add(T data)
	{
		Node<T> newNode = new Node<T>();
		newNode.data = data;
		newNode.next = null;
		newNode.next = head;
		head = newNode;
	}
	/**
	 * Method to print linkedlist
	 */
	public void print()
	{
		Node<T> tempNode = head;
		while(tempNode != null)
		{
			System.out.println(tempNode.data);
			tempNode = tempNode.next;
		}
	}
}
