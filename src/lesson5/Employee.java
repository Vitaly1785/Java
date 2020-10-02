package lesson5;

public class Employee {
    private String name;
    private String position;
    private String email;
    private long phoneNumber;
    private double salary;
    private int age;

    Employee(String name, String position, String email, long phoneNumber, double salary, int age) {
        this.name = name.toUpperCase();
        this.position = position.toUpperCase();
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printEmployee() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Name: " + name + " Position: " + position + " Email: " + email + " PhoneNumber: " + phoneNumber + " Salary: $" + salary + " Age: " + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
