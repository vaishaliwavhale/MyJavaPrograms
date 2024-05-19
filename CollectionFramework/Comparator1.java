package CollectionFramework;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Comparator1 {
    String name ;
    int age;
    double weight;

    public Comparator1(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "\nList of Students sorted by their names:-->{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}
class ShorByName implements Comparator<Comparator1>{
    @Override
    public int compare(Comparator1 o1, Comparator1 o2){
        return o1.getName().compareTo(o2.getName());
    }
}
class Main1{
    public static void main(String[] args) {
        ArrayList<Comparator1> list=new ArrayList<>();
        list.add(new Comparator1("vaishali",16,20.5));
        list.add(new Comparator1("Teju",22,45.20));
        list.add(new Comparator1("Huda",22,50.5));
        list.add(new Comparator1("Sonali",23,48.60));

        ShorByName s1=new ShorByName();
        Collections.sort(list,s1);
        System.out.println(list);

    }
    Comparator<Comparator1> sortByName=(Comparator1 o1,Comparator1 o2) ->o1.getName().compareTo(o2.getName());

}
