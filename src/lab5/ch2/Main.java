package lab5.ch2;

public class Main {
    public static void main(String[] args) {
        Running r1 = new Running("Red", 22);
        Running r2 = new Running("Red", 22);
        Boot boot = new Boot("Red", 21);
        Pair<Running> pair = null;
        try{
             pair = new Pair(r1,boot);
        }catch(ShoesDontMatch e){
            try {
                pair = new Pair(r1, r2);
            }catch(ShoesDontMatch e2){
                System.out.println("don't match");
            }
        }

    }
}
