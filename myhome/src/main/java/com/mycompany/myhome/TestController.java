package com.mycompany.myhome;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//DispatcherServlet 클래스가 url과 적당한 컨트롤러를 연결시킨다.
@Controller
public class TestController {

	@RequestMapping("/test")
	public String test1(Model model) {

		// Model 객체는 jsp의 request 객체에 값을 전달할때 사용된다.
		// jsp에서 ${user01} 형태의 표현식으로 접근해도 되고 request.getAttribute 함수를 사용해도 된다.
		// HashTable, HashMap 처럼 사용 키와 값 쌍을 저장한다.

		model.addAttribute("userid", "user01");
		model.addAttribute("username", "홍길동");
		return "test";
	}

	@RequestMapping("/test/list")
	public String testList(Model model) {
		ArrayList<String> list = new ArrayList();
		list.add("장미");
		list.add("작약");
		list.add("백일홍");
		list.add("국화");
		list.add("목련");
		list.add("할미꽃");
		list.add("무궁화");
		
		model.addAttribute("flowerList" , list);
		return "test/list";
	}
	
	//http://localhost:8090/myhome/userinfo?userid=test&password=1234
	@RequestMapping("/userinfo")
	public String userinfo(Model model ,String userid, String password) {
		
		System.out.println(userid);
		System.out.println(password);
		
		model.addAttribute("userid" , userid);
		model.addAttribute("password" , password);
		return "userinfo";
	}
	
	@RequestMapping("/add")
	public String add(Model model , int x , int y) {
		model.addAttribute("result" , x+y);
		return "add";
	}

}
