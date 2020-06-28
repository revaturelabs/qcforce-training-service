package com.revature.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import com.revature.model.Associate;

@Service
public class MsgReceiver{

	@RabbitListener(queues="FormResponse-Queue")
    public void recievedMessage(Associate associate) {
        System.out.println("Recieved Message: "+ associate.toString());
    }

}
