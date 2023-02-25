package com.study.java.recursionfunction;

import java.io.IOException;

public class TestTailRecursion {
    public static void main(String[] args) throws IOException {

        System.out.println(factorialFunction(5L));

    }

    public static Long factorialFunction(Long num) {

        return tailOptimization(num, 1L);

    }

    public static Long tailOptimization(Long num, Long acc) {

        if(num == 0) {
            return 1L;
        }
        if(num == 1) {
            return acc;
        }
        return tailOptimization(num - 1, num * acc);
    }
}
