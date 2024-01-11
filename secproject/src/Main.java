public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee(67, "Aseel Abdulghafour", "Manager", 20000);

        System.out.println("Employee ID: " + employee1.getEmployeeId());
        System.out.println("Name: " + employee1.getName());
        System.out.println("Position: " + employee1.getPosition());
        System.out.println("Basic Salary: KD" + employee1.getBasicSalary());

        Employee employee = new Employee(22, "Fajer Mahmoud", "worker", 5000);
        Salary calculator = new Salary(employee);

        double overtimeHours = 8;
        double bonus = 4000;
        double deductions = 900;

        double totalSalary = calculator.calculateTotalSalary(overtimeHours, bonus, deductions);
        System.out.println("Total Salary for " + employee1.getName() + ": KD" + totalSalary);
        Employee employee2 = new Employee(45, "Loura Yousef", "Assistant", 1700);
        HistoryPayment paymentTracker = new HistoryPayment(employee2);

        paymentTracker.recordPayment(3400, "withdraw");
        paymentTracker.recordPayment(98000, "Check");

        paymentTracker.displayPaymentHistory();
    }

}