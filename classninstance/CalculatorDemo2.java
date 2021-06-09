package org.opentutorials.javatutorials.classninstance;

public class CalculatorDemo2 {
 
    public static void main(String[] args) {
 
        Calculator2 c1 = new Calculator2();
        c1.setOprands(10, 20);
        // 30 출력
        c1.sum();
 
        Calculator2 c2 = new Calculator2();
        c2.setOprands(20, 40);
        // 60 출력
        c2.sum();
 
        // 클래스 변수 base의 값을 10으로 지정했다.
        Calculator2.base = 10;
 
        // 40 출력
        c1.sum();
 
        // 70 출력
        c2.sum();
 
    }
 
}