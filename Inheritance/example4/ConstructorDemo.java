package org.opentutorials.javatutorials.Inheritance.example4;

public class ConstructorDemo {
    
	public static void main(String[] args) {
        
		ConstructorDemo  c = new ConstructorDemo();
    }
}

//위의 예제는 에러를 발생시키지 않는다. 
//ConstructorDemo 객체를 생성할 때 자동으로 생성자를 만들어주기 때문이다. 
//하지만 아래의 예제는 에러가 발생한다.


//public class ConstructorDemo {
    //public ConstructorDemo(int param1) {}
    //public static void main(String[] args) {
//        ConstructorDemo  c = new ConstructorDemo();
//    }
//}

//매개변수가 있는 생성자가 있을 때는 자동으로 기본 생성자를 만들어주지 않는다. 
//따라서 위의 예제는 존재하지 않는 생성자를 호출하고 있다. 
//이 문제를 해결하기 위해서는 아래와 같이 기본 생성자를 추가해줘야 한다.

//package org.opentutorials.javatutorials.Inheritance.example4;
//public class ConstructorDemo {
    //public ConstructorDemo(){}
    //public ConstructorDemo(int param1) {}
    //public static void main(String[] args) {
        //ConstructorDemo  c = new ConstructorDemo();
    //}
//}


