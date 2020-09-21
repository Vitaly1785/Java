package lesson5;

public class Main {
    public static void main(String[] args) {


        Employee[] empArr = new Employee[5];
        empArr[0] = new Employee("Ivanov Ivan", "Director", "ivandirector@box.ru", 8800400300l, 1000.00, 45);
        empArr[1] = new Employee("Petrova Tatiana", "Accountant", "tanechkaAcc@box.ru", 8900500300l, 800.00, 40);
        empArr[2] = new Employee("Semenov Semen", "Security", "semenDed@box.ru", 8800600200l, 500.00, 55);
        empArr[3] = new Employee("Dmitriev Dmitry", "Driver", "dmitry_driver@box.ru", 8900300400l, 300.00, 30);
        empArr[4] = new Employee("Snejana Denisova", "Secretary", "snejok15@box.ru", 8700400200l, 400, 25);
        for (int i = 0; i < empArr.length; i++) {
            if(empArr[i].getAge() > 30){
                empArr[i].printEmployee();
            }
        }
    }
}

