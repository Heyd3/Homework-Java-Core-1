package Homework.Calculate;

public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(2, 2);
        int b = calc.minus.apply(3,1);
        int c = calc.devide.apply(a, b);   //ошибка была потому из-за деления на ноль

        calc.println.accept(c);
        calc.println.accept(b);
        calc.println.accept(a);
    }
}
