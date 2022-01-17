package core.programs;

	import java.util.*;  
	public class LinkedList2{  
	 public static void main(String args[]){  
	 LinkedList<String> ll=new LinkedList<String>();  
	           System.out.println("Initial list of elements: "+ll);  
	           ll.remove("June");
	           System.out.println("After invoking remove(june) method: "+ll);
	           ll.add("May");  
	           ll.add("June");  
	           ll.add("July");  
	           ll.add("August");
	           ll.add("Apirl");
	           ll.add("November");
	           System.out.println("After invoking add(Even) method: "+ll);  
	           ll.add("June");
	           ll.add("August");
	           ll.add("April");
	           ll.add("November"); 
	           System.out.println("After invoking add(Odd) method: "+ll); 
	           ll.add("May");
	           ll.add("July");
	           System.out.println("After invoking add(int index, E element) method: "+ll);  
	           LinkedList<String> ll2=new LinkedList<String>();  
	           ll2.add("March");  
	           ll2.add("Feburary");  
	           ll.addAll(ll2);  
	           System.out.println("After invoking addAll(Collection<? extends E> c) method: "+ll);  
	           LinkedList<String> ll3=new LinkedList<String>();  
	           ll3.add("September");  
	           ll3.add("October");     
	           ll.addAll(1, ll3);  
	           System.out.println("After invoking addAll(int index, Collection<? extends E> c) method: "+ll);   
	           ll.addFirst("January");  
	           System.out.println("After invoking addFirst(E e) method: "+ll);  
	           ll.addLast("December");  
	           System.out.println("After invoking addLast(E e) method: "+ll);  
	             
	 }  
	}