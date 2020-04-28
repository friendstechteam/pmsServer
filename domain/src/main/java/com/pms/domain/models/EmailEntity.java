package com.pms.domain.models;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailEntity {
	private String subject;
	private String fromEmail;
	private String content;
	private List<String> toList;
	private List<String> ccList;
	private List<String> bccList;
	
}
