package com.earth.rain;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class RegisterController2 {
	
	//@RequestMapping(value = "/register/add2")
	//@RequestMapping(value = "/register/add2", method = {RequestMethod.GET, RequestMethod.POST});
	@GetMapping("/register/add2")
	public String register() {
		return "registerForm";			//신규회원 가입 화면
	}
	
	//@RequestMapping(value = "/register/save2")
	@PostMapping("/register/save2")
	public String save(User user, Model m) throws UnsupportedEncodingException {
		//유효성 검사
		if(isValid(user)) {
			String msg = URLEncoder.encode("id를 잘못입력했습니다.", "utf-8");
			return "redirect:/register/add2?msg="+msg;
		}
			
		return "registerInfo";
		
	}

	private boolean isValid(User user) {
		return false;
	}
}
