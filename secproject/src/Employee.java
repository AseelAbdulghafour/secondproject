public class Employee {
    private int employeeId;
    private String name;
    private String position;
    private double basicSalary;

    public Employee(int employeeId, String name, String position, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.basicSalary = basicSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

}