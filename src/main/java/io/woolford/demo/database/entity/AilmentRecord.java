package io.woolford.demo.database.entity;

public class AilmentRecord {

    private int id;
    private String ailment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAilment() {
        return ailment;
    }

    public void setAilment(String ailment) {
        this.ailment = ailment;
    }

    @Override
    public String toString() {
        return "AilmentRecord{" +
                "id=" + id +
                ", ailment='" + ailment + '\'' +
                '}';
    }

}
