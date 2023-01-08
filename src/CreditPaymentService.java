public class CreditPaymentService {
    public double x(int a, int b, double c){
        // a - Сумма кредита
        // b - Количество месяцев (кол-во платежей)
        // с - процент по кредиту
        // y - процентная ставка (в виде десятичной дроби) в месяц, равная годовой процентной ставке разделенной на 12 месяцев
        double y= c/12/100;
        double z= Math.pow((1+y),b);
        double index = (y*z)/(z-1);
        int annuityPayment= (int) (a * index);
        return annuityPayment;
        }
    }