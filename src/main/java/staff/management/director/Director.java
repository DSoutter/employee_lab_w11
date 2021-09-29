package staff.management.director;

import staff.Employee;
import staff.management.Manager;

public class Director extends Employee {

    private double budget;

    public Director(String name, String niNumber, double salary, double budget) {
        super(name, niNumber, salary);
        this.budget = budget;
    }


    public double getBudget() {
        return this.budget;
    }
}
