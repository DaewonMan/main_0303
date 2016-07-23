package org.androidtown.study13;

import java.util.ArrayList;

/**
 * Created by DaewonMan on 2016-07-24.
 */
public class School {
    String name;
    ArrayList<String> students = new ArrayList<String>();

    public School() { // constructor

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<String> students) {
        this.students = students;
    }

    public void addItem(String name) {
        students.add(name); // 객체 추가
    }

    public int returnSize() {
        return students.size(); // 객체 갯수 리턴
    }

}
