package br.certification.operators.oo.queue;

import java.util.PriorityQueue;
import java.util.Queue;

import br.certification.operators.oo.Product;



public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();

		queue.offer(2);
		queue.offer(8);
		queue.offer(3);
		queue.offer(1);
		queue.offer(10);

		System.out.println("Get head of the queue and remove element: " 
								+ queue.poll());

		System.out.println("Size of the queue after poll(): " 
								+ queue.size());
		
		System.out.println("peek(): " + queue.peek());
		
		System.out.println("Size of the queue after peek(): " 
								+ queue.size());
		
		
		// This example throws ClassCastException
//		Queue<Product> products = new PriorityQueue<>();
//		products.offer(new DefaultProduct());
		
		Queue<Product> products = 
					new PriorityQueue(new CustomProductComparator());
		products.offer(new Product());
	}

}
