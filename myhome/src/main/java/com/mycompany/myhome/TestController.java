package com.mycompany.myhome;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//DispatcherServlet Ŭ������ url�� ������ ��Ʈ�ѷ��� �����Ų��.
@Controller
public class TestController {

	@RequestMapping("/test")
	public String test1(Model model) {

		// Model ��ü�� jsp�� request ��ü�� ���� �����Ҷ� ���ȴ�.
		// jsp���� ${user01} ������ ǥ�������� �����ص� �ǰ� request.getAttribute �Լ��� ����ص� �ȴ�.
		// HashTable, HashMap ó�� ��� Ű�� �� ���� �����Ѵ�.

		model.addAttribute("userid", "user01");
		model.addAttribute("username", "ȫ�浿");
		return "test";
	}

	@RequestMapping("/test/list")
	public String testList(Model model) {
		ArrayList<String> list = new ArrayList();
		list.add("���");
		list.add("�۾�");
		list.add("����ȫ");
		list.add("��ȭ");
		list.add("���");
		list.add("�ҹ̲�");
		list.add("����ȭ");
		
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
