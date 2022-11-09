package pack;

import java.lang.reflect.Array;

public class Main {

    private static Employee[] employees = Employee.employees;


    public static void main(String[] args) {

        Employee worker1 = new Employee("Ivanov Ivan Ivanovich", 1, 100000);
        Employee worker2 = new Employee("Ivanov Evgeniy Ivanovich", 2, 110000);
        Employee worker3 = new Employee("Ivanov Oleg Ivanovich", 1, 90000);
        Employee worker4 = new Employee("Ivanov Vasiliy Ivanovich", 5 , 100000);
        Employee worker5 = new Employee("Ivanov Michail Ivanovich", 4 , 100000);
        Employee worker6 = new Employee("Ivanov Arseniy Ivanovich", 3 , 100000);
        Employee worker7 = new Employee("Ivanov Alexandr Ivanovich", 2, 100000);
        Employee worker8 = new Employee("Ivanov Victor Ivanovich", 2, 100000);
        Employee worker9 = new Employee("Ivanov Ilya Ivanovich", 5, 100000);
        //Employee worker10 = new Employee("Ivanov Andrey Ivanovich", 1, 100000);



        printEmployees();
        System.out.println(salaryExpense());
        System.out.println(minSalary());
        System.out.println(maxSalary());
        System.out.println(averageSalary());
        printNames();



    }

    public static int getCount(){
        int count = 0;

        for (Employee i:
             employees) {
            if(i!=null){
                count++;
            }
        }
        return count;
    }
    public static void printEmployees(){
        for (Employee i :
                employees) {
            System.out.println(i);
        }

    }

    public static int salaryExpense() {
        int sum = 0;
        for (Employee i: employees) {
            if(i != null) {sum+=i.getSalary();}
        }
        return sum;
    }

    public static Employee minSalary(){
        Employee employee = employees[0];
        int minSalary = employees[0].getSalary();
        int count = 0;
        for (Employee i : employees) {
            if (i != null && i.getSalary()<minSalary){
                minSalary=i.getSalary();
                employee = i;
                count++;
            }
        }
        return employee;
    }

    public static Employee maxSalary(){
        Employee employee = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee i : employees) {
            if (i != null && i.getSalary()>maxSalary){
                maxSalary=i.getSalary();
                employee = i;
            }
        }
        return employee;
    }

    public static int averageSalary(){
        int allSalaries = salaryExpense();
        return allSalaries/getCount();
    }

    public static void printNames(){
        for (Employee i:
             employees) {
            if (i != null) {
                System.out.println(i.getName());
            }
        }
    }

    public static void changeSalary(int percent){
        for (Employee i :
                employees) {
            if (i!= null){
                i.setSalary((int)(i.getSalary()*(percent/100f)));
            }
        }
    }


    public static Employee minSalaryOfDepartment(int department){
        int minSalary = maxSalary().getSalary();
        Employee result = null;
        for (Employee i : employees) {
            if(department!=i.getDepartmentId()){
                continue;
            }
            if(i.getSalary()<minSalary){
                result=i;
            }
        }
        return result;
    }

    public static Employee maxSalaryOfDepartment(int department){
        int maxSalary = minSalary().getSalary();
        Employee result = null;
        for (Employee i : employees) {
            if(department!=i.getDepartmentId()){
                continue;
            }
            if(i.getSalary()>maxSalary){
                result=i;
            }
        }
        return result;
    }

    public static int averageSalaryOfDepartment(int department){
        int membersCount = 0;
        int allSalaries = 0;
        for (Employee i : employees) {
            if(department==i.getDepartmentId()){
                allSalaries+=i.getSalary();
                membersCount++;
            }
        }
        return allSalaries/membersCount;
    }

    public static void changeSalaryOfDepartment(int percent, int department){
        for (Employee i :
                employees) {
            if(department!=i.getDepartmentId()){
                continue;
            }
            if (i!= null){
                i.setSalary((int)(i.getSalary()*(percent/100f)));
            }
        }
    }

    public static void printEmployeesOfDepartment(int department){
        for (Employee i :
                employees) {
            if (department==i.getDepartmentId()) {
                System.out.println(i.getName() + " " + i.getSalary());
            }
        }
    }

    public static void printEmployeesWithLessSalary(int salary){
        for (Employee i :
                employees) {
            if (i.getSalary() < salary) {

                System.out.println(i);

            }
        }
    }

    public static void printEmployeesWithMoreSalary(int salary){
        for (Employee i :
                employees) {
            if (i.getSalary() >= salary) {
                System.out.println(i);
            }
        }
    }
}
