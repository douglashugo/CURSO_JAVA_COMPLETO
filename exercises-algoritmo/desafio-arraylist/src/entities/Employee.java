package entities;

public class Employee {

    private Integer id;
    private String name;
    private Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        salary += salary * percentage / 100.0;
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %.2f ", id, name, salary);
    }
}
