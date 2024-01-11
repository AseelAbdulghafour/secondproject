public class Salary {
        private Employee employee;
    
        public Salary(Employee employee) {
            this.employee = employee;
        }
    
        public double calculateTotalSalary(double overtimeHours, double bonus, double deductions) {
            double overtimePay = overtimeHours * (employee.getBasicSalary() / 30);  
            double totalSalary = employee.getBasicSalary() + overtimePay + bonus - deductions;
            return totalSalary;
        }
    
}