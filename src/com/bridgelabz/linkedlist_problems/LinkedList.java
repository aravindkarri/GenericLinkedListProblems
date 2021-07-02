package com.bridgelabz.linkedlist_problems;

public class LinkedList<T extends Comparable<T>>
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
	 * Method to append new nodes to linkedlist
	 * @param data
	 */
	public void append(T data)
	{
		Node<T> newNode = new Node<T>();
		newNode.data = data;
		newNode.next = null;
		if (head == null)
		{
			head = newNode;
		}
		else 
		{
			Node<T> tempNode = head;
			while(tempNode.next != null)
			{
				tempNode = tempNode.next;
			}
			tempNode.next = newNode;
		}
	}
	/**
	 * Method to insert a node after given node
	 * @param prevNode
	 * @param data
	 */
	public void insertAfter(Node<T> prevNode, T data)
	{
		Node <T> newNode = new Node<T>();
		newNode.data = data;
		newNode.next = prevNode.next;
		prevNode.next = newNode;
	}
	/**
	 * Method to delete first node 
	 */
	public T pop()
	{
		if (head == null)
		{
			return null;
		}
		Node<T> tempNode = head;
		head = head.next;
		return tempNode.data;
	}
	/**
	 * Method to delete last node
	 */
	public T popLast()
	{
		Node<T> tempNode = head;
		while(tempNode.next.next!= null)
		{
			tempNode = tempNode.next;
		}
		tempNode.next = null;
		return tempNode.data;
	}
	/**
	 * Method to search for a key in linked list
	 * @param key
	 */
	public void search (T key)
	{
		Node<T> tempNode = head;
		while(tempNode != null)
		{
			if(tempNode.data == key)
			{
				System.out.println("Key found");
				break;
			}
			tempNode = tempNode.next;
		}
	}
	/**
	 * Method to search for a key and insert a new node after the key.
	 * @param key
	 * @param data
	 */
	public void insertAfterNode(T key,T data)
	{
		Node<T> newNode = new Node<T>();
		newNode.data = data;
		Node<T> tempNode = head;
		while(tempNode.data != key)
		{
			tempNode = tempNode.next;
		}
		newNode.next = tempNode.next;
		tempNode.next = newNode;
	}
	/**
	 * Method to delete a node in linked list
	 * @param key
	 */
	
	public void deleteNode(T key)
	{
		Node<T> tempNode = head;
		Node<T> prevNode = head;
		while(tempNode.data != key)
		{
			prevNode = tempNode;
			tempNode = tempNode.next;
		}
		prevNode.next = tempNode.next;
	}
	/**
	 * Method to calculate count of nodes in linked list
	 */
	public void size()
	{
		Node<T> tempNode = head;
		int count = 0;
		while (tempNode != null)
		{
			count++;
			tempNode = tempNode.next;
		}
		System.out.println("Size of the linked list is: "+count);
	}
	public void sortList()
	{
		Node<T> current= head;
		Node<T> index = null;
		T temp;
		if (head == null)
		{
			return;
		}
		else
		{
			while(current != null)
			{
				index = current.next;
				while(index != null)
				{
					if((current.data).compareTo(index.data) > 0)
					{
						temp = current.data;
						current.data = index.data;
						index.data = temp;
					}
					index = index.next;
				}
				current = current.next;				
			}
		}
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
