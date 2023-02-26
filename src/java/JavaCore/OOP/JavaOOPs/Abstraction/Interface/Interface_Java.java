/*
*   - Một Interface trong Java là một bản thiết kế của một lớp. Nó chỉ có các phương thức trừu tượng.
*     Interface là một kỹ thuật để thu được tính trừu tượng hoàn toàn và đa kế thừa trong Java.
*     Interface trong Java cũng biễu diễn mối quan hệ ( IS-A )
*
*
* syntax:
*       interface interface_name {
            // declare constant fields
            // declare methods that abstract
            // by default.
        }
*
    - Interface đại diện cho mối quan hệ "HAS-A"
*
* */

package src.java.JavaCore.OOP.JavaOOPs.Abstraction.Interface;

interface Draw {
    void draw();
}

//Implementation: by second user
class Rectangle_ implements Draw {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}

class Circle implements Draw {
    public void draw() {
        System.out.println("drawing circle");
    }
}

public class Interface_Java {
    public static void main(String[] args) {
        Draw drawable = new Rectangle_();
        Draw d = new Circle(); //In real scenario, object is provided by method e.g. getDrawable()

        drawable.draw();
        d.draw();
    }
}


