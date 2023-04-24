package com.earth.work;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jakarta.validation.Valid;
@Controller
public class RegisterController {
	@Autowired
	UserDao userDao;
	
	final int FAIL = 0;
	//@RequestMapping(value = "/register/add2")
	//@RequestMapping(value = "/register/add2", method = {RequestMethod.GET, RequestMethod.POST});
	@GetMapping("/register/add")
	public String register() {
		return "registerForm";			//신규회원 가입 화면
	}
	
	//@RequestMapping(value = "/register/save2")
	@PostMapping("/register/add")
	public String save(@Valid User user,BindingResult result , Model m) throws UnsupportedEncodingException {
		//유효성 검사
//		if(isValid(user)) {
//			String msg = URLEncoder.encode("id를 잘못입력했습니다.", "utf-8");
//			return "redirect:/register/add2?msg="+msg;
//		}
		System.out.println("user = "+ user);
		System.out.println("result = "+ result);
		
		// User 객체 검증한 결과 에러가 있으면, 에러를 보여줌
		// DB에 새회원 정보를 저장
		
		if (!result.hasErrors()) {
			int rowCnt = userDao.insertUser(user);
			if (rowCnt != FAIL) return "registerInfo";
		}
		
		return "registerForm";
	}
	@InitBinder		//WebDataBinder에 검증기(Validator) 등록함
	public void registerValidate(WebDataBinder binder) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-mm-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(df, false));
		//UserValidator를 WebDataBinder로 등록함
		binder.setValidator(new UserValidator());
		
		//binder에 검증기가 등록되었는지 확인코드
		List<Validator> validatorList = binder.getValidators();
		System.out.println("validatorList = " + validatorList);
		
	}
	
	private boolean isValid(User user) {
		
		return false;
	}
}
