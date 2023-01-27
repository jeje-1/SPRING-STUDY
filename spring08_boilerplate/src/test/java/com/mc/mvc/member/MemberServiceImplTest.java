package com.mc.mvc.member;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.mc.mvc.common.mail.MailSender;



//가상으로 만들어지는 web.xml을 사용해 테스트환경을 구축
@WebAppConfiguration

//JUNIT의 실행방법을 지정
@RunWith(SpringJUnit4ClassRunner.class)

//테스트 때 사용할 가상의 ApplicationContext를 생성하고 관리
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/*-context.xml"})
public class MemberServiceImplTest {
	
	@Autowired
	JavaMailSender mailSender;
	
	@Autowired
	MailSender sender;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Test
	public void testSendMail() {
		
		sender.send("econoone@gmail.com", "모듈화테스트", "<a href='https://www.naver.com'>네이버로 이동하기</a>");
	}
	
	@Test
	public void testRestTemplate() throws RestClientException, URISyntaxException{
		
		Map<String, Object> body = new LinkedHashMap<String, Object>();
			body.put("userId", "admin");
			body.put("mailTemplate", "signup-email-auth");
		
		
			RequestEntity<Map<String,Object>> request = 
				RequestEntity
				.post(new URI("http://localhost:8080/mail"))
				
				// LinkedMultiValueMap => json형태로 변경
				// 자바의 객체 => json문자열로 변경
				
				// 자바의 객체 => form-url-encoded 형태로 변경해주는 HTTPMessageConverter는 존재하지만
				// json으로 변경할  HTTPMessageConverter는 존재하지 않음
				.contentType(MediaType.APPLICATION_JSON)
				.body(body);
	
		ResponseEntity<String> response = restTemplate.exchange(request, String.class);
		String html = response.getBody();
		
		System.out.println(html);
		sender.send("econoone@gmail.com", "메일 템플릿 테스트", html);
	}
	
	@Test
	public void requestKakaoBookAPI() {
		
		Map<String, Object> body = new LinkedHashMap<String, Object>();
		body.put("prompt","오늘도 자바 공부를 열심히 하고 있어.");
		body.put("max_tokens",128);
		
		RequestEntity<Map<String, Object>> request =
				RequestEntity.post("https://api.kakaobrain.com/v1/inference/kogpt/generation")
				.header("Authorization", "KakaoAK de0f1daf4dc0c5b4ce61c1b69b17b2cd")
				.contentType(MediaType.APPLICATION_JSON)
				.body(body);
		
		ResponseEntity<Map> response = 
				restTemplate.exchange(request, Map.class);
		
		System.out.println(response.getBody());
	}
	
	
	
	
	
	

}