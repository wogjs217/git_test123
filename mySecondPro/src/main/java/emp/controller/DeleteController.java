package emp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import emp.dto.MyEmpDTO;
import emp.service.MyEmpService;

@Controller
public class DeleteController {
	@Autowired
	MyEmpService service;
	
	@RequestMapping(value="/delete.do",method=RequestMethod.GET)
	public ModelAndView showUpdatePage(HttpServletRequest req,String id){
		ModelAndView mav = new ModelAndView();
		service.delete(id);
		List<MyEmpDTO> userlist = service.getMemberList();
		mav.addObject("userlist",userlist);
		mav.setViewName("list");
		return mav;
	}
}
