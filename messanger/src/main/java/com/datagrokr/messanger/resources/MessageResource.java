package com.datagrokr.messanger.resources;

import java.util.List;import com.datagrokr.messanger.model.Message;
import com.datagrokr.messanger.service.MessageService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/messages")
public class MessageResource {
	
	MessageService messageService = new MessageService();
	

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}
	
//	@GET
//	@Produces(MediaType.TEXT_PLAIN)
//	public String getMessages() {
//		return "Hello there";
//	}
}
