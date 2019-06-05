package io.woolford.demo.database.mapper;

import io.woolford.demo.database.entity.PatientRecord;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


@Mapper
public interface DbMapper {

    @Select("SELECT firstname FROM firstname ORDER BY RAND() LIMIT 1")
    String getRandomFirstName();

    @Select("SELECT lastname FROM lastname ORDER BY RAND() LIMIT 1")
    String getRandomLastName();

    @Select("SELECT id FROM patient ORDER BY RAND() LIMIT 1")
    int getRandomId();

    @Select("SELECT ailment FROM ailment ORDER BY RAND() LIMIT 1")
    String getRandomAilment();

    @Insert("INSERT INTO patient                                         " +
            "   (firstname, lastname, enroll_start, enroll_end)          " +
            "VALUES                                                      " +
            "   (#{firstname}, #{lastname}, #{enrollStart}, #{enrollEnd})")
    void insertPatientRecord(PatientRecord patientRecord);

}
