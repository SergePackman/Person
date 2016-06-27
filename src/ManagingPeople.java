/**
 * Created by Serge on 27.06.2016.
 */
public class ManagingPeople {
    public static void main(String[] args) {
        Person p1 = new Person("Arial", 37);
        Person p2 = new Person("Joseph", 15);
        System.out.println(p1);
        System.out.println(p2);
        if (p1.getAge() == p2.getAge()) {
            System.out.println(p1.getAge() + " is the same age as " + p2.getAge());} else {
            System.out.println(p1.getAge() + " is NOT the same age as "+ p2.getAge());
        }
    }
}
