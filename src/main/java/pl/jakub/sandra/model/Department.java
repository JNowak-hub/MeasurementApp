package pl.jakub.sandra.model;

public enum Department {

    PHYSICS(200),
    CHEMISTRY(300);

    private long salary;

    Department(long salary) {
        this.salary = salary;
    }

    public long getSalary() {
        return salary;
    }
}
