package src.java.JavaCore.NestedClass;

class OuterClass {
    private static String name = "Outer Class";
    private int x = 10;


    // static nested class
    static class NestedClass {
        public void printName() {
            System.out.println("Static Nested Class: " + name);
        }
    }


    // inner class
    public class InserClass {
        public void printX() {
            System.out.println("Inner Class: " + x);
        }
    }


    // local class
    public String sayHello(String name) {
        int cnt = 20;    // mặc đinh default int cnt = 0;

        // local class
        class WelcomeMessage {
            WelcomeMessage(){
            }
            String getMessage() {
                return "Welcome";
            }

            void showName(){    //Only valid from Java 8
                System.out.println(name);
            }
        }

        WelcomeMessage msg = new WelcomeMessage();
        return "Local Class: " + msg.getMessage() + " " + name + " to the Java world !";
    }



    interface Person {
        String getName();
    }

    // Annonymous Class
    public void hello(){
        // Anonymous Classes
        Person john = new Person(){
            @Override
            public String getName() {
                return "Anonymous Class";
            }
        };
        System.out.println(john.getName());
    }


}

public class NestedClass {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();

        // static nested class
        OuterClass.NestedClass nestedClass = new OuterClass.NestedClass();
        nestedClass.printName();


        // inner class
        OuterClass.InserClass inserClass = outerClass.new InserClass();
        inserClass.printX();

        // local class
        String str = outerClass.sayHello("Tiến");
        System.out.println(str);

        //Anonymous class
        outerClass.hello();


    }
}
