package board.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import board.service.TB_BoardDTOService;
import emp.service.MyEmpService;

@Controller
public class BoardWriteController {
	
	@Autowired
	TB_BoardDTOService service;
	
	@RequestMapping(value="/boardwrite.do",method=RequestMethod.GET)
	public String showBoardWritePage(){
		return "emp/boardWrite";
	}
	
	
}
