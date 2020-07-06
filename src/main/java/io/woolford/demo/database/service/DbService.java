package io.woolford.demo.database.service;

import io.woolford.demo.database.mapper.DbMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DbService {

    @Autowired
    private DbMapper dbMapper;

    int getRandomId(){
        return dbMapper.getRandomId();
    }

}
