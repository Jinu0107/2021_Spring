package com.mycompany.myhome.board;

import java.util.List;

public interface BoardService {
	List<BoardDto> getList();
	void insert(BoardDto dto);
	BoardDto getView(String id);
}

/* ���񽺴� �۾�����, Dao �� ���̺� ����
 * �ϳ��� ���񽺰� �������� Dao ���� �����ϴ�.
 * 
 * ���θ� -> ���� �ȸ� �ֹ�, ���, ����, ����Ʈ, �����ϸ���
 */
