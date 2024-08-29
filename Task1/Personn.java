public class Personn
{
    private String name;
    private int age;

    public Personn(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public void display()
    {
        System.out.println("Name: " + name );
        System.out.println("Age: " + age);
    }
    public class Employee extends Personn
    {
        private int employeeid;
        private double salary;

        public Employee(String name, int age, int employeeid, double salary)
        {
            super(name, age);
            this.employeeid = employeeid;
            this.salary = salary;
        }
        // Method to display employee information
        @Override
        public void display()
        {
            super.display();
            System.out.println("Employee ID: " + employeeid );
            System.out.println("Salary: " + salary);
        }
    }
        public static void main(String[] args)
        {
            // Create an Employee object
            Employee emp = new Employee("John Doe", 30, 12345, 75000.0);

            // Display the Employee information
            emp.display();
        }
    }




