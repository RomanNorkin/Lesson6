package Lesson6;

public class Employees {

    /*
     * Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст
     * Конструктор класса должен заполнять эти поля при создании объекта
     * Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
     */
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Романова Стефания Антоновна", "Инженер", "roms@mail.ru", "892312312",55000,41);
        employee[1] = new Employee("Голубев Леонид Даниилович", "Инженер", "leo.golub@gmail.com", "892313315",50000,32);
        employee[2] = new Employee("Киселев Михаил Максимович", "Менеджер", "mihakis@yandex.ru", "896317335",35000,43);
        employee[3] = new Employee("Новикова Татьяна Игоревна", "Замдиректор", "novtanya@yandex.ru", "892322306",70000,18);
        employee[4] = new Employee("Сорокин Роман Матвеевич", "Директор", "romansoroka@yendex.ru", "891312714",95000,21);
        for (Employee i : employee)
            if (i.getAge()>35)
                System.out.println(i);

    }
}
class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    @Override
    public String toString(){
        return(name+ "\n-"
                +position+ "\n-"
                +email+ "\n-"
                +phone+ "\n-"
                +salary+ "\n-"
                +age);
    }
}