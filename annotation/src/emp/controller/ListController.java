package emp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import emp.dto.MyEmpDTO;
import emp.service.MyEmpService;

@Controller
public class ListController{
	
	@Autowired
	MyEmpService service;
	
	@RequestMapping(value="/list.do",method=RequestMethod.GET)
	public ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		List<MyEmpDTO> userlist = service.getMemberList();
		mav.addObject("userlist",userlist);
		//mav.setViewName("emp/list");
		mav.setViewName("list");
		return mav;
	}
	

}
