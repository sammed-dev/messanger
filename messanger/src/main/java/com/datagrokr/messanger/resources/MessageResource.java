package com.datagrokr.messanger.resources;

import java.util.List;
import com.datagrokr.messanger.model.Message;
import com.datagrokr.messanger.service.MessageService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/messages")
public class MessageResource {
	
	MessageService messageService = new MessageService();
	

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages() {
		return messageService.getAllMessages();
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String welcomeMessage() {
		return "Hello there";
	}
//	
//	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{messageid}")
	public Message getMessage(@PathParam("messageid") Long id) {
		return messageService.getMessage(id);
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/addmessage")
	public Message postMessage(Message message) {
		return messageService.addMessage(message);
	}
	
	
	@PUT
	@Path("/update")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMessage(@PathParam("id") Long id, Message message ) {
		message.setId(id);
		return messageService.updateMessage(message);
	}
	
	
	@DELETE
	@Path("/delete")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteMessage(@PathParam("id") Long id) {
		messageService.deleteMessage(id);
	}
	
	
}
