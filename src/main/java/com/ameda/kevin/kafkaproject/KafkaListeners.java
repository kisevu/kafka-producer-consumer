package com.ameda.kevin.kafkaproject;


import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {


    @KafkaListener(topics = "kisevu", groupId = "groupId")
    public void listener(String data){
        System.out.println("Listener received: "+data+ " :) ");
    }
}
