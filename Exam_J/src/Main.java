public class Main {
	public static void main(String[] args) {
		boolean[] arr1 = new boolean[7];
		
		arr1[0] = true;
		arr1[1] = true;
		arr1[2] = false;
		arr1[3] = false;
		double[] arr2= {3.14, 2.55, 6.22};
		System.out.println(arr2[0]);
		int [] arr3=new int[10];
		for(int i=0; i<10; i++) {
			System.out.printf("arr3[%d] : %d\n",i,i+1);
		}
		
		int[] arr = new int[10];
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			arr[i]=(i+1)*10;
		}
		for(int i=0; i<arr.length; i++) {
			sum +=arr[i];
		}
		System.out.println("합 : "+sum);
		System.out.println("평균 : "+sum/arr.length);
		
	}
}