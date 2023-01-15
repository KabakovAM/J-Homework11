package Homework11;

public class Mult implements Model { // Класс умножения.
    int a;
    int b;

    @Override
    public int result() {
        return a * b;
    }

    @Override
    public void setA(int value) {
        this.a = value;
    }

    @Override
    public void setB(int value) {
        this.b = value;
    }
}
