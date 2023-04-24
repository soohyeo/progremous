package com.earth.work;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

//검증이라는 관심사로 분리
//Validator : 객체를 검증하기 위한 인터페이스
public class UserValidator implements Validator{

	@Override		//이 검증기로 검증가능한 객체인지 알려주는 메서드
	public boolean supports(Class<?> clazz) {		
		//return User.class.equals(clazz);	//clazz가 User 또는 그 자손인지 확인
		return User.class.isAssignableFrom(clazz);
	}

	@Override		//객체를 검증하는 메서드 - target : 검증할 객체, errors : 검증시 발생한 에러저장소
	public void validate(Object target, Errors errors) {
		System.out.println("UserValidator의 validate() 호출됨!");
		
		User user = (User)target;
		String id = user.getId();
		
//		에러저장소의 저장함 (id 필드에 required라는 에러코드를 저장)
//		if (id == null | "".equals(id.trim())) {
//			errors.rejectValue("id", "required");
//		}
		//비었거나 공백이면 id라는 변수에 required라는 에러코드를 저장
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "id", "required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pwd", "required");
		
		if(id == null || id.length() < 5 || id.length() > 12) {
			errors.rejectValue("id", "invaildLength", new String[] {"5", "12"} , null);
		}
	}
}
