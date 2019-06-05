package io.woolford.demo.utils;

import org.apache.kafka.clients.admin.AdminClient;

import java.util.*;

public class DeleteHealthcareTopics {

    public static void main(String[] args) {

        Properties props = new Properties();
        props.put("bootstrap.servers", "cp01.woolford.io:9092,cp02.woolford.io:9092,cp03.woolford.io:9092");
        AdminClient adminClient = AdminClient.create(props);

        List<String> topics = new ArrayList<>();
        topics.add("patient");
        topics.add("patient-rekey");
        topics.add("ailment");
        topics.add("ailment-enriched");

        adminClient.deleteTopics(topics).all();
        adminClient.close();

    }
    
}
