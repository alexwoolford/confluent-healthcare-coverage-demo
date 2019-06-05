package io.woolford.demo;

import io.woolford.demo.database.entity.PatientRecord;
import io.woolford.demo.database.mapper.DbMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.sql.Date;
import java.util.concurrent.ThreadLocalRandom;

@Component
public class PatientGenerator {

    @Autowired
    DbMapper dbMapper;

    @PostConstruct
    private void generatorPatients(){

        for(int i = 0; i < 20; ++i) {
            dbMapper.insertPatientRecord(getPatientRecord());
        }

    }

    private PatientRecord getPatientRecord(){

        PatientRecord patientRecord = new PatientRecord();
        patientRecord.setFirstname(dbMapper.getRandomFirstName());
        patientRecord.setLastname(dbMapper.getRandomLastName());

        int randomNum = ThreadLocalRandom.current().nextInt(-365, 365 + 1);
        Date enrollStart = Date.valueOf(LocalDate.now().plusDays(randomNum));
        Date enrollEnd = Date.valueOf(LocalDate.now().plusDays(randomNum).plusYears(1));

        patientRecord.setEnrollStart(enrollStart);
        patientRecord.setEnrollEnd(enrollEnd);

        return patientRecord;
    }

}
