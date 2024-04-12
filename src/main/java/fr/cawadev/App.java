package fr.cawadev;

import fr.cawadev.domain.Calculator;
import fr.cawadev.domain.ConsoleWriter;
import fr.cawadev.domain.CsvReader;

import java.util.List;

public class App {

    private final CsvReader csvReader;
    private final Calculator calculator;
    private final ConsoleWriter consoleWriter;


    public App(CsvReader csvReader, Calculator calculator, ConsoleWriter consoleWriter) {
        this.csvReader = csvReader;
        this.calculator = calculator;
        this.consoleWriter = consoleWriter;
    }

    public String process(String pathToFile, String operator) {
        var numbers = csvReader.read(pathToFile);
        System.out.println("numbers = " + numbers);

        List<Integer> result = calculator.calculate(numbers, operator);

        System.out.println("result = " + result);

        return consoleWriter.write(result, operator);
    }
}
