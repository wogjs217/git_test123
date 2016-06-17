package emp.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import emp.dto.MyEmpDTO;
import emp.service.MyEmpService;

@Controller
public class UpdateController {
	
	@Autowired
	MyEmpService service;
	
	@RequestMapping(value="/update.do",method=RequestMethod.GET)
	public String showPage(HttpServletRequest req){
		return "update";
	}
			
	@RequestMapping(value="/update.do",method=RequestMethod.POST)
	public ModelAndView update(HttpServletRequest req, MyEmpDTO userInfo){
		
		System.out.println("*********"+userInfo.getId());
		System.out.println("******123***"+userInfo.getName());
		System.out.println("******123***"+userInfo.getPass());
		System.out.println("******123***"+userInfo.getDeptno());
		service.update(userInfo);
		return new ModelAndView("redirect:index.do");
	}
}
