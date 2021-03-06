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
public class DetailController {
	
	@Autowired
	MyEmpService service;
	
	@RequestMapping(value="/detail.do",method=RequestMethod.GET)
	public ModelAndView showPage(HttpServletRequest req, String id){
		ModelAndView mav = new ModelAndView();
		MyEmpDTO user = service.read(id);
		mav.addObject("user",user);
		mav.setViewName("detail");
		
		return mav;
	}
}
