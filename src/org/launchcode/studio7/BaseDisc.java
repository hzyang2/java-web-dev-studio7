package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {
    private String name;
    private Double capacity;
    private ArrayList<String> contents;
    private String discType;

    public BaseDisc(String name, Double capacity, ArrayList<String> contents, String discType) {
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
        this.discType = discType;
    }

    public void storeData(String content, Double size) {
        if(size > this.capacity) {
            System.out.print("Not enough capacity to store!!!");
        } else {
            contents.add(content);
            this.capacity -= size;
        }
    }

    public String toString() {
        return "BaseDisc{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", contents=" + contents +
                ", discType='" + discType + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCapacity() {
        return capacity;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public ArrayList<String> getContents() {
        return contents;
    }

//    public void setContents(ArrayList<String> contents) {
//        this.contents = contents;
//    }

    public String getDiscType() {
        return discType;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }
}
