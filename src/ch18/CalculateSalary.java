package ch18;

public class CalculateSalary {
    public static void main(String[] args) {
        CalculateSalary sal = new CalculateSalary();
        sal.calaculateSalaries();
    }
    public long getSalaryIncrease(Employee employee){
        switch(employee.getType()){
            case 1:
                return -95;
            case 2:
                return 10;
            case 3:
                return 20;
            case 4:
                return 30;
            case 5:
                return 100;
        }
        return 0;
    }
    public void calaculateSalaries(){
        Employee[] arr = new Employee[5];
        arr[0] = new Employee("LeeDaeRi", 1, 1_000_000_000);
        arr[1] = new Employee("KimManager", 2, 100_000_000);
        arr[2] = new Employee("WhangDesign", 3, 70_000_000);
        arr[3] = new Employee("ParkArchi", 4, 80_000_000);
        arr[4] = new Employee("LeeDevelop", 5, 60_000_000);

        for(Employee emp : arr){
            System.out.println(emp.getName() + "=" + emp.getSalary() * (getSalaryIncrease(emp) + 100) / 100);
        }
    }
}
