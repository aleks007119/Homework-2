public class Main {
    public static void main(String[] args) {
        // Задание 1
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4L;

        float f = 1.0f;
        double d = 2.0;

        boolean bool = true;
        char c = 'C';

        // Задание 2
        float firstBoxer = 78.2f;
        float secondBoxer = 82.7f;
        float totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес двух бойцов " + totalWeight + " кг.");

        float weightDifference = Math.abs(firstBoxer - secondBoxer);
        System.out.println("Разница в весе бойцов состовляет " + weightDifference + " кг.");

        // Задание 3
        byte banana = 5;
        byte milk = 200 / 100;
        byte iceCream = 2;
        byte rawEggs = 4;

        float weightOneBanana = 80f;
        float weightOneMilk = 105f;
        float weightOneIceCream = 100f;
        float weightOneEgg = 70f;

        float weightSportsBreakfast = (weightOneBanana * banana) + (weightOneMilk * milk) + (weightOneIceCream * iceCream) + (weightOneEgg * rawEggs);
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

        double awerageNumberOfDays = (weightLossDaysOne + weightLossDaysTwo) / (2 * 1.0);

        System.out.println("В среднем, спортсмен похудеет за " + awerageNumberOfDays + " дней.");

        // Задание 5
        int percent = 10;
        double muitiplier = percent / (100 * 1.0);

        int mashaSalary = 67_760;
        int denisSalary = 83_690;
        int kristinaSalary = 76_230;

        int mashaNewSalary = (int) (mashaSalary + (mashaSalary * muitiplier));
        int denisNewSalary = (int) (denisSalary + (denisSalary * muitiplier));
        int kristinaNewSalary = (int) (kristinaSalary + (kristinaSalary * muitiplier));

        int mashaDifference = (mashaNewSalary - mashaSalary) * 12;
        int denisDifference = (denisNewSalary - denisSalary) * 12;
        int kristinaDifference = (kristinaNewSalary - kristinaSalary) * 12;

        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaDifference + " рублей.");
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisDifference + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaDifference + " рублей.");

    }
}