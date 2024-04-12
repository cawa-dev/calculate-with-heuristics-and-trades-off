package fr.cawadev;

import fr.cawadev.domain.Calculator;
import fr.cawadev.domain.ConsoleWriter;
import fr.cawadev.domain.CsvReader;

public class Main {

    public static void main(String[] args) {
        // Dependency injection for the App class
        var app = new App(new CsvReader(), new Calculator(), new ConsoleWriter());

        var pathToFile = args[0];
        var operator = args[1];

        // Print the result of the calculation
        System.out.println(app.process(pathToFile, operator));
    }
}
