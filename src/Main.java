public class Main {
    public static void main(String[] args){
task1();
task2();
task3();
task4();
task5();
task6();
task7();
task8();
task9();
    }
    public static void task1() {
        System.out.println("Задание 1");
        int accumulation = 0;
        int contribution = 15000;
        int month = 0;
        while(accumulation < 2_459_000) {
            accumulation = accumulation + contribution;
            month = month + 1;
            System.out.println("Месяц " + month +  " сумма накоплений равна " + accumulation + " рублей");
        }
    }
    public static void task2(){
        System.out.println("Задание 2");
        int num = 1;
        while (num <= 10){
            System.out.print(num + " ");
            num = num + 1;
        }
        System.out.println(" ");
        for (int num2 = 10; num2 >= 1; num2--){
            System.out.print(num2 + " ");
        }
        System.out.println(" ");
    }
    public static void task3(){
        System.out.println("Задание 3");
        int total = 12_000_000;
        int birthRate = total/1000 * 17;
        int mortalityRate = total/1000 *  8;
        for (int year = 1; year <= 10; year++ ){
            total = total + (birthRate - mortalityRate);
            System.out.println("Год " + year + ", численность населения составляет " + total);
        }
        System.out.println("Задание 3, решение через while");
        int total1 = 12_000_000;
        int birthRate1 = total1/1000 * 17;
        int mortalityRate1 = total1/1000 *  8;
        int year1 = 0;
        while (year1 < 10){
            year1 = year1 +1;
            total1 = total1 + (birthRate1 - mortalityRate1);
            System.out.println("Год " + year1 + ", численность населения составляет " + total1);
        }
    }
    public static void task4() {
        System.out.println("Задание 4");
        int deposit = 15000;
        int month = 0;
        int purpose = 12_000_000;
        while (deposit < purpose) {
            deposit += deposit * 7/100;
            month += 1;
            System.out.println("Месяц " + month + ", сумма накоплений " + deposit);
        }
    }
    public static void task5(){
        System.out.println("Задание 5");
        int deposit = 15000;
        int month = 0;
        int purpose = 12_000_000;
        while (deposit < purpose) {
            deposit += deposit * 7/100;
            month += 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + deposit);
            }
        }
    }
    public static void task6(){
        System.out.println("Задание 6");
        int deposit = 15000;
        int month = 0;
        while (month <= 108) {
            deposit += deposit * 7/100;
            month += 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений " + deposit);
            }
        }
    }
    public static void task7(){
        System.out.println("Задание 7");
        int friday = 3;
        for ( ; friday <= 31; friday += 7 ){
            System.out.println("Сегодня пятница " + friday + " число. Необходимо подготовить отчёт");
        }
    }
    public static void task8(){
        System.out.println("Задание 8");
        int cometPast = 1823;
        int cometFuture = 2123;
        int cometYear = 0;
        while (cometYear < cometFuture){
            cometYear += 79;
            if (cometYear >= cometPast && cometYear <= cometFuture) {
                System.out.println(cometYear);
            }
        }
    }
    public static void task9(){
        System.out.println("Другой способ решения задания 8");
        int cometPast = 1823;
        int cometFuture = 2123;
        int cometYear = 0;
        for ( ; cometYear < cometFuture; cometYear += 79) { // for удобнее
            if (cometYear >= cometPast) {
                System.out.println(cometYear);
            }
        }
    }
}