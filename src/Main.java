public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        //int x = 1_000_000;
        //int y = 12;
        //float z = (float) 9.99;
        System.out.println();
        System.out.println("Ежемесячный платеж при сроке кредитования 12 месяцев(-ца):   ");
        System.out.println(service.calculate(1_000_000, 12, (float) 9.99));

        System.out.println();
        System.out.println("Ежемесячный платеж при сроке кредитования 24 месяцев(-ца):   ");
        System.out.println(service.calculate(1_000_000, 24, (float) 9.99));

        System.out.println();
        System.out.println("Ежемесячный платеж при сроке кредитования 36 месяцев(-ца):   ");
        System.out.println(service.calculate(1_000_000, 36, (float) 9.99));

    }

}
