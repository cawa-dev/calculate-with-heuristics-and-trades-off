package fr.cawadev.domain;

import fr.cawadev.domain.usecases.Writer;

import java.util.List;

public class ConsoleWriter implements Writer {

    @Override
    public String write(List<Integer> result, String operator) {
        StringBuilder sb = new StringBuilder();

        for (int number : result) {
            sb.append(number).append("\n");
        }

        return sb.toString();
    }
}
