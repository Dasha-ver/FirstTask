package by.epamtc.mtv.viaryshko.task05;

//Дано трехзначное число. Определите:
//сумму и произведение цифр числа;
//число, полученное перестановкой цифр сотен и десятков;
//четырехзначное число, полученное приписыванием цифры единиц в качестве цифры тысяч
// (например, из числа 137 необходимо получить число 7137).
//Примечание: для решения этой нельзя использовать перевод числа в строку и обратно.

public class FifthTask {

    private int number;
    private int hundreds;
    private int dozens;
    private int units;

    public FifthTask(int number) {
        this.number = number;
        if (!checkNumber(number)) {
            System.out.println("Число должно быть трёхзначным и положительным!");
        } else {
            findNumbers();
            System.out.println("Сумма цифр числа" + " " + (hundreds + dozens + units));
            System.out.println("Произведение цифр числа" + " " + (hundreds * dozens * units));
            System.out.println("Число, полученное перестановкой цифр сотен и десятков" + " " + dozens + hundreds + units);
            System.out.println("Четырехзначное число, полученное приписыванием цифры единиц в качестве цифры тысяч " + " " + units + number);
        }
    }


    //метод для проверки трёхзначности числа
    public boolean checkNumber(int numberForCheck) {
        return numberForCheck / 100 < 10 && numberForCheck / 100 > 0;
    }

    //метод для нахождения цифр
    public void findNumbers() {
        hundreds = number / 100;
        dozens = (number % 100) / 10;
        units = (number % 100) - (dozens * 10);
    }

}
