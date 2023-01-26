package com.mc.mvc.member.service;

import org.springframework.stereotype.Service;

import com.mc.mvc.member.dto.Member;
import com.mc.mvc.member.repository.MemberRepository;

// 스프링이 Proxy객체를 만들 떄, target객체의 이름은 Interface명 + Impl로 작성 
@Service
public class MemberSerivceImpl implements MemberService{

	private MemberRepository memberRepository;
	
	// MemberRepository를 생성자 주입 받음
	public MemberSerivceImpl(MemberRepository memberRepository) {
		super();
		this.memberRepository = memberRepository;
		System.out.println(memberRepository.getClass());
	}


	@Override
	public Member selectUserById() {
		// TODO Auto-generated method stub
		return memberRepository.selectMemberByUserId("admin");
	}
	
	

}
