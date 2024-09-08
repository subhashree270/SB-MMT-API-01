package com.subha.binding;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Request {
	private String name;
	private String email;
	private String doj;
	private String from;
	private String to;
	private String trainNum;
	private LocalDate createdOn;
	private LocalDate updatedOn;

}
