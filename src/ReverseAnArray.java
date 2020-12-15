public class ReverseAnArray {
	
	public static int[] reverse(int[] arr,int start,int end) {
		int temp;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
//			reverse(arr,start+1,end-1);       //if we want to do recursively
			start++;
			end--;
		}
		
		return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {9,3,1,4,5};
		int[] res=reverse(arr,0,4);
		for(int i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}

}
