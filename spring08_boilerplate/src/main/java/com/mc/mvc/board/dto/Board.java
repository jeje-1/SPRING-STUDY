package com.mc.mvc.board.dto;

import java.time.LocalDateTime;

import com.mc.mvc.member.dto.Member;

import lombok.Data;

@Data
public class Board {
	
	private Integer BdIdx;
	private String userId;
	private LocalDateTime regDate;
	private String title;
	private String content;
	private boolean isDel;

}
