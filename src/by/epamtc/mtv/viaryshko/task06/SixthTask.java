package by.epamtc.mtv.viaryshko.task06;

//Сумма первых n членов арифметической прогрессии вычисляется по формуле Sn = ( a1 + an )* n / 2.
// Даны a1 и d (шаг арифметической прогрессии). Найдите n, при котором значение Sn выходит
// за диапазон типов int и long (экспериментальным путем).

public class SixthTask {

    private double a;
    private double d;
    private double counter;
    private double resultOfFunction;

    public SixthTask(double a, double d) {
        this.a = a;
        this.d = d;
    }


    //метод для типа int
    public void checkForInt() {
        counter = 0;
        for (double i = a; ; i = i + d) {
            counter++;
            resultOfFunction = (a + i) * counter / 2;
            if (resultOfFunction > Integer.MAX_VALUE || resultOfFunction < Integer.MIN_VALUE) {
                break;
            }
        }
        System.out.println(counter);
    }

    //метод для типа long
    public void checkForLong() {
        counter = 0;
        for (double i = a; ; i = i + d) {
            counter++;
            resultOfFunction = (a + i) * counter / 2;
            if (resultOfFunction > Long.MAX_VALUE || resultOfFunction < Long.MIN_VALUE) {
                break;
            }
        }
        System.out.println(counter);
    }
}
