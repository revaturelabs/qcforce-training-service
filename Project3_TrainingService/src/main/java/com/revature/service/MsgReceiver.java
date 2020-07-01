package com.revature.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import com.revature.model.Batch;

@Service
public class MsgReceiver{

	@RabbitListener(queues="BatchData-Queue")
    public void recievedMessage(Batch batch) {
        System.out.println("Recieved Message: "+ batch.toString());
    }

}
