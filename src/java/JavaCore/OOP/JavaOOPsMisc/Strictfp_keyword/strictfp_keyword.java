/*
*   Từ khóa strictfp là gì ?
        => Từ khóa strictfp là một ( non-access modifier ) giúp bảo đảm rằng kết quả tính toán trên các
*          số thực sẽ có kết quả như nhau (phần sau dấu thập phân) trên các nền tảng khác nhau.
*
*
*       => strictfp chỉ sử dụng với class, interface và method.
*
*
*
*   Ex:
*       class Test {
            // all concrete methods here are
            // implicitly strictfp.
        }

        strictfp interface check {
            // all  methods here becomes implicitly
            // strictfp when used during inheritance.
        }

        class Car {
            // strictfp applied on a concrete method
            strictfp void calculateSpeed(){}
        }

* */

package src.java.JavaCore.OOP.JavaOOPsMisc.Strictfp_keyword;

public class strictfp_keyword {
    // calculating sum using strictfp modifier
    public double sum() {
        double num1 = 1e+10;
        double num2 = 2e+08;
        return (num1 + num2);
    }

    public static void main(String[] args) {
        System.out.println(new strictfp_keyword().sum());
    }
}
