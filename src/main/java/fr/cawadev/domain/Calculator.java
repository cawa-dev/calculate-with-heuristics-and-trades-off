package fr.cawadev.domain;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public List<Integer> calculate(List<Integer> numbers, String operator) {
        List<Integer> result = new ArrayList<>();
        int sum = 0;

        for (int number : numbers) {
            if (operator.equals("+")) {
                sum += number;
            } else if (operator.equals("*")) {
                if (sum == 0) {
                    sum = 1;
                }
                sum *= number;
            }
            result.add(sum);
        }

        return result;
    }
}