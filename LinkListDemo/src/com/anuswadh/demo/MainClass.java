/**
 * 
 */
package com.anuswadh.demo;

/**
 * @author Anuswadh
 *
 */
public class MainClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		LinkedListRunner llr = new LinkedListRunner();
		
		llr.printList();
		
		llr.addNode(1);
		llr.addNode(2);
		llr.addNode(3);
		llr.addNode(4);
		llr.addNode(4);
		llr.addNode(6);
		llr.addNode(2);
		llr.addNode(4);
		llr.addNode(7);
		llr.addNode(3);
		llr.addNode(1);
		
		llr.printList();

		llr.removeTail();
		
		llr.printList();

		llr.removeTail();
		
		llr.printList();

		llr.deleteAllGreate(4);
		
		llr.printList();
		
		llr.deleteAllGreate(0);
		
		llr.printList();
	}

}
