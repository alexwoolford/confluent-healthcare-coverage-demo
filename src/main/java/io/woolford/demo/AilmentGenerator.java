package io.woolford.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import io.woolford.demo.database.entity.AilmentRecord;
import io.woolford.demo.database.mapper.DbMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class AilmentGenerator {

    @Autowired
    DbMapper dbMapper;

    @Autowired
    KafkaTemplate kafkaTemplate;

    @Scheduled(fixedDelay = 500)
    private void generateAilment() throws JsonProcessingException {

        AilmentRecord ailmentRecord = new AilmentRecord();
        int id = dbMapper.getRandomId();

        ailmentRecord.setId(id);
        ailmentRecord.setAilment(dbMapper.getRandomAilment());

        kafkaTemplate.send("ailment", String.valueOf(id), ailmentRecord);

    }

}
