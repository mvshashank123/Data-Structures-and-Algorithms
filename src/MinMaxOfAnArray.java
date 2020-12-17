
public class MinMaxOfAnArray {
	
	static class Pair{
		int max;
		int min;
	}
	
	public static Pair MinMax(int[] arr, start, end) {
		
		Pair minMax;
		
		//if there is only one element
		if(end == start) {
			minMax.max = arr[start];
			minMax.min = arr[start];
		}
		
		//if there are two elements
		if(end-start == 1) {
			if(arr[start]>arr[end]) {
				minMax.max = arr[start];
			}
			else {
				minMax.min = arr[end];
			}
		}
		
		//if there are more than 2 elements
		else {
			minMax.max = 
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
