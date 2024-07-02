public class Employee {

    private String name;

    private int id;

    private String city;

    public Employee(String name, int id, String city) {
        this.name = name;
        this.id = id;
        this.city = city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(int id) {
        this.id = id;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                '}';
    }

    public String getCity() {
        return city;
    }
}
