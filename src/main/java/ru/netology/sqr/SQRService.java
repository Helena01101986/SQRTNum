package ru.netology.sqr;

public class SQRService {
    public int calcNumSqr(int min, int max) {
        int numMatchers = 0;
        for (int i = 10; i <= 99; i++) {
            if ((i * i >= min) && (i * i <= max)) {
                numMatchers++;
            }
        }
        return numMatchers;
    }
}



