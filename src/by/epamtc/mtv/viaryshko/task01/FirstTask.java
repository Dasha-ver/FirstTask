package by.epamtc.mtv.viaryshko.task01;

//Вычислите значение выражения по формуле
public class FirstTask {

    private double a;
    private double b;
    private double c;

    public FirstTask(double a, double b, double c) {
        this.a = a;
        this.c = c;
        this.b = b;
    }

    public double result() {
        double powB = Math.pow(b, 2);
        double compositionAC = 4 * a * c;
        double squareRoot = Math.sqrt(powB + compositionAC);
        double dividend = b + squareRoot;
        double divider = 2 * a;
        double division = dividend / divider;
        double compositionAPowC = (Math.pow(a, 3)) * c;

        return (division - compositionAPowC) + Math.pow(b, -2);

    }
}
