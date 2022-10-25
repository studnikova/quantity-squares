package ru.netology.sqr;

public class SqrtService {

    public int calculate(int min, int max) {
        int count = 0;
        for (int i = 10; i < 100; i++) {
            if (i * i > min) {
                if (i * i < max) {
                    count++;
                }
            }
        }
        return count;
    }
}
