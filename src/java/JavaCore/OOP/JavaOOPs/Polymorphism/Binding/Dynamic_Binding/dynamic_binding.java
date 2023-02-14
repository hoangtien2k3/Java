/*
    Định nghĩa:
*   Gắn kết (binding) có nghĩa là một liên kết của lời gọi phương thức với định nghĩa phương thức.
*   Có hai loại gắn kết là: Static và Dynamic Binding trong Java.
 *
*
* */


package src.java.JavaCore.OOP.JavaOOPs.Polymorphism.Binding.Dynamic_Binding;

class Animal{
    void eat(){
        System.out.println("animal is eating...");
    }
}

class dynamic_binding extends Animal{
    void eat(){
        System.out.println("dog is eating...");
    }

    public static void main(String args[]){
        Animal a = new dynamic_binding();
        a.eat();

//        new Animal().eat();
    }
}
