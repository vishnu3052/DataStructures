import java.util.*;

public class StackUsingQueues {
	
	static Stack<Integer> s1=new Stack<>();
	static Stack<Integer> s2=new Stack<>();
	static void push(int val) {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		s1.push(val);
		while(!s2.isEmpty()) {
			s1.push(s2.pop());		
		}
	 }
	static int pop() {
		return s1.pop();
	}
	static int peek() {
		return s1.peek();
	}
	static boolean isEmpty() {
		return s1.isEmpty();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> q=new LinkedList<>();
		
		push(2);
		push(3);
		push(5);
		System.out.println(pop());
		push(9);
		System.out.println(peek());
		System.out.println(isEmpty());
		while(!s1.isEmpty()) {
			System.out.print(s1.pop()+"  ");
		}
		

	}

}
