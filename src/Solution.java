
import java.util.Scanner;

public class Solution {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int cnt = scanner.nextInt();
//      System.out.println(cnt);
      
      for(int i=0; i<cnt; i++) {
         int N = scanner.nextInt();
         scanner.nextLine();
//         System.out.println(N);
         // 여기는 입력 형식이 L L H L L L L L
         String[][] array = new String[N][N];
         for(int line=0; line<N; line++) {
            String data = scanner.nextLine();
            array[line] = data.split(" ");
         }
         // 여기는 입력형식이 LLHLLLLL
//         char[][] array = new char[N][N];
//         for(int line=0; line<N; line++) {
//            String data = scanner.nextLine();
//            for(int col=0; col<N; col++) {
//               array[line][col] = data.charAt(col);
//            }
//         }
//         System.out.println("\n---- 배열의 내용-------");
//         for(int y=0; y<N; y++) {
//            for(int x=0; x<N; x++) {
//               System.out.print(array[y][x] + " ");
//            }
//            System.out.println();
//         }
//         System.out.println();
         
         
         
         // X의 위치를 찾는다.
         int px = -1;
         int py = -1;
         outer: for(int y=0; y<N; y++) {
            for(int x=0; x<N; x++) {
               if(array[y][x].equals("X")) {
                  px = x;
                  py = y;
                  break outer; // X의 위치를 찾으면 반복문을 나감.
               }
            }
         }
//         System.out.println("X의 위치 : " + px + " " + py);
         int count = 0; // 먹을 수 있는 알의 수를 저장
         boolean isJumped = false; // 다른 알을 건너뛰었는지를 저장
         
         // 포의 위치부터 오른쪽으로 찾아감
         for(int x=px+1; x<N; x++) { // 오른쪽으로 먹을 수 있는 알을 찾아봄
            if(array[py][x].equals("L")) continue; // 공백이면 다음위치로 이동
            if(array[py][x].equals("Y")) break;
            if(array[py][x].equals("H")) {
               if(isJumped) {
                  count++;
                  break;
               }else {
                  isJumped = true;
               }
            }
         }
         
         // 포의 위치부터 왼쪽으로 찾아감
         isJumped = false; // 다른 알을 건너뛰었는지 여부를 저장
         for(int x=px-1; x>=0; x--) { // 왼쪽으로 먹을 수 있는 알을 찾아봄
            if(array[py][x].equals("L")) continue; // 공백이면 다음위치로 이동
            if(array[py][x].equals("Y")) break;
            if(array[py][x].equals("H")) {
               if(isJumped) {
                  count++;
                  break;
               }else {
                  isJumped = true;
               }
            }
         }
         
         // 포의 위치부터 아래쪽으로 찾아감
         isJumped = false;
         for(int y=py+1; y<N; y++) {
            if(array[y][px].equals("L")) continue;
            if(array[y][px].equals("Y")) break;
            if(array[y][px].equals("H")) {
               if(isJumped) {
                  count++;
                  break;
               }else {
                  isJumped = true;
               }
            }
         }
         
         // 포의 위치부터 위쪽으로 찾아감
         isJumped = false;
         for(int y=py-1; y>=0; y--) {
            if(array[y][px].equals("L")) continue;
            if(array[y][px].equals("Y")) break;
            if(array[y][px].equals("H")) {
               if(isJumped) {
                  count++;
                  break;
               }else {
                  isJumped = true;
               }
            }
         }
         System.out.println("#" + (i+1) + " " + count);
      }
      scanner.close();
   }
}