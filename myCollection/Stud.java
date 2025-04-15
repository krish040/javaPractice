import java.util.HashSet;

public class Stud {

    String ename;
    int eid;
    boolean m_status;

    Stud(){

    }

    Stud(String ename,int eid,boolean m_status){
        this.ename=ename;
        this.eid=eid;
        this.m_status=m_status;
    }

    @Override
    public String toString() {
        return "Stud [ename=" + ename + ", eid=" + eid + ", m_status=" + m_status + "]";
    }

    public static void main(String[] args) {
       HashSet s=new HashSet();
    //    s.add(new Stud("dev",101,true));
    //    s.add(new Stud("devi",102,false));
       s.add(4);
       s.add(65);
       s.add(273);
       s.add(7);
       Integer i=4;
       System.out.println(i.hashCode());//4
       Integer i1=65;
       System.out.println(i1.hashCode());//65
       Integer i2=273;
       System.out.println(i2.hashCode());//273
       Integer i3=7;
       System.out.println(i3.hashCode());//7
       System.out.println(s);
    }
}
