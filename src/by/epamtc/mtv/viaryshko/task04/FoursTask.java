package by.epamtc.mtv.viaryshko.task04;

//Вычислить значение функции
public class FoursTask {

    private double x;
    private double negativeNumber;
    private boolean isMyNumberMore;

    public FoursTask(double x) {

        if (x <= 13) {
            makeNegative(x);
            System.out.println(Math.pow(negativeNumber, 3) + 9);
        } else {
            makeNegative(3 / (x + 1));
            System.out.println(negativeNumber);
        }
    }

    //метод для получения отрицательного значения числа
    private void makeNegative(double numberForNegative) {
        negativeNumber = 0 - numberForNegative;
    }
}
