package by.epamtc.mtv.viaryshko.task02;

//Вычислите число и месяц в невисокосном году по номеру дня.

public class SecondTask {

    private int day;
    private int year;
    private boolean isDayCheck;
    private boolean isYearLeap;
    private int dayOfMonth;
    private String month;

    public SecondTask(int year, int day) {
        this.day = day;
        this.year = year;
        isDayCheck = isCheckDay();
        isYearLeap = isLeap();
        if (isDayCheck || isYearLeap) {
            System.out.println("Проверьте правильность ввода данных!");
        } else {
            findMonth();
            findDay();
            System.out.println(month + "," + dayOfMonth);
        }
    }

    //проверка дня
    public boolean isCheckDay() {
        return day <= 0 || day > 365;
    }

    //метод для проверки високосный ли год
    private boolean isLeap() {
        return year % 4 == 0 || year % 100 == 0;
    }

    //метод для нахождения месяца
    private void findMonth() {
        int dayNumber = day;
        if (dayNumber >= 1 && dayNumber <= 31) {
            month = "Январь";
        } else if (dayNumber >= 32 && dayNumber <= 59) {
            month = "Февраль";
        } else if (dayNumber >= 60 && dayNumber <= 90) {
            month = "Март";
        } else if (dayNumber >= 91 && dayNumber <= 120) {
            month = "Апрель";
        } else if (dayNumber >= 121 && dayNumber <= 151) {
            month = "Май";
        } else if (dayNumber >= 152 && dayNumber <= 181) {
            month = "Июнь";
        } else if (dayNumber >= 182 && dayNumber <= 212) {
            month = "Июль";
        } else if (dayNumber >= 213 && dayNumber <= 243) {
            month = "Август";
        } else if (dayNumber >= 244 && dayNumber <= 273) {
            month = "Сентябрь";
        } else if (dayNumber >= 274 && dayNumber <= 304) {
            month = "Октябрь";
        } else if (dayNumber >= 305 && dayNumber <= 334) {
            month = "Ноябрь";
        } else if (dayNumber >= 335 && dayNumber <= 365) {
            month = "Декабрь";
        }
    }

    //метод для нахлждения дня
    private void findDay() {
        switch (month) {
            case "Январь":
                dayOfMonth = day;
                break;
            case "Февраль":
                dayOfMonth = day - 31;
                break;
            case "Март":
                dayOfMonth = day - 59;
                break;
            case "Апрель":
                dayOfMonth = day - 90;
                break;
            case "Май":
                dayOfMonth = day - 120;
                break;
            case "Июнь":
                dayOfMonth = day - 151;
                break;
            case "Июль":
                dayOfMonth = day - 181;
                break;
            case "Август":
                dayOfMonth = day - 212;
                break;
            case "Сентябрь":
                dayOfMonth = day - 243;
                break;
            case "Октябрь":
                dayOfMonth = day - 273;
                break;
            case "Ноябрь":
                dayOfMonth = day - 304;
                break;
            case "Декабрь":
                dayOfMonth = day - 334;
                break;
        }
    }

}
