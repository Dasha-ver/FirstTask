package by.epamtc.mtv.viaryshko.task08;

////Вычислить значения функции на отрезке [a,b] c шагом h

public class EightTask {

    private double C = 2;
    private double y;
    private double x;
    private double step;
    private double a;
    private double b;

    public EightTask(double a, double b, double step) {
        this.a = a;
        this.b = b;
        this.step = step;
    }


    //расчёт у
    public void getResultOfEight() {
        for (x = a; x <= b; x += step) {
            if (x == 15) {
                y = (x + C) * 2;
            } else {
                y = (x - C) + 6;
            }
            System.out.println("y:" + " " + y);
        }
    }
}
