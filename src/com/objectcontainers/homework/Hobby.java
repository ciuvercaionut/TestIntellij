package com.objectcontainers.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hobby {

    private String nameofHobby;
    private int frequency;
    private List<Address> hobbyPlace = new ArrayList<>();

    public Hobby(String nameofHobby, int frequency, Address... hobbyPlace) {
        this.nameofHobby = nameofHobby;
        this.frequency = frequency;
        Collections.addAll(this.hobbyPlace, hobbyPlace);
    }

    public String getNameofHobby() {
        return nameofHobby;
    }

    public int getFrequency() {
        return frequency;
    }

    public List<Address> getHobbyPlace() {
        return hobbyPlace;
    }

    @Override
    public String toString() {
        return "Hobby{" +
                "nameofHobby='" + nameofHobby + '\'' +
                ", frequency=" + frequency +
                ", hobbyPlace=" + hobbyPlace +
                '}';
    }
}
