package org.opentutorials.javatutorials.Inheritance.example1;

public class CalculatorDemo1 {
	 
    public static void main(String[] args) {
 
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
 
}

//이것이 가능한 이유는 extends Calculator 때문이다. 이것은 클래스 Calculator를 상속 받는다는 의미다. 
//따라서 SubstaractableCalculator는 Calculator에서 정의한 메소드 setOprands, sub, avg를 사용할 수 있게 된다. 
//이것이 프로그래밍의 역사에서 대단한 진전으로 평가받는 상속의 기본적인 의미다. 상속을 통해서 코드의 중복을 제거할 수 있었고,
//또 부모 클래스을 개선하면 이를 상속받고 있는 모든 자식 클래스들에게 그 혜택이 자동으로 돌아간다.
//다시 말해서 유지보수가 편리해진다는 것이다.  
//재활용성과 중복의 제거, 그리고 유지보수의 편의는 서로 다른 목적으로 가지고 있지만, 
//하나가 좋아지면 자연스럽게 다른 쪽도 좋아지는 관계에 있다는 것을 다시 한 번 환기해주는 대목이다.