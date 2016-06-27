/**
 * Created by Serge on 27.06.2016.
 */
public class Person {
    private String Name;
    private int age;
    public Person(String n, int a){Name = n; age = a;}
    public int getAge() {return age;}
    public void setAge(int a){age = a;}
    public String getName() {return Name;}
    public void setName(String n){Name = n;}
    public String toString(){String p1="Student Name:\t"+getName()+"\n"+"Student Age:\t"+getAge()+"\n- - - - - - ";return p1;}
}
