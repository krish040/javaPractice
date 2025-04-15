interface A{
    static int a=7;
    int b=8; // it is not -> non static , it is static public final (by nature)

    void m1();// non static ab method-> public by default , will be overrided
    
    default void m2(){
        System.out.println("in interface");
    } // by default = default non static 

    static void m3(){
        System.out.println("static method in interface");
    } // by default public 
    
    public static void main(String[] args){
        System.out.println("you are in A");
        A.m3();
    }

}