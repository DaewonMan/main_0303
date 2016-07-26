package org.androidtown.study15;

/**
 * Created by DaewonMan on 2016-07-26.
 */
public class Student {
    String name;
    int age = 0;

    public static String loginName = "이름";
    public static String loginAge = "나이";

    public static final int REQ_CODE_PHONEBOOK = 1;

    public static final int RES_CODE_SUCCESS = 200;
    public static final int RES_CODE_FAILURE = 400;

    public Student() {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
