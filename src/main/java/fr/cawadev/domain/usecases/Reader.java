package fr.cawadev.domain.usecases;

import java.util.List;

public interface Reader {

    List<Integer> read(String pathToFile);
}
