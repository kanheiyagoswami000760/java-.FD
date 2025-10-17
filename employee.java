class Employee {
    
    private int id;
    private double salary;

    
    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Invalid ID! ID must be positive.");
        }
    }


    public void setSalary(double salary) {
        if (salary >= 10000) {
            this.salary = salary;
        } else {
            System.out.println("Invalid Salary! Salary must be at least 10000.");
        }
    }

    
    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }


    public void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Salary: " + salary);
    }

    
    public static void main(String[] args) {
        Employee emp1 = new Employee();

        emp1.setId(101);
        emp1.setSalary(15000);
        emp1.display();

        System.out.println("\n--- Trying invalid values ---");
        emp1.setId(-5);
        emp1.setSalary(8000);
        emp1.display();
    }
}
