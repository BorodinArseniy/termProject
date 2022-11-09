package pack;

public class Employee {
    private String name;
    private int departmentId;
    private int salary;
    private static int idCount;
    public int id;

    public static Employee[] employees = new Employee[10];


    public Employee(String name, int departmentId, int salary) {
        this.name = name;
        this.departmentId = departmentId;
        this.salary = salary;
        this.id = idCount++;
        employees[id] = this;

    }

    public String getName() {
        return name;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public int getSalary() {
        return salary;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departmentId=" + departmentId +
                ", salary=" + salary +
                '}';
    }


}
