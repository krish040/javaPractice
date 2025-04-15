public class Imp {
    public static void main(String[] args) {
        
        Chair c=new Chair();

        //access child's property
        System.out.println(c.cname);
        c.printCname();
        
        //access parents's property
        System.out.println(c.origin);
        c.printOrigin();

        // Plastic p=new Plastic();
        // System.out.println(p.cname); //CTE parent accessig child's property
    }
}
