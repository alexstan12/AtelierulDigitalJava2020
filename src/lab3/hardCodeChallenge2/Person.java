package lab3.hardCodeChallenge2;

import java.lang.reflect.Proxy;

public class Person implements  IPerson {
    private String name;

    @Override
    public void walk() {
        System.out.println(this.name + " is walking!");
    }

    @Override
    public void drink() {
        System.out.println(this.name + " is drinking!");
    }

    @Override
    public String getName() {
        return this.name;
    }

    private Person(Builder builder) {
        this.name = builder.name;
    }


    public static class Builder {
        private String name;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public IPerson build(){
            //dynamic proxy
            //intercept methods with proxy after running them
            Person person = new Person(this);
            return (IPerson) Proxy.newProxyInstance(PersonInvocationHandler.class.getClassLoader(), new Class[]{IPerson.class},
                    new PersonInvocationHandler(person));
                //The invoke method of Invocation handler(3rd parameter in newProxyInstance) gets called
                //for every method that the dynamically generated class has to implement
                // from the interface(2nd parameter in newProxyInstance)
        }
    }
}
