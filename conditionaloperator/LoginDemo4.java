package org.opentutorials.javatutorials.conditionaloperator;
 
public class LoginDemo4 {
    public static void main(String[] args) {
        String id = args[0];
        String password = args[1];
        if ((id.equals("goldpenguin") || id.equals("goldpenguin93") || id.equals("goldpenguin993"))
                && password.equals("111111")) {
            System.out.println("right");
        } else {
            System.out.println("wrong");
        }
    }
}