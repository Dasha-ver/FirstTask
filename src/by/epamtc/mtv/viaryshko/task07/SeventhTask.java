package by.epamtc.mtv.viaryshko.task07;

//Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
//Поменять местами дробную и целую части числа и вывести полученное значение числа.
//Примечание: для решения этой нельзя использовать перевод числа в строку и обратно.

public class SeventhTask {

    private double number;
    private int wholeNumber;
    private int hundredThousands;
    private int hundreds;

    public SeventhTask(double number) {
        this.number = number;
        wholeNumber = conversion(number);
        System.out.println(getResultOfSeventh());
    }

    //преобразование
    public int conversion(double number) {
        double conversedNumber = number * 1000;
        return (int) conversedNumber;
    }

    //находение цифр числа и вывода ответа
    public double getResultOfSeventh() {
        hundredThousands = wholeNumber / 1000;
        hundreds = wholeNumber % (hundredThousands * 1000);
        return (double) (hundreds * 1000 + hundredThousands) / 1000;
    }
}



