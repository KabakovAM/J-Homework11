package Homework11;

public class Calculation { // Основной класс, который реализует калькулятор.
    Data data;
    Model model;

    public Calculation(Model m, Data d) {
        model = m;
        data = d;
    }

    public void result(String type) {
        int a = data.getValue("\nВведите первое число: ");
        int b = data.getValue("\nВведите второе число: ");
        model.setA(a);
        model.setB(b);
        int result = model.result();
        System.out.println("\n" + Integer.toString(a) + " " + type + " " + Integer.toString(b) + " = "
                + Integer.toString(result));
        Logger.logger(a, b, result, type);
    }
}
