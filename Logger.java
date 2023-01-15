package Homework11;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger { // Логирование арифметических операция в файл txt.
    public static void logger(int a, int b, int result, String type) {
        Date dt = new Date();
        try (FileWriter writer = new FileWriter("logger.txt", true)) {
            writer.append(dt + ":   " + Integer.toString(a) + " " + type + " " + Integer.toString(b) + " = "
                    + Integer.toString(result) + "\n");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
