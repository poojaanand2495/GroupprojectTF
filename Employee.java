package com.tfapp.tfapplication;
public class Employee {
    private Integer tfactor;
    private String name;
    private Integer id;

    public void settfactor(Integer tfactor) {
        this.tfactor = tfactor;
    }
    public Integer gettfactor() {
        return tfactor;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getId() {
        return id;
    }
}
