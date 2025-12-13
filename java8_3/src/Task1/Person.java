package Task1;

public class Person {

    private String name;
    private int age;
    private String city;

    public Person(String name, int age, String city) {
        this.name = name;
        this.age  = age;
        this.city = city;
    }

    int getAge() {
       return this.age;
    }

    String getCity() {
        return this.city;
    }

    @Override
    public String toString() {
        return "Task1.Person{" + "name=" + name + ", age=" + age + ", city=" + city + '}';
    }


}