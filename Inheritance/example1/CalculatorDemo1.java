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

//�̰��� ������ ������ extends Calculator �����̴�. �̰��� Ŭ���� Calculator�� ��� �޴´ٴ� �ǹ̴�. 
//���� SubstaractableCalculator�� Calculator���� ������ �޼ҵ� setOprands, sub, avg�� ����� �� �ְ� �ȴ�. 
//�̰��� ���α׷����� ���翡�� ����� �������� �򰡹޴� ����� �⺻���� �ǹ̴�. ����� ���ؼ� �ڵ��� �ߺ��� ������ �� �־���,
//�� �θ� Ŭ������ �����ϸ� �̸� ��ӹް� �ִ� ��� �ڽ� Ŭ�����鿡�� �� ������ �ڵ����� ���ư���.
//�ٽ� ���ؼ� ���������� �������ٴ� ���̴�.  
//��Ȱ�뼺�� �ߺ��� ����, �׸��� ���������� ���Ǵ� ���� �ٸ� �������� ������ ������, 
//�ϳ��� �������� �ڿ������� �ٸ� �ʵ� �������� ���迡 �ִٴ� ���� �ٽ� �� �� ȯ�����ִ� ����̴�.