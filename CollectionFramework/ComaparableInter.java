package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class

ComaparableInter implements Comparable <ComaparableInter>{
   String name;
   int id;
   double salary;


    public ComaparableInter(String name,int id,double salary) {
        this.name = name;
        this.id=id;
        this.salary=salary;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    public static void main(String[] args) {
        //In comparable Interface there is 'compareTo();' method is present
        ArrayList<ComaparableInter> a=new ArrayList<ComaparableInter>();
        a.add(new ComaparableInter("Vaishali",1,265.02));
        a.add(new ComaparableInter("Teen",3,16000.00));
        a.add(new ComaparableInter("Minal",2,3365.02));
        Collections.sort(a);
        System.out.println(a);
    }

    @Override
    public String toString() {
        return "List of Employee  \n{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}';
    }

    @Override
    public  int  compareTo(ComaparableInter o) {

        return this.id - o.id;

    }


}

