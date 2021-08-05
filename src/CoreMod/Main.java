package CoreMod;

public class Main {

    public static void main(String[] args) {

        // Инициализация
        Calculator calc = Calculator.instance.get();
        // Модуль
        double res = calc.abs.apply(-15d);
        calc.printIt.accept(res);
        // Сумма
        res = calc.plus.apply(15d, 29d);
        calc.printIt.accept(res);
        // Вычитание
        res = calc.minus.apply(15d, 29d);
        calc.printIt.accept(res);
        // Квадрат
        res = calc.pow.apply(15d);
        calc.printIt.accept(res);
        // Проверка на положительность
        System.out.println(calc.isPositive.test(15d));
        // Умножение
        res = calc.multiply.apply(15d, 29d);
        calc.printIt.accept(res);
        // Деление
        res = calc.divide.apply(15d, 29d);
        calc.printIt.accept(res);
    }
}
