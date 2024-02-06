package ch05;

public class SalaryManager {
    public static void main(String[] args) {
        SalaryManager man = new SalaryManager();
        System.out.println(man.getMontlySalary(20_000_000));


    }
    public double getMontlySalary(int yearlySalary){
        double monthSalary = yearlySalary / 12.0;
        double tax = calculateTax(monthSalary);
        double pension = calculateNationlPension(monthSalary);
        double insurance = calculateHealthInsurance(monthSalary);

        double taxTotal = tax + pension + insurance;
        monthSalary -= taxTotal;
        return monthSalary;
    }
    public double calculateTax(double monthSalary){
        return monthSalary * 0.125;
    }
    public double calculateNationlPension(double monthSalary){
        return monthSalary * 0.081;
    }
    public double calculateHealthInsurance(double monthSalary){
        return monthSalary * 0.135;
    }
}
