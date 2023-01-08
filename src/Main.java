public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        // a - Сумма кредита
        // b - Количество месяцев (кол-во платежей)
        // с - процент по кредиту

        System.out.println("Ваш ежемесячный платёж составляет: "+ service.x(1_000_000, 12,9.99));
        System.out.println("Ваш ежемесячный платёж составляет: "+ service.x(1_000_000, 24,9.99));
        System.out.println("Ваш ежемесячный платёж составляет: "+ service.x(1_000_000, 36,9.99));
    }
}
