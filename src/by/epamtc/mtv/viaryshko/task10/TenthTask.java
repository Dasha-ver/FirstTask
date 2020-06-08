package by.epamtc.mtv.viaryshko.task10;

import java.util.Scanner;

//Напишите программу, которая для введенной последовательности целых ненулевых чисел
// (признак окончания ввода - ввод 0, количество чисел не меньше 2) определяет:
//является ли последовательность возрастающей;
//есть ли в ней хотя бы одна пара одинаковых соседних чисел;
//является ли последовательность знакочередующейся (3, -2, 4, -5, 0 - да; 5, -4, -7, 8, 0 - нет); Для ввода значений с клавиатуры можно воспользваться классом Scanner.
//*Примечание: массив или коллекцию для решения этой задачи использовать нельзя.

public class TenthTask {

    private long counterForIncrease;
    private long counterForSameNumbers;
    private long counterForCheckSymbols;
    private long counter;
    private long number;
    private long previousNumber;

    public TenthTask() {
        counterForIncrease = 0;
        counterForSameNumbers = 0;
        counterForCheckSymbols = 0;
        counter = 0;
        myScanner();
        if (number == 0) {
            System.out.println("Введите не менее 2х чисел, кроме нуля!");
        } else {
            nextStep();
            if (number == 0) {
                System.out.println("Введите не менее 2х чисел, кроме нуля!");
            } else {
                while (number != 0) {
                    nextStep();
                }
                getResult();
            }
        }
    }

    public void myScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        if (scanner.hasNextLong()) {
            number = scanner.nextLong();
        } else {
            System.out.println("Введите целое число!");
        }
    }

    //метод работы над числами
    public void nextStep() {
        counter++;
        getPreviousNumber(number);
        myScanner();
        checkIncrease();
        checkSameNumbers();
        checkSymbols();
    }

    //вывод результата
    public void getResult() {
        if (counterForIncrease > 1) {
            System.out.println("Последовательность не возрастающая");
        }
        if (counterForIncrease == 1) {
            System.out.println("Последовательность возрастающая");
        }
        if (counter - counterForCheckSymbols == 1) {
            System.out.println("Последовательность знакочередующаяся");
        }
        if (counter - counterForCheckSymbols != 1) {
            System.out.println("Последовательность не знакочередующаяся");
        }
        if (counterForSameNumbers > 0) {
            System.out.println("В последовательности есть пара(пары) одинаковых соседних чисел");
        }
        if (counterForSameNumbers == 0) {
            System.out.println("В последовательности нет пары одинаковых соседних чисел");
        }
    }

    //получение предыдущего числа
    public void getPreviousNumber(long myNumber) {
        previousNumber = myNumber;
    }

    //возрастает ли последовательность
    public void checkIncrease() {
        if (previousNumber > number) {
            counterForIncrease++;
        }
    }

    //есть ли пара одинаковых чисел
    public void checkSameNumbers() {
        if (previousNumber == number) {
            counterForSameNumbers++;
            counterForIncrease++;
        }
    }

    //знакочередование
    public void checkSymbols() {
        if (number > 0 && previousNumber < 0) {
            counterForCheckSymbols++;
            counterForIncrease++;
        } else if (number < 0 && previousNumber > 0) {
            counterForCheckSymbols++;
            counterForIncrease++;
        }
    }
}
