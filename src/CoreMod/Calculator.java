package CoreMod;

import java.util.function.*;

public class Calculator{

    // Supplier не принимает никаких аргументов, возвращает объект типа Т
    static Supplier<Calculator> instance = Calculator::new;
    // BinaryOperator Принимает два аргумента типа Т, возвращает один типа Т
    BinaryOperator<Double> plus = (a, b) -> a + b;
    BinaryOperator<Double> minus = (a, b) -> a - b;
    BinaryOperator<Double> multiply = (a, b) -> a * b;
    BinaryOperator<Double> divide = (a, b) -> a / b;
    // UnaryOperator принимает один типа Т, возвращает один типа Т
    UnaryOperator<Double> pow = a -> a*a;
    UnaryOperator<Double> abs = a -> a>0 ? a : a*(-1);
    // Predicate прнимиает один аргумент типа Т, возращает bool
    Predicate<Double> isPositive = a -> a>0;
    // Consumer принимает один аргумент типа Т, ничего не отдает
    Consumer<Double> printIt = System.out::println;

}
