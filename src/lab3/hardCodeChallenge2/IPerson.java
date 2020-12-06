package lab3.hardCodeChallenge2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.DecimalFormat;

public interface IPerson {
    void walk();

    @LogExecutionTime
    void drink();

    String getName();


    class PersonInvocationHandler implements InvocationHandler {

        private Object target;
        public PersonInvocationHandler(Object target){
            this.target = target;
        }

        @Override
        public Object invoke(Object o, Method method, Object[] objects) throws Throwable { //Object[] objects refers to arguments
            long start = System.nanoTime();
            Object result = method.invoke(target,objects); //method refers to interface methods that were called
            long end = System.nanoTime();
            long execTime = end - start;
            double inSeconds = (double) execTime / 1000000; //execTime in seconds
            DecimalFormat numberFormat = new DecimalFormat("#.000");
            // filter for checking if the method has specific annotation
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                System.out.println("Duke has been drinking for P"+numberFormat.format(inSeconds)+"S");
            }
            return result;
        }
    }
}