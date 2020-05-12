package edu.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessageSendingOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;  

import edu.ms.messages.Greeting;

@RestController
public class OtherController {
	
	@Autowired
    public SimpMessageSendingOperations messagingTemplate;
	
	  @GetMapping("/others")
	  public String feedTopic() {
		  messagingTemplate.convertAndSend( "/topic/greetings", new Greeting( "bye!!!" ) );
		  return "Hello";
	  }

}
