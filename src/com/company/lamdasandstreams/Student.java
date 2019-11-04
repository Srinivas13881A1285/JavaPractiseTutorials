package com.company.lamdasandstreams;

public class Student {

    private int id;
    private String name;
    private boolean hasTeacher;

    public boolean isHasTeacher() {
        return hasTeacher;
    }

    public void setHasTeacher(boolean hasTeacher) {
        this.hasTeacher = hasTeacher;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + '}';
    }

    public boolean hasTeacher() {
        return true;
    }
}
