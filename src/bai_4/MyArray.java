package bai_4;

public class MyArray {

	public static void main(String[] args) {
		
		final int n = 10;
		final int m = 2;
		int[] arr = new int[10];// mang 1 chieu
		int[][] arr2 = new int[n][m];//mang 2 chieu
		
		arr[3] = 1;////
		
		arr2[2][0] = 1;
		
		for (int i =0; i < arr.length; i++){
			arr[i] = i;//
		}
		
		for (int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				
			}
		}
		
		int[][] arr3 = new int[3][7];
		
		for(int i = 0; i < arr3.length; i++){
			for(int j = 0; j < arr3[i].length; j++){
				arr3[i][j] = (i + 1) * (j + 1);
				System.out.println(arr3[i][j]);
			}
		}

	}
	
	@Override
	public String toString() {
		return "This is MyArray class";
	}

}
