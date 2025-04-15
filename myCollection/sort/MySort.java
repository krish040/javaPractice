import java.util.ArrayList;
import java.util.Collections;

public class MySort{
    public static void main(String [] args){
        ArrayList<Student> al= new ArrayList<>();
        al.add(new Student(2,"stud25"));
        al.add(new Student(10,"stud17"));
        al.add(new Student(6,"stud66"));
        al.add(new Student(3,"stud34"));
        al.add(new Student(8,"stud48"));
        al.add(new Student(5,"stud15"));
        al.add(new Student(1,"stud17"));
        al.add(new Student(4,"stud48"));
        al.add(new Student(9,"stud19"));
        al.add(new Student(7,"stud70"));

        // System.out.println(al);
        Collections.sort(al,new SortByName());
        // System.out.println(al);
        System.out.println(0x10);
        System.out.println(011);

    }
}