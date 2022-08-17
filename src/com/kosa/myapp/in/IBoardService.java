package com.kosa.myapp.in;

import java.util.ArrayList;
import java.util.List;

public interface IBoardService {
   List<Board> boardList = new ArrayList<>();
   
   void insertBoard(Board board);
   List<Board> getBoardList();
   Board getBoardInfo(int bno);
   Board updateBoard(Board board);
   void deleteBoard(int bno);
   void save(); // 내부에서 정해진 파일 이름으로 저장
   void toCSV(String fileName); // 내보내기할 때 파일 명을 지정
}