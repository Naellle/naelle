import java.util.Scanner;

public class clc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double summa, rate, result;
        double payMonthly;

        System.out.println("Выберите тип клиента: ");
        String s = scanner.nextLine();

        switch (s) {
            case "human":
                System.out.println("Введите сумму: ");
                summa = scanner.nextDouble();
                System.out.println("Ежемесячный платеж и процентная ставка 10%: " + (summa / 100.0) * 10.0);
                rate = (summa / 100) * 10;
                result = (summa + rate);
                payMonthly = 1;
                System.out.println("Общая сумма к оплате: " + result);
            while (true) {
                System.out.println("Ежемесячный платеж" + rate++);
                payMonthly = 1;
                if (payMonthly > 1)
                    System.out.println();
                break;

            case "business":
                System.out.println("Введите сумму: ");
                summa = scanner.nextDouble();
                System.out.println("Ежемесячный платеж: " + (summa / 100) * 10);
                System.out.println("Процентная ставка: 10%");
                rate = (summa / 100) * 10;

                System.out.println("процентная ставка 10%");
                result = (summa + rate);
                System.out.println("Общая сумма к оплате: " + result);
                while (true) {
                    System.out.println("Ежемесячный платеж" + rate++);
                    payMonthly = 1;
                    if (payMonthly > 12)
                        System.out.println();
                    break;
                break;
            default:
                System.out.println("Штош, вы нам не подходите, идите домой");


        }

    }
}

