package com.mc.mvc.member.dto.validator.form;

import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.mc.mvc.member.repository.MemberRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class SignUpFormValidator implements Validator{
	
	Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	private final MemberRepository memberRepository;
	
	@Override
	public boolean supports(Class<?> clazz) {
		logger.info("SignUpFormValidator.supports 호출");
		return SignUpForm.class.isAssignableFrom(clazz);
		
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userId", "field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "tell", "field.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "field.required");
		
		
		SignUpForm form = (SignUpForm) target;
		
		if(memberRepository.selectMemberByUserId(form.getUserId()) != null) {
			errors.rejectValue("userId", "existId", "이미 존재하는 아이디 입니다.");
		}
		
		// 비밀번호가 8글자 이상의 숫자, 영문자, 특수문자 조합인지 확인
	
		if(!Pattern.compile("(?!.*[ㄱ-힣])(?=.*\\d)(?=.*[a-zA-Z])(?=.*[^a-zA-Z0-9ㄱ-힣])(?=.{8,})").matcher(form.getPassword()).find()) {
			errors.rejectValue("password", "password.format", "비밀번호는 8글자 이상의 숫자, 영문자, 특수문자의 조합이어야 합니다.");
		}
		// 존재하는 이메일인지 확인
//		if(memberRepository.selectMemberByEmail(form.getEmail()) != null) {
//			errors.rejectValue("email", "exist.email", "이미 존재하는 이메일입니다.");
//		}


	}
	
}