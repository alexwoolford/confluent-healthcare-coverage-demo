package io.woolford.demo.database.service;

import io.woolford.demo.database.entity.PatientRecord;
import io.woolford.demo.database.mapper.DbMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DbService {

    @Autowired
    private DbMapper dbMapper;

    String getRandomFirstName(){
        return dbMapper.getRandomFirstName();
    }

    String getRandomLastName(){
        return dbMapper.getRandomLastName();
    }

    int getRandomId(){
        return dbMapper.getRandomId();
    }

    void insertPatientRecord(PatientRecord patientRecord){
        dbMapper.insertPatientRecord(patientRecord);
    }


}
