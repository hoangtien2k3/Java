/*
*   Ex:
        3
        ([A-Z])(.+)
        [AZ[a-z](a-z)
        batcatpat(nat
* */

package Hackerrank_Solution.Java_Solutions;

public class Pattern_Syntax_Checker {
    public static void main(String[] args){
        java.util.Scanner in = new java.util.Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases > 0){
            String pattern = in.nextLine();
            try{
                java.util.regex.Pattern reg = java.util.regex.Pattern.compile(pattern);
                System.out.println("Valid");
            } catch (Exception e){
                System.out.println("Invalid");
            } finally {
                testCases--;
            }
        }
    }
}
