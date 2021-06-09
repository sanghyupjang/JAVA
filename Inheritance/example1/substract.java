package org.opentutorials.javatutorials.Inheritance.example1;

class SubstractionableCalculator extends Calculator {
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

//우선 새로운 클래스인 SubstractionableCalculator을 정의했다. 이 클래스의 본체에는 sbstract라는 메소드만이 존재한다. 
//하지만 이 클래스를 인스턴스화한 c1은 아래와 같이 정의하지 않은 메소드들을 호출하고 있다. 