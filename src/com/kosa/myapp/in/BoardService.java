package com.kosa.myapp.in;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class BoardService implements IBoardService {
	//int count=0;
   @Override
   public void insertBoard(Board board) {
	  //board.setBno(++count);
	  if(boardList.isEmpty()) {
		  board.setBno(1); //게시글이 없을 경우 첫 게시글 번호는 1
	  }else { //게시글이 있을 경우
		  Board temp=boardList.get(boardList.size()-1); //마지막 게시글을 가져옴
		  board.setBno(temp.getBno()+1);
	  }
      boardList.add(board);
   }

   @Override
   public List<Board> getBoardList() {
      return boardList;
   }

   @Override
   public Board getBoardInfo(int bno) {
      for(int i=0; i<boardList.size(); i++) {
         Board board = boardList.get(i);
         if(bno==board.getBno()) { // 게시판 글번호를 찾으면
            return board;
         }
      }
      return null; // 찾는 게시판 글번호가 없음
   }

   @Override
   public Board updateBoard(Board board) {
      for(int i=0; i<boardList.size(); i++) {
         Board curBoard = boardList.get(i);
         if(board.getBno()==curBoard.getBno()) { // 수정할 게시판 글번호를 찾으면
            curBoard = board;
            return board;
         }
      }
      return null;
   }

   @Override
   public void deleteBoard(int bno) {
      for(int i=0; i<boardList.size(); i++) {
         Board board = boardList.get(i);
         if(bno==board.getBno()) {
            boardList.remove(i);
            break;
         }
      }
   }

   @Override
   public void save() {
      String fileName = "board.data";
      FileOutputStream fos = null;
      ObjectOutputStream oos = null;
      try {
         fos = new FileOutputStream(fileName);
         oos = new ObjectOutputStream(fos);
         oos.writeObject(boardList);
      }catch(IOException e) {
         throw new RuntimeException(e);
      }finally {
         if(oos!=null) 
            try {
               oos.close();
            }catch(Exception e) {
               // nothing
            }
      }
   }

   @Override
   public void toCSV(String fileName) {
      FileWriter writer = null;
      try {
         writer = new FileWriter(fileName);
         for(Board board : boardList) {
            writer.write(board.toCSV() + "\n");
         }
         writer.flush();
      }catch(IOException e) {
         throw new RuntimeException(e);
      }finally {
         if(writer!=null) try {writer.close();}catch(Exception e) {}
      }
   }

}