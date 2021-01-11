package com.mycompany.myhome.freeboard;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FreeboardController {

	@Resource(name = "freeboardService")
	FreeboardService service;

	@RequestMapping("/freeboard/list")
	String freeboard_list(Model model, FreeboardDto dto) {

		List<FreeboardDto> list = service.getList(dto);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getTitle());
		}

		return "freeboard/list";
	}
}
