package Task1;

import java.util.ArrayList;

public class ComparingPerson{

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Zeeshan", 29, "Lahore"));
        people.add(new Person("Mustafa", 21, "Helsinki"));
        people.add(new Person("Faizan", 33, "Lahore"));
        people.add(new Person("Esha", 23, "Lahore"));

        people.sort((p1, p2) -> Integer.compare(p1.getAge(), p2.getAge()));
        people.removeIf(p -> p.getCity().equals("Helsinki"));



        for (Person p : people) {
            System.out.println(p);
        }
    }
}
