package com.mycompany.myhome.board;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service("boardService")
public class BoardServiceImpl implements BoardService {


    // @Resource�� boardDao��� �̸��� ��ü�� ã�Ƽ� �����۾�(Dependency Injection)
    @Resource(name="boardDao")
    BoardDao boardDao;

    @Override
    public List<BoardDto> getList() {
        return boardDao.getList();
    }
}