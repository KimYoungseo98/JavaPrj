//import java.util.Scanner;
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		Scanner scanner = new Scanner(System.in);
//		int n=scanner.nextInt();
//		int x=scanner.nextInt();
//		
//		int[] arr=new int[n];
//		for(int i=0; i<arr.length; i++) {
//			arr[i]=scanner.nextInt();
//		}
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]<x) {
//				System.out.print(arr[i]+" ");
//			}
//		}
//		
//
//		
//	}
//
//}

import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);
    
    int hour=scan.nextInt();
    int min=scan.nextInt();
    int time=scan.nextInt();

    int sum= (hour*60)+min+time;

    if(sum>1440){
      
      System.out.printf("%d %d",(sum-1440)/60,(sum-1440)%60);
    }

    else{
      
      System.out.printf("%d %d",sum/60,sum%60);
    }

    
  }
}