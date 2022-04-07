package com.datagrokr.messanger.service;

import java.util.ArrayList;
import java.util.List;

import com.datagrokr.messanger.model.Message;

public class MessageService {

	public List<Message> getAllMessages(){
		
		Message m1 = new Message(1L,"KKR wins", "patcummins");
		Message m2 = new Message(2L,"RCB wins","DK");
		
		List<Message> messages = new ArrayList<Message>();
		messages.add(m1);
		messages.add(m2);
		return messages;
	}
	
}
