/*
 *Link:  https://www.javatpoint.com/package

   - A java package is a group of similar types of classes, interfaces and sub-packages.

 *
    - How to access package from another package?

       There are three ways to access the package from outside the package.

            1. import package.*;
            2. import package.classname;
            3. fully qualified name.



        1) Using packagename.*
            + If you use package. then all the classes and interfaces of this package will
              be accessible but not subpackages.

            + The import keyword is used to make the classes and interface of another package
              accessible to the current package.
          *
          Ex:
          *     //save by A.java
          *
          *     //save by B.java
                package mypack;
                import pack.*;




        2) Using packagename.classname
            + If you import package.classname then only declared class of this package will be accessible.

        Ex:
        *       //save by A.java
        *       //save by B.java
                package mypack;
                import pack.A;




        3) Using fully qualified name
            + If you use fully qualified name then only declared class of this package will be accessible.
            + Now there is no need to import.
            + But you need to use fully qualified name every time when you are accessing the class or interface.

             *
           Ex:
           *    //save by A.java
                package pack;

                //save by B.java
                package mypack;


 * */

package src.java.JavaCore.OOP.JavaOOPs.Encapsulation.Package;


public class Package {
    public static void main(String args[]){
        System.out.println("Welcome to package");
    }

}
