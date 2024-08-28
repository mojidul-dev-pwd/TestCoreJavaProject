package com.mt.test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;

public class CollectionJavaExample {
	
	public static void main(String[] args) {
		System.out.println("-----------ArrayList");
		//ArrayList<int> myNumbers = new ArrayList<int>(); // Invalid
		//ArrayList<Integer> myNumbers = new ArrayList<Integer>(); // Valid
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("Mojidul");//Adding object in arraylist  
		list.add("Sharmin");  
		list.add("Nayeem");  
		list.add("Fatima-Tuz-Zuhra");  
		//Traversing list through Iterator
		Iterator itr = list.iterator();
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}
		System.out.println("------------LinkedList");
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Mojidul");  
		al.add("Sharmin");  
		al.add("Nayeem");  
		al.add("Fatima-Tuz-Zuhra");  
		Iterator<String> litr=al.iterator();  
		while(litr.hasNext()){  
			System.out.println(litr.next());  
		}
		System.out.println("------------Vector");
		Vector<String> v=new Vector<String>();  
		v.add("Mojidul");  
		v.add("Sharmin");  
		v.add("Nayeem");  
		v.add("Fatima-Tuz-Zuhra");  
		Iterator<String> vitr=v.iterator();  
		while(vitr.hasNext()){  
		 System.out.println(vitr.next());  
		}	
		
		System.out.println("------------Stack");
		//It implements the last-in-first-out data structure
		Stack<String> stack = new Stack<String>();  
		stack.add("Mojidul");  
		stack.add("Sharmin");  
		stack.add("Nayeem");  
		stack.add("Fatima-Tuz-Zuhra");
		stack.add("Rafi");
		stack.pop();  
		Iterator<String> sitr=stack.iterator();  
		while(sitr.hasNext()){  
		 System.out.println(sitr.next());  
		}
		
		System.out.println("------------PriorityQueue");
		//Queue interface maintains the first-in-first-out order
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Mojidul");  
		queue.add("Sharmin");  
		queue.add("Nayeem");  
		queue.add("Fatima-Tuz-Zuhra");
		queue.add("Rafi");
		System.out.println("head:"+queue.element());
		System.out.println("head:"+queue.peek());
		System.out.println("iterating the queue elements:");  
		Iterator qitr=queue.iterator();  
		while(qitr.hasNext()){  
			System.out.println(qitr.next());  
		}
		queue.remove();
		
		System.out.println("after removing two elements:");  
		Iterator<String> qitr2=queue.iterator();  
		while(qitr2.hasNext()){  
			System.out.println(qitr2.next());  
		}  
		
		System.out.println("------------Deque");
		//Creating Deque and adding elements  
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Mojidul");  
		deque.add("Sharmin");  
		deque.add("Nayeem");  
		deque.add("Fatima-Tuz-Zuhra");
		deque.add("Rafi");
		//Traversing elements  
		for (String str : deque) {  
			System.out.println(str);  
		}
		System.out.println("------------HashSet");
		//Creating HashSet and adding elements  
		HashSet<String> set=new HashSet<String>();  
		set.add("Mojidul");  
		set.add("Sharmin");  
		set.add("Nayeem");  
		set.add("Fatima-Tuz-Zuhra");
		set.add("Rafi");
		//Traversing elements  
		Iterator<String> setitr=set.iterator();  
		while(setitr.hasNext()){  
			System.out.println(setitr.next());  
		}
		//LinkedHashSet<String> set=new LinkedHashSet<String>();
		//TreeSet<String> set=new TreeSet<String>();
		
		
	}
}
