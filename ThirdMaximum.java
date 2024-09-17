public class ThirdMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,-2147483648};
		System.out.println(thirdMaximum(arr));

	}

	private static int thirdMaximum(int[] arr) {
		// long max=Long.MIN_VALUE;
				// long secmax=max;
				// long thirdmax=max;
				// for(int i=0;i<arr.length;i++) {
				// 	if(arr[i]>max) {
				// 		thirdmax=secmax;
				// 		secmax=max;
				// 		max=arr[i];
				// 	}
				// 	else if(arr[i]<max && arr[i]>secmax) {
				// 		thirdmax=secmax;
				// 		secmax=arr[i];
				// 	}
				// 	else if(arr[i]<secmax && arr[i]>thirdmax) {
				// 		thirdmax=arr[i];
				// 	}
				// }
		        // if(thirdmax==Long.MIN_VALUE){
		        //     return (int) max;
		        // }else{
		        //     return (int) thirdmax;
		        // }
		        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		        int second = Integer.MIN_VALUE;
		        int third  = Integer.MIN_VALUE;

		        for (int i=0;i<arr.length;i++) {
		            
		            if (max<arr[i]) {
		                third = second;
		                second = max;
		                max = arr[i];
		            }
		            
		            if (arr[i]<max && arr[i]> second) {
		                third = second;
		                second = arr[i];
		            }
		            
		            if (arr[i]<second && arr[i]>third)
		                third = arr[i];
		           
		            min = Math.min(min,arr[i]);
		        }
		        if ( third>=min && third<second && second < max)
		            return third;
		        else
		            return max;
	}

}
