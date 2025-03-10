package QueueEx;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority_QueueEx {

	public static void main(String[] args) {
		
		PriorityQueue<String> queue = new PriorityQueue<String>();
		queue.add("Smith");
		queue.add("John");
		queue.add("Amith");
		queue.add("Anna");
		
		System.out.println(queue);
		System.out.println("=========");
		System.out.println(queue.element());
		System.out.println("=========");
		System.out.println(queue.peek());
		System.out.println("=========");
		
		Iterator<String> itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("=========");
		
		System.out.println(queue.remove());
		System.out.println(queue.poll());
	}

}
