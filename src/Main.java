public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        //  Циклы урок 2. Task 1

        int contribution = 15000;
        int amountOfSavings = 0;
        int i = 0;
        while (amountOfSavings < 1_000_000) {
            i = i + 1;
            amountOfSavings = amountOfSavings + contribution;
            System.out.println("Месяц " + i + " сумма накоплений равна " + amountOfSavings + " месяц");
        }

        //  Task 2

        for (int x = 1; x <= 10; x++) {
            System.out.print(x + " ");
        }
        System.out.println();

        int y = 10;
        while (y > 0) {
            y = y - 1;
            System.out.print(y + " ");
            System.out.println();
        }


        //  Task 3
        int populationChange = 12_000_000;
        int fertility = 17;
        int estimate = 8;
        int year = 0;
        while (year < 10) {
            year++;
            populationChange = populationChange + fertility - estimate;
            System.out.println("Год " + year + " численность населения составляет " + populationChange);
        }


        //  Task 4 & 5
        int deposit = 15000;
        int totals = 0;
        int ix = 1;
        while (totals < 12_000_000) {
            totals = totals + totals / 100 * 7;
            totals = totals + deposit;
            ix = ix + 1;
            if (ix % 6 == 0) {
                System.out.println("Месяц " + ix + " сумма накоплений равна " + totals + " месяц");
            }
        }


        //  Task 6
        int deposit1 = 15000;
        int total = 0;
        for (i = 1; i <= 108; i = i + 1) {
            total = total + total / 100 * 7;
            total = total + deposit1;
            if (i % 6 == 0) {
                System.out.println("Месяц " + i + " сумма накоплений равна " + total + " месяц");
            }


        }


        //  Task 7
        int day;
        for (day = 3; day <= 31; day = day + 7) {

            System.out.println("сейчас пятница, " + day + " число, сдай отчет");
        }

        //  Task 8
        int yearComet = 0;
        int cometArrived;
        int cometWillArrive;
        for (; yearComet < 2123; yearComet = yearComet + 79) {
            if (1823 < yearComet && yearComet < 2023) {
                System.out.println("Комета прилетала в " + yearComet);
            }
            else if (2023 < yearComet && yearComet < 2123) {
                System.out.println("Комета прилетит еще  в " + yearComet);


            }
        }
    }
}


