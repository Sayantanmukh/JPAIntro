package com.jpaIntro.entity;

import javax.persistence.Column;

//import javax.persistence.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.Table;


@Entity
//@Table(name = "greet")
public class Greet {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="message_id")
	private int messageId;
	
	@Column(name="message_name")
	private String message;
	
	public int getMessageId() {
		return messageId;
	}
	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}


}
