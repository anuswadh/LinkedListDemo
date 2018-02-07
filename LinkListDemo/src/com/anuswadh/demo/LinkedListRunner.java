package com.anuswadh.demo;

public class LinkedListRunner {

	private Node head;
	
	
	
	

	public LinkedListRunner() {
		
		this.head = null;
	}

	public LinkedListRunner(Node head) {
		this.head = null;
	}

	public Node addNode(int value) {
		
		Node temp,p;
		
		temp = new Node(value);
		
		if((head == null)) {
			head = temp;
		}else {
			p = head;
			while(p.hasNext()) {
				p = p.getNext();
			}
			p.setNext(temp);
		}
		
		return head;
		
	}//addNode
	
	public void printList() {
		Node t = null;
		System.out.print("Linked List : ");
		if (head != null) {
			t = head;
			while (t.hasNext()) {
				System.out.print(t);
				t = t.getNext();
			} 
			System.out.print(t);
		}
		System.out.println();
	}//printList
	
	public Node removeTail(){
		
		Node t = null, t1;
		if (head != null) {
			t = head;
			while (t.hasNext()) {
				t1 = t.getNext();
				if (!(t1.hasNext())) {
					break;
				} else {
					t = t.getNext();
				}
			} 
			t.deleteNext();
		}
		return head;
	}//removeTail
	
	
	public Node deleteAllGreate(int value) {
		Node t,t1;
		if (head != null) {
			t = head;
			while(t.hasNext()) {
				t1=t.getNext();
				if(t1.getValue() > value) {
					t.setNext(t1.getNext());
				}else {
					t=t.getNext();
				}
			}
			if(head.getValue() > value) {
				if(head.hasNext() ) {
					head = head.getNext();
				}else {
					head = null;
				}
			}
		}
		
		return head;
	}//deleteAll
}
