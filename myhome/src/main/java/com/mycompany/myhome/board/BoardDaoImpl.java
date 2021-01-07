package com.mycompany.myhome.board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("boardDao")
public class BoardDaoImpl implements BoardDao {

    List<BoardDto> list = new ArrayList<BoardDto>();
    public BoardDaoImpl() {
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


}