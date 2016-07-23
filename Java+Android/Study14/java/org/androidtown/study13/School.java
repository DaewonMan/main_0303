package org.androidtown.study13;

import java.util.ArrayList;
import java.util.Iterator;

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

    public String toString() {
        String nameList = "학교 이름 : 우리 학교 \n";
        Iterator<String> iter = students.iterator();
        int cnt = 0;
        while (iter.hasNext()) {
            nameList += ( "학생 #" + cnt + " : " + iter.next() + "\n");
            cnt++;
        }

        return nameList;
    }

}
