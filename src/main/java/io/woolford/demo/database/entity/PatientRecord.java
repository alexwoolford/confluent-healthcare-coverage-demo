package io.woolford.demo.database.entity;

import java.util.Date;

public class PatientRecord {

    private String firstname;
    private String lastname;
    private Date enrollStart;
    private Date enrollEnd;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getEnrollStart() {
        return enrollStart;
    }

    public void setEnrollStart(Date enrollStart) {
        this.enrollStart = enrollStart;
    }

    public Date getEnrollEnd() {
        return enrollEnd;
    }

    public void setEnrollEnd(Date enrollEnd) {
        this.enrollEnd = enrollEnd;
    }

    @Override
    public String toString() {
        return "PatientRecord{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", enrollStart=" + enrollStart +
                ", enrollEnd=" + enrollEnd +
                '}';
    }

}
