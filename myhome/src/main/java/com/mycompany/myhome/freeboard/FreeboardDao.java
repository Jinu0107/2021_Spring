package com.mycompany.myhome.freeboard;

import java.util.List;

public interface FreeboardDao {
	List<FreeboardDto> getList(FreeboardDto dto);
	void insert(FreeboardDto dto);
	FreeboardDto getView(String id);
	int getTotalCount(FreeboardDto dto);

}
