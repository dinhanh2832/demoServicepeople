package com.company.model;

public class Student extends People{
    private int pointMatch;
    private int pointPhys;
    private int id = 0;
    public Student (){
        super();
    }

    public Student(int id,String name,int age, int pointMatch, int pointPhys) {
        super(name, age);
        this.id = id;
        this.pointMatch = pointMatch;
        this.pointPhys = pointPhys;
    }

    public int getPointMatch() {
        return pointMatch;
    }

    public void setPointMatch(int pointMatch) {
        this.pointMatch = pointMatch;
    }

    public int getPointPhys() {
        return pointPhys;
    }

    public void setPointPhys(int pointPhys) {
        this.pointPhys = pointPhys;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "{" +
                "id = " + id +
                ", pointMatch = " + pointMatch +
                ", pointPhys = " + pointPhys +
                ", name = " + super.getName() +
                ", age = " + super.getAge() +
                '}';
    }
}
