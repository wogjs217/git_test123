package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class TestController {
	@RequestMapping("/test.do")
	public ModelAndView test(){
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","���������� �ѿ��� �������μ� ������");
		mav.setViewName("test");
		System.out.println("fdfds");
		return mav;
	}
}
