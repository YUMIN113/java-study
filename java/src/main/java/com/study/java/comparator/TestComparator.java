package com.study.java.comparator;

import java.util.Comparator;

// Anonymous Class 사용 전
public class TestComparator {

    public static void main(String[] args) {

        Student a = new Student(17, 2);
        Student b = new Student(18, 1);
        Student c = new Student(15, 3);

        int isBig = a.compare(b, c);

        if(isBig > 0) {
            System.out.println("b 객체가 c 객체보다 나이가 많다.");
        } else if(isBig == 0) {
            System.out.println("두 객체의 나이가 같다.");
        } else {
            System.out.println("b 객체가 c 객체보다 나이가 적다.");
        }

    }

}

// Comparator 인터페이스 구현
class Student implements Comparator<Student> {

    int age;
    int classNum;

    public Student(int age, int classNum) {
        this.age = age;
        this.classNum = classNum;
    }

    @Override
    public int compare(Student o1, Student o2) {
        return o1.age - o2.age;
    }
}