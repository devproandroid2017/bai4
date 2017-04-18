package bai_4;

public class HomeWork4 {

	public static void main(String[] args) {
		int n = 100;
		int m = 8;
		//nhap du lieu
		int[] arr = {
				 1,  2,  3,  4,  5,  16,  7,  8,  9, 10,
				11, 12, 13, 14, 15, 06, 17, 18, 19, 20,
				21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
				31, 32, 33, 34, 35, 36, 37, 38, 39, 40,
				41, 42, 43, 44, 45, 46, 47, 48, 49, 50,
				51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
				61, 62, 63, 64, 65, 66, 67, 68, 69, 70,
				71, 72, 73, 74, 75, 76, 77, 78, 79, 80,
				81, 82, 83, 84, 85, 86, 87, 88, 89, 90,
				91, 92, 93, 94, 95, 96, 97, 98, 99, 100
				};
		//in ra man hinh mang moi n-1 phan tu
		for(int i = 0; i < arr.length; i++){
			if(i % 10 == 0){
				System.out.println("");
			}
			System.out.print(arr[i] + " ");
		}
		/// tinh tong n phan tu
		int s = 0;
		for(int i = 0; i < n; i++){
			s = s + arr[i];//s += i;
		}
		System.out.println("Tong cua "+ n + " phan tu :" + s);
		
		/// lay 1 phan tu ++
		int[] arr1 = new int[n - 1];
		for(int i = 0; i < m; i++){
			arr1[i] = arr[i];
		}
		
		for(int i = m; i < n - 1; i++){
			arr1[i] = arr[i + 1];
		}
		
		//in ra man hinh mang moi n-1 phan tu
		for(int i = 0; i < arr1.length; i++){
			if(i % 10 == 0){
				System.out.println("");
			}
			System.out.print(arr1[i] + " ");
		}
		
		/// Tinh tong n - 1 phan tu
		int s1 = 0;
		for(int i = 0; i < arr1.length; i++){
			s1 = s1 + arr1[i];//s += i;
		}
		System.out.println("Tong cua "+ (n - 1) + " phan tu :" + s1);
		
		//lay hieu -> gia tri cua phan tu lay di
		System.out.println("Gia tri phan tu bi lay di la "+ (s - s1));
		//end1
		
		//cach 2
		// sep xep tang dan ++
		for (int i = 0; i < arr1.length - 1;i++){
			for (int j = i + 1; j < arr1.length; j++){
				if(arr1[i] > arr1[j]){
					int temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
		
		//in ra man hinh mang moi n-1 phan tu
		System.out.println("arr sau khi sap xep tang dan:");
		for(int i = 0; i < arr1.length; i++){
			if(i % 10 == 0){
				System.out.println("");
			}
			System.out.print(arr1[i] + " ");
		}
		
		// kiem tra arr[x] - arr[x-1] = 2 --> gia tri phan tu lay di.
		System.out.println("");//xuong dong
		for(int i = 1; i < arr1.length; i++){
			if((arr1[i] - arr1[i-1]) == 2){
				System.out.println("Gia tri phan tu bi lay di la "+ (arr1[i] - 1));
			}
		}

	}

}
