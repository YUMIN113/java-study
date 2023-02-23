package com.study.java.comparator;

import java.util.Comparator;

// Anonymous Class 사용
// 이름이 없는 일회용 클래스
// 정의와 생성을 동시에
// 조상 또는 인터페이스 있어야 함
public class TestComparatorAnonymousClass {

    public static void main(String[] args) {

        Student2 b = new Student2(18, 1);
        Student2 c = new Student2(15, 3);

        int isBigAge = compareAge.compare(b, c);

        if(isBigAge > 0) {
            System.out.println("b 객체가 c 객체보다 나이가 많다.");
        } else if(isBigAge == 0) {
            System.out.println("두 객체의 나이는 같다.");
        } else {
            System.out.println("b 객체가 c 객체보다 나이 적다.");
        }

        int isBigClassNum = compareClassNum.compare(b, c);

        if(isBigClassNum > 0) {
            System.out.println("b 객체가 c 객체보다 뒤에있는 반이다.");
        } else if(isBigClassNum == 0) {
            System.out.println("두 객체의 반이 같다.");
        } else {
            System.out.println("b 객체가 c 객체보다 앞에있는 반이다.");
        }
    }
    // 익명 클래스 사용 전에는 Comparator 의 compare() 메서드를 사용하기 위해 비교 대상이 아닌 a 객체를 별도로 생성해야만 했다.
    // 익명 클래스 사용 후에는 a 객체를 별도로 생성하지 않아도 메서드만 사용할 수 있다.

    // 변수명만 바꾸면 여러 방식으로 compare() 메서드를 사용할 수 있다.

    // Anonymous Class 1
    public static Comparator<Student2> compareAge = new Comparator<Student2>() {
        @Override
        public int compare(Student2 o1, Student2 o2) {
            return o1.age - o2.age;
        }
    };

    // Anonymous Class 2
    public static Comparator<Student2> compareClassNum = new Comparator<Student2>() {
        @Override
        public int compare(Student2 o1, Student2 o2) {
            return o1.classNum - o2.classNum;
        }
    };
}

// 익명 객체로 Comparator 가 생성되기 때문에 Comparator 를 구현할 필요가 없다.
class Student2 {

    int age;
    int classNum;

    public Student2(int age, int classNum) {
        this.age = age;
        this.classNum = classNum;
    }
}
