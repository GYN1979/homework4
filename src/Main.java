public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Задача 1
        System.out.println ("Задача 1");
        int webLength = 40000;
        System.out.println ("Значение переменной webLength " + "с типом int равно " + webLength);
        byte weightDog = 7;
        System.out.println ("Значение переменной weightDog " + "с типом int равно " + weightDog);
        short weigghtContainer = 1000;
        System.out.println ("Значение переменной weigghtContainer " + "с типом byte равно " + weigghtContainer);
        long distance = 2500000000L;
        System.out.println ("Значение переменной distance " + "с типом long равно " + distance);
        float fruits = 1.9598713F;
        System.out.println ("Значение переменной fruits " + "с типом float равно " + fruits);
        double vegetables = 1.1578952354;
        System.out.println ("Значение переменной vegetables " + "с типом double равно " + vegetables);

        // Задача 2
        System.out.println ("Задача 2");
        double x = 27.12;
        long y = 987678965549L;
        float z = 2.786F;
        boolean k = false;
        short a = 569;
        short b = -159;
        short c = 27897;
        byte d = 67;

        // Задача 3
        System.out.println ("Задача 3");
        int studentLP = 23;
        int studentAS = 27;
        int studentEA = 30;
        int totalStudent = studentLP + studentAS + studentEA;
        System.out.println ("Всего " + totalStudent + " учеников ");
        int paper = 480;
        int persPaper = paper / totalStudent;
        System.out.println ("На каждого ученика расчитано " + persPaper + " листов бумаги ");

        // Задача 4
        System.out.println ("Задача 4");
        int produktivity2min = 16;
        int time2min = 2;
        int time1min = produktivity2min / time2min;
        System.out.println ("Производительность машины за 1 минуту " + time1min + " бут ");
        int time1 = 20;
        int time2 = 1 * 24 * 60;
        System.out.println (time2 + " минут ");
        int time3 = 3 * 24 * 60;
        System.out.println (time3 + " минут ");
        int time4 = 30 * 24 * 60;
        System.out.println (time4 + " минут ");
        int produktivity20min = time1min * time1;
        System.out.println ("За " + time1 + " минут машина произвела бутылок " + produktivity20min + " штук ");
        int produktivity1day = time1min * time2;
        System.out.println ("За " + time2 + " минут машина произвела бутылок " + produktivity1day + " штук ");
        int produktivity3day = time1min * time3;
        System.out.println ("За " + time3 + " минут машина произвела бутылок " + produktivity3day + " штук ");
        int produktivity1month = time1min * time4;
        System.out.println ("За " + time4 + "минут машина произвела бутылок " + produktivity1month + " штук ");

        // Задача 5
        System.out.println ("Задача 5");
        int white1class = 2;
        int brown1class = 4;
        int totalCans = 120;
        int totalClass = totalCans / (white1class + brown1class);
        System.out.println ("Всего " + totalClass + " классов ");
        int totalWhite = totalClass * white1class;
        int totalBrown = totalClass * brown1class;
        System.out.println ("В школе, где " + totalClass + " классов, " + " нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски " );

        // Задача 6
        System.out.println ("Задача 6");
        int quantityBananas = 5;
        int weightBanans = 80;
        int totalWeightBanans = quantityBananas * weightBanans;
        int quantityMilk = 200;
        int volumeMilk = 100;
        int weightMilk100ML = 105;
        int totalWeightMilk = quantityMilk / volumeMilk * weightMilk100ML;
        int quantityIceCream = 2;
        int weightIceCream = 100;
        int totalWeightIceCream = quantityIceCream * weightIceCream;
        int quantityEggs = 4;
        int weightEggs = 70;
        int totalWeightEggs = quantityEggs * weightEggs;
        double weightBreakfast = (totalWeightBanans + totalWeightMilk + totalWeightIceCream + totalWeightEggs) / 1000;
        System.out.println (" Вес спорт-завтрака составляет " + weightBreakfast + " кг ");

        // Задача 7
        System.out.println ("Задача 7");
        int totalWeight = 7;
        int totalWeightGr = totalWeight * 1000;
        int weight1 = 250;
        int weight2 = 500;
        int Day1 = totalWeightGr / weight1;
        int Day2 = totalWeightGr / weight2;
        System.out.println (Day1 + " дней уйдет, если спортсмен будет терять каждый день " + weight1 + " грамм ");
        System.out.println (Day2 + " дней уйдет, если спортсмен будет терять каждый день " + weight2 + " грамм ");
        int averageDay = (Day1 + Day2) / 2;
        System.out.println (averageDay + " дней в среднем потребуется спортсмену, чтобы добиться результата похудения ");

        // Задача 8
        System.out.println ("Задача 8");
        int months = 12;
        double percent = 1.1;
        int salaryMaryBefore = 67760;
        double salaryMaryAfter = salaryMaryBefore * percent;
        int salaryMaryBeforeYear = months * salaryMaryBefore;
        double salaryMaryAfterYear = months * salaryMaryAfter;
        double differenceAnnualIncomeMary = salaryMaryAfterYear - salaryMaryBeforeYear;
        System.out.println ("Маша теперь получает " + salaryMaryAfter + " рублей. Годовой доход вырос на "
                + differenceAnnualIncomeMary + " рублей ");
        int salaryDenisBefore = 83690;
        double salaryDenisAfter = salaryDenisBefore * 0.1 + salaryDenisBefore;
        int salaryDenisBeforeYear = months * salaryDenisBefore;
        double salaryDenisAfterYear = months * salaryDenisAfter;
        double differenceAnnualIncomeDenis = salaryDenisAfterYear - salaryDenisBeforeYear;
        System.out.println ("Денис теперь получает " + salaryDenisAfter + " рублей. Годовой доход вырос на "
                + differenceAnnualIncomeDenis + " рублей ");
        int salaryKristinaBefore = 76230;
        double salaryKristinaAfter = salaryKristinaBefore * percent;
        int salaryKristinaBeforeYear = months * salaryKristinaBefore;
        double salaryKristinaAfterYear = months * salaryKristinaAfter;
        double differenceAnnualIncomeKristina = salaryKristinaAfterYear - salaryKristinaBeforeYear;
        System.out.println ("Кристина теперь получает " + salaryKristinaAfter + " рублей. Годовой доход вырос на "
                + differenceAnnualIncomeKristina + " рублей ");































    }
}