import java.util.Stack;

class MyQueue{
	Stack<Integer>s1,s2;
    public MyQueue() {
        s1=new Stack<>();
        s2=new Stack<>();
    }
    
    public void push(int x) {
        while(s1.size()!=0){
            s2.push(s1.pop());
            //s1.pop();
        }
        s1.push(x);
        while(s2.size()!=0){
            s1.push(s2.pop());
            //s2.pop();
        }
    }
    
    public int pop() {
        return s1.pop();
    }
    
    public int peek() {
        return s1.peek();
    }
    
    public boolean isempty() {
        return s1.isEmpty();
    }
}

public class QueueUsingStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyQueue obj = new MyQueue();
		obj.push(2);
		obj.push(3);
		obj.push(5);
		System.out.println(obj.pop());
		obj.push(9);
		System.out.println(obj.peek());
		System.out.println(obj.isempty());

	}

}
