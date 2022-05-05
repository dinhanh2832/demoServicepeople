package com.company.service;

import com.company.model.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentService implements GeneralService<Student>{

    private List<Student> listStudent ;

    public StudentService() {
        listStudent = new ArrayList<>();
        listStudent.add( new Student(0,"anh",18,10,10));
        listStudent.add( new Student(1,"duc",18,9,7));
        listStudent.add( new Student(2,"long",18,3,5));
        listStudent.add( new Student(3,"huy",18,6,8));
    }
    public StudentService(List<Student> listStudent) {
        this.listStudent = listStudent;
    }

    public List<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(List<Student> listStudent) {
        this.listStudent = listStudent;
    }

    @Override
    public int findIndexById(int id) {
        for (int i = 0; i < listStudent.size(); i++) {
            if (listStudent.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void add(Student student) {
        listStudent.add(student);
    }

    @Override
    public void update(Student student, int id) {
        int index = findIndexById(id);
        listStudent.set(index, student);
    }

    @Override
    public void deleteById(int id) {
        int index = findIndexById(id);
        listStudent.remove(index);
    }

    @Override
    public void print() {
        for (int i = 0; i < listStudent.size(); i++) {
            System.out.println(listStudent.get(i));
        }
    }

    @Override
    public void sort() {
        listStudent.sort(Comparator.comparing(Student::getName));
    }

    @Override
    public void sortMinToMaxMarch() {
        listStudent.sort(Comparator.comparingDouble(Student::getPointMatch));
    }

    @Override
    public void sortMaxToMin() {
        listStudent.sort((o1,o2) -> {
            if (o1.getPointPhys() > o2.getPointPhys()){
                return -1;
            } else if(o1.getPointPhys() == o2.getPointPhys() ){
                return 0;
            }
            return 1;
        });
    }
    public void getIndex(int index){
        System.out.println(listStudent.get(index));
    }
}
