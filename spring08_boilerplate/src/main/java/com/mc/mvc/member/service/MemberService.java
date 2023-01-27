package com.mc.mvc.member.service;

import com.mc.mvc.member.dto.Member;

public interface MemberService {
	
	Member selectUserById();

	void insertNewMember(Member member);

	void authenticateEmail(Member member, String authToken);

}