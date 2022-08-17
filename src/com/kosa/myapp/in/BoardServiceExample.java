package com.kosa.myapp.in;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardServiceExample {
   public static void main(String[] args) {
      IBoardService boardService = new BoardService();
      // 뷰와 컨트롤러
      // 뷰는 화면 처리를 위한 로직, 메뉴출력 및 입력, 데이터 입력, 데이터 출력
      // 컨트롤러는 메뉴 선택하면 그에따른 동작을 구현한 것
      Scanner scanner = new Scanner(System.in);
      while(true) {
         System.out.println("-----------------------------------------------------------");
         System.out.println("1.입력 | 2.목록 | 3.상세  | 4.수정  | 5.삭제 | 6.저장 | 7.CSV | 0.종료");
         System.out.println("-----------------------------------------------------------");
         System.out.print("선택>");
         int menu = Integer.parseInt(scanner.nextLine());
         switch(menu) {
         case 1:
            Board board = new Board();
            System.out.print("제목>");      board.setTitle(scanner.nextLine());
//            String title = scanner.nextLine();
            System.out.print("내용>");       board.setContent(scanner.nextLine());
            System.out.print("작성자>");      board.setWriter(scanner.nextLine());
//            System.out.print("작성일>");      
            board.setDate(new Date());
            boardService.insertBoard(board);
            break;
         case 2:
            List<Board> boardList = boardService.getBoardList();
            System.out.println(">>>>>>>>>>>>>>>>> 게시글 목록 <<<<<<<<<<<<<<<<");
            for(Board b1 : boardList) {
               System.out.printf("%3d | %30.30s | %s\n", b1.getBno(), b1.getTitle(), b1.getWriter());
            }
            System.out.println("===========================================");
            break;
         case 3:
        	 System.out.print("상세보기 할 게시글 번호를 입력하세요>v");
        	 int searchBno=Integer.parseInt(scanner.nextLine());
        	 Board searchBoard =boardService.getBoardInfo(searchBno);
        	 System.out.println("--------------------------------------------");
        	 System.out.println("글번호: "+searchBoard.getBno());
        	 System.out.println("제목: "+searchBoard.getTitle());
        	 System.out.println("내용: "+searchBoard.getContent());
        	 System.out.println("작성자: "+searchBoard.getWriter());
        	 SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy. M. d hh:mm:ss");
        	 System.out.println("작성일: "+dateFormat.format(searchBoard.getDate()));
        	 break;
         case 4:
        	 System.out.print("수정할 게시글 번호를 입력하세요> ");
        	 int updateBno=Integer.parseInt(scanner.nextLine());
        	 Board updateBoard=boardService.getBoardInfo(updateBno);
        	 System.out.printf("제목: (%10.10s)", updateBoard.getTitle());
        	 updateBoard.setTitle(scanner.nextLine());
        	 System.out.printf("내용: (%10.10s)", updateBoard.getContent());
        	 updateBoard.setContent(scanner.nextLine());
        	 System.out.printf("작성자: (%s)", updateBoard.getWriter());
        	 updateBoard.setWriter(scanner.nextLine());
        	 updateBoard.setDate(new Date());
        	 boardService.updateBoard(updateBoard);
        	 break;
         case 5:
        	 System.out.print("삭제할 게시글 번호를 입력하세요> ");
        	 int deleteBno=Integer.parseInt(scanner.nextLine());
        	 boardService.deleteBoard(deleteBno); 
        	 break;
         case 6:
        	 boardService.save();
        	 break;
         case 7:
        	 System.out.println("내보내기 할 csv파일의 이름을 입력하세요.");
        	 System.out.print("파일명> ");
        	 String fileName=scanner.nextLine();
        	 boardService.toCSV(fileName);
        	 break;
         case 0:
            System.out.println("프로그램을 종료합니다.");
            scanner.close();
            System.exit(0);
         }
      }
   }
}