import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [] arr= new int[3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		int [] arr2 = arr;
		
		arr2[2]=40;
		System.out.println(arr2[2]);
		sc.close();
	}
}