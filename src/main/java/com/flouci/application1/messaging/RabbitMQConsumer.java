package com.flouci.application1.messaging;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQConsumer {

	@RabbitListener(queues = "task-queue")
	public void receiveMessage(String message) {
		// Handle the received message here
		System.out.println("Received message to app2: " + message);
	}
}
