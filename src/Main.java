public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte b = 1;
        short s = 1;
        int i = 1;
        long l = 1L;

        float f = 1.1f;
        double d = 1.1;

        // Задание 2
        float firstBoxer = 78.2f;
        float secondBoxer = 82.7f;
        float totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг.");

        float weightDifference = secondBoxer - firstBoxer;
        System.out.println("Разница в весе бойцов состовляет " + weightDifference + " кг.");

        // Задание 3
        byte banane = 5;
        byte milk = 2;
        byte iceCream = 2;
        byte rawEggs = 4;

        float weightOneBanana = 80f;
        float weightOneMilk = 105f;
        float weightOneIceCream = 100f;
        float weightOneEgg = 70f;

        float weightSportsBreakfast = (weightOneBanana * banane) + (weightOneMilk * milk) + (weightOneIceCream * iceCream) + (weightOneEgg * rawEggs);
        System.out.println("Вес завтрака в граммах = " + weightSportsBreakfast + " грамм.");

        float kilogram = 1000f;
        float weightInKilograms = weightSportsBreakfast / kilogram;

        System.out.println("Вес завтрака в киллограмах = " + weightInKilograms + " киллограм.");

        // Задание 4
        short excessWeight = 7000;
        short weightLossOne = 250;
        short weightLossTwo = 500;

        int weightLossDaysOne = (excessWeight / weightLossOne) % excessWeight;
        int weightLossDaysTwo = (excessWeight / weightLossTwo) % excessWeight;

        System.out.println("При похудении в 250 грамм, спортсмен похудеет за " + weightLossDaysOne + " дней.");
        System.out.println("При похудении в 500 грамм, спортсмен похудеет за " + weightLossDaysTwo + " дней.");

        int awerageNumberOfDays = (weightLossDaysOne + weightLossDaysTwo) / 2;

        System.out.println("В среднем, спортсмен похудеет за " + awerageNumberOfDays + " дней.");

        // Задание 5
        float masha = 67.760f;
        float denis = 83.690f;
        float christina = 76.230f;
        byte year = 12;
        // Добавляем зарплату за месяц.
        float salaryIncreaseMasha = (masha / 100) * 10;
        float salaryIncreaseDenis = (denis / 100) * 10;
        float salaryIncreaseChristina = (christina / 100) * 10;
        // Новая зарплата за месяц.
        float newSalaryMonthMasha = masha + salaryIncreaseMasha;
        float newSalaryMonthDenis = denis + salaryIncreaseDenis;
        float newSalaryMonthChristina = christina + salaryIncreaseChristina;
        // Старая зарплата за год.
        float oldSalaryYearMasha = masha * year;
        float oldSalaryYearDenis = denis * year;
        float oldSalaryYearChristina = christina * year;
        // Новая зарплата за год.
        float newSalaryYearMasha = newSalaryMonthMasha * year;
        float newSalaryYearDenis = newSalaryMonthDenis * year;
        float newSalaryYearChristina = newSalaryMonthChristina * year;
        // Разница годового дохода.
        float incomeDifferenceMasha = newSalaryYearMasha - oldSalaryYearMasha;
        float incomeDifferenceDenis = newSalaryYearDenis - oldSalaryYearDenis;
        float incomeDifferenceChristina = newSalaryYearChristina - oldSalaryYearChristina;

        System.out.println("Маша теперь получает " + newSalaryMonthMasha + " рублей. Годовой доход вырос на " + incomeDifferenceMasha + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryMonthDenis + " рублей. Годовой доход вырос на " + incomeDifferenceDenis + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryMonthChristina + " рублей. Годовой доход вырос на " + incomeDifferenceChristina + " рублей.");
    }
}