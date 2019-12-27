package simpledesign.commpany;

import java.util.List;

public abstract class Employee {

    protected String name;
    protected List<String> tasks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void setTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    public abstract void displayInfo();

    public int countTask() {
        return tasks.size();
    }
}
