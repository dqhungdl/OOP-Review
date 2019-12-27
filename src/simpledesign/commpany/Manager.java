package simpledesign.commpany;

import java.util.List;

public class Manager extends Employee {

    private List<Employee> employees;

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public int countTask() {
        int cnt = tasks.size();
        for (Employee employee : employees)
            cnt += employee.countTask();
        return cnt;
    }

    @Override
    public void displayInfo() {
        System.out.print("Manager: " + name);
    }
}
