package com.mycompany.myhome.freeboard;

import java.util.List;

import javax.annotation.Resource;
import javax.print.attribute.standard.Media;

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
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getTitle());
//		}
		model.addAttribute("freeboardList", list);
		model.addAttribute("totalCount" , service.getTotalCount(dto));

		return "freeboard/list";
	}

	@RequestMapping("/freeboard/view")
	String freeboard_view(Model model, String id) {
		
		FreeboardDto dto = service.getView(id);
		model.addAttribute("freeboardView" , dto);
		return "freeboard/view";
	}
	
	@RequestMapping("/freeboard/write")
	String freeboard_write(Model model) {
		return "freeboard/write";
	}
	
	@RequestMapping("/freeboard/save")
	String freeboard_save(Model model , FreeboardDto dto) {
		
		service.insert(dto);
		
		return "redirect:/freeboard/list";
	}
}
