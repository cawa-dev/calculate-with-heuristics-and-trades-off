package fr.cawadev.domain.usecases;

import java.util.List;

@FunctionalInterface
public interface Writer {

    String write(List<Integer> result, String operator);
}
