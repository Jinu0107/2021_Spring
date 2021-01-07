package com.mycompany.myhome.board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("boardDao2")
public class BoardDaoImpl2 implements BoardDao {

    List<BoardDto> list = new ArrayList<BoardDto>();
    public BoardDaoImpl2() {
        list.add(new BoardDto("1", "제목1", "내용1", "작성자1", "2020-11-12"));
        list.add(new BoardDto("1", "제목1", "내용1", "작성자1", "2020-11-12"));
        list.add(new BoardDto("1", "제목1", "내용1", "작성자1", "2020-11-12"));
        list.add(new BoardDto("1", "제목1", "내용1", "작성자1", "2020-11-12"));
        list.add(new BoardDto("1", "제목1", "내용1", "작성자1", "2020-11-12"));
    }

    @Override
    public List<BoardDto> getList() {
        return list;
    }

	@Override
	public void insert(BoardDto dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BoardDto getView(String id) {
		// TODO Auto-generated method stub
		return null;
	}


}