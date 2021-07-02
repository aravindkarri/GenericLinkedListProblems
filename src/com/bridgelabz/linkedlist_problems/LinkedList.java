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
