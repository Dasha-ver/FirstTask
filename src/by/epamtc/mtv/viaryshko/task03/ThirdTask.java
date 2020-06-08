package by.epamtc.mtv.viaryshko.task03;

////Даны действительные числа а,b,с. Удвоить эти числа, если а > b > с, и заменить их абсолютными значениями, если это не так.

public class ThirdTask {

    private double a;
    private double b;
    private double c;
    private boolean numberIsIncrease;

    public ThirdTask(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        numberIsIncrease = isIncrease();
        if (numberIsIncrease) {
            resultForDouble();
        } else {
            resultForAbsoluteValue();
        }
    }

    //метод для проверки условия задачи
    private boolean isIncrease() {
        return a > b && b > c;
    }

    //метод для увелечения чисел вдвое
    private void resultForDouble() {
        double[] array = {a, b, c};
        for (double v : array) {
            System.out.print(v * 2 + " ");
        }
    }

    //метод для нахождения абсолютного значения чисел
    private void resultForAbsoluteValue() {
        double[] array = {a, b, c};
        for (double v : array) {
            System.out.print(Math.abs(v) + " ");
        }
    }
}
