package com.rd.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created at 6/28/22.
 *
 * @author Ridvan Dogan
 */
@Component
public class MessageListener {

    @RabbitListener(queues = MQConfig.QUEUE)
    public void listener(CustomMessage message){
        System.out.println(message);
    }
}
