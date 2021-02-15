package lab9.test;

public class StringTest {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = new String("HelloWorld");
        String str4 = str1 + str2;
        String str5 = str1 + str2;
        String str6 = str1.concat(str2);

        String str7 = "HelloWorld";
        String str8 = "HelloWorld";

        //System.out.println(str5 == str7);
        System.out.println("");

        foo(true, true);
        foo(true, false);
        foo(false, true);
        foo(false, false);
    }

    public static void foo(boolean a, boolean b){
        if(a){
            System.out.println("A");
        }
        else if(a && b){
            System.out.println("A && B");
        }
        else{
            if(!b){
                System.out.println("notB");
            }
            else{
                System.out.println("ELSE");
            }
        }
    }


}
