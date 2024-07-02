public class EmployJavaTechie {

 private int id;
 private String name;
 private int age;
 private String gender;
 private String department;
 private int yoe;

    @Override
    public String toString() {
        return "EmployJavaTechie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", yoe=" + yoe +
                ", salary=" + salary +
                '}';
    }

    private int salary;

    public EmployJavaTechie(int id, String name, int age, String gender, String department, int yoe, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yoe = yoe;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }

    public int getYoe() {
        return yoe;
    }

    public int getSalary() {
        return salary;
    }
}
