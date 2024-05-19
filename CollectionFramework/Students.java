package CollectionFramework;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Students {
    String name;
    int roll_no;
    int age;
    double weight;

    public Students(String name, int roll_no, int age, double weight) {
        this.name = name;
        this.roll_no = roll_no;
        this.age = age;
        this.weight = weight;
    }

    public Students() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Students \n {"   +
                "name='"     + name + '\'' +
                ", roll_no=" + roll_no +
                ", age="     + age +
                ", weight="  + weight +
                '}';
    }
}
class ShortByAge implements Comparator<Students> {

    @Override
    public int compare(Students a, Students b) {
        return a.age-b.age;
    }
}
class Main{
    public static void main(String[] args) {
        Students s1=new Students();
        ArrayList<Students> stud=new ArrayList<>();
        stud.add(new Students("vaishali",2,12,36.5));
        stud.add(new Students("1vaishali",6,14,16.5));
        stud.add(new Students("2vaishali",4,16,46.5));
        stud.add(new Students("3vaishali",1,18,76.5));
      //  System.out.println(stud);
//        for (Students stu: stud){
//            System.out.println(stu);
//        }
        Collections.sort(stud,new ShortByAge());
        //Print after sorting by age
        System.out.println("Shorted by age:-");
        System.out.println(stud);

    }


}