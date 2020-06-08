package by.epamtc.mtv.viaryshko.task09;

//Вычислить: (1+2) * (1+2+3) * ... * (1+2+...+10).

public class NinthTask {

    private int startNumber = 2;
    private int finishNumber = 11;
    private double composition = 1;

    public NinthTask() {
    }

    //метод результата
    public double getResultForNinth() {
        while (startNumber < finishNumber) {
            double amount = 0;
            startNumber++;
            for (int i = 1; i < startNumber; i++) {
                amount += i;
            }
            composition *= amount;
        }
        return composition;
    }
}
