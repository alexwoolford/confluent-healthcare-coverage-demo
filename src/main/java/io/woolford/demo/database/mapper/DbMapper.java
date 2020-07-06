package io.woolford.demo.database.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface DbMapper {

    @Select("SELECT id FROM patient ORDER BY RAND() LIMIT 1")
    int getRandomId();

    @Select("SELECT ailment FROM ailment ORDER BY RAND() LIMIT 1")
    String getRandomAilment();

}
