public class Student implements Comparable<Student>{
    int roll;
    String name;

    Student(int roll,String name){
        this.name=name;
        this.roll=roll;
    }

    @Override
    public String toString() {
        return "roll= " + roll + " ,name= " + name + "\n";
    }

    @Override
    public int compareTo(Student s) {
        return this.roll-s.roll;
    }

}
