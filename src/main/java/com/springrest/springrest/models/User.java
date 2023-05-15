package com.springrest.springrest.models;

public class User {
    private long id;
    private String name;
    private String desc;

    public User(long id, String name, String desc) {
        super();
        this.id = id;
        this.name = name;
        this.desc = desc;
    }

    public User(){
        super();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString(){
        return "Course [id=" +id+ ",name=" +name+ ",desc=" +desc+ "]";
    }
}
