import java.util.Stack;

class pair{
	int x,y;
	pair(int x,int y){
		this.x=x;
		this.y=y;
	}
}
class MinStack {
	   // Stack<pair> st=new Stack<>();
	    Stack<Long>st;
	    Long mini;
	    public MinStack() {
	        st=new Stack<>();
	        mini=Long.MAX_VALUE;
	    }
	    
	    public void push(int val) {
	    	//first approach
	        // int min;
	        // if(st.isEmpty()){
	        //     min=val;
	        // }else min=Math.min(val,st.peek().y);
	        // st.push(new pair(val,min));
	        Long value=Long.valueOf(val);
	        if(st.isEmpty()){
	            mini=value;
	            st.push(value);
	        }else{
	            if(value<mini){
	                st.push(2*value-mini);
	                mini=value;
	            }else st.push(value);
	        }

	    }
	    
	    public int  pop() {
	    	//first approach
	       // st.pop();
	       if(st.isEmpty())return -1;
	       Long val=st.pop();
	       if(val<mini){
	            mini=2*mini-val;
	            return mini.intValue();
	       }
	       return val.intValue();
	    }
	    
	    public int top() {
	    	//first approach
	        //return st.peek().x;
	        Long val=st.peek();
	        if(val<mini){
	            return mini.intValue();
	        }return val.intValue();
	    }
	    
	    public int getMin() {
	    	//first approach
	        //return st.peek().y;
	        return mini.intValue();
	    }
	    public boolean isempty() {
	    	return st.isEmpty();
	    }
	}

public class Min_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack obj=new MinStack();
		obj.push(2);
		obj.push(3);
		obj.push(5);
		System.out.println("min:"+obj.getMin());
		System.out.println("pop:"+obj.pop());
		obj.push(9);
		System.out.println("top:"+obj.top());
		System.out.println("min:"+obj.getMin());
		System.out.println("Empty:"+obj.isempty());


	}

}
