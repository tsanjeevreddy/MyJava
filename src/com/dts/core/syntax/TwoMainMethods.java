package com.dts.core.syntax;

public class TwoMainMethods {

    // Always this method JVM identifies as Entry Point
    public static void main(String[] as){
       System.out.println("Main 1");
       main();
    }
    public static void main(){
        System.out.println("Main 2");
        main(1000);
    }
    public static void main(int a){
        System.out.println("Main 3 " + a);
        main("Sanjeev");
    }
    public static void main(String s){
        System.out.println("Main 4 " + s);
        Boolean ab = main(true);
        System.out.println("Main 5 " + ab);
    }
    public static Boolean main(Boolean b){
        return true;
    }
}
