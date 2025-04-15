import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
    int roll;
    String name;

    Student(int roll,String name){
        this.roll=roll;
        this.name=name;
    }

    @Override
    public int compareTo(Student s) {
        return this.roll - s.roll;
        //throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }
    public static void main(String [] args){
        ArrayList<Student> al=new ArrayList<>();
        al.add(new Student(1,"dev1"));
        al.add(new Student(23,"dev3"));
        al.add(new Student(13,"dev2"));
        al.add(new Student(45,"dev4"));
        
        Collections.sort(al);
        System.out.println(al);
    }

    @Override
    public String toString() {
        return "Roll: " + roll + ", Name: " + name;
    }  
} 

// ArrayList<Integer> al1=new ArrayList<>();
// al1.add(4);
// al1.add(5);
// al1.add(3);
// System.out.println(al1); // to string overrided