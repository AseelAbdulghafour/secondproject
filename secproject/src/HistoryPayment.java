import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HistoryPayment {
    private Employee employee;
    private List<Payment> paymentHistory;

    public HistoryPayment(Employee employee) {
        this.employee = employee;
        this.paymentHistory = new ArrayList<>();
    }

    public void recordPayment(double amount, String paymentMethod) {
        Payment payment = new Payment(new Date(), amount, paymentMethod);
        paymentHistory.add(payment);
    }

    public void displayPaymentHistory() {
        System.out.println("Payment History for " + employee.getName() + ":");
        for (Payment payment : paymentHistory) {
            System.out.println("Date: " + payment.getDate() + ", Amount: KD" + payment.getAmount() +
                    " Procedure: " + payment.getPaymentMethod());
        }
    }

}

class Payment {
    private Date date;
    private double amount;
    private String paymentMethod;

    public Payment(Date date, double amount, String paymentMethod) {
        this.date = date;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }
}