class Debasisoperator{
    public static void main(String[] args){
        byte a=5;
        byte b=7;
        //byte c=a+b; //Promotion to int
        byte c=5+7;
        //System.out.println(a+b); // 12

        c=++a; //6 //do not Promote to int
        //c=++a + ++b; //Promotion to int
        //System.out.println(c); // 6

        short s1=32767;
        short s2=7;
        //short s3=s1+s2;//possible lossy conversion from int to short
        short s3=++s1; // as in memory it will be stored in circular format then ans is -32768 
        //short s4=++s1 + ++s2; // promotion to int
        //System.out.println(s1+s2); // 12
        //System.out.println(s3);

        char c1='a';
        char c2='b';
        //char c3=c2+c1;//possible lossy conversion from int to
        //char c3=++c1;
        //char c3=++c1 + ++c2; //lossy conversion from int to char
        //System.out.println(c3);//b
        
        System.out.println(c1+c2);//97+98=195
        System.out.println(c1+'b'); //195
        System.out.println("a"+"b");//ab

        System.out.println(c1+"b");//ab

        

    
    }
}