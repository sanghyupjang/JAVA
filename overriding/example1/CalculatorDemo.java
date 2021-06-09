package org.opentutorials.javatutorials.overriding.example1;
 
class Calculator {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator extends Calculator {
     
    public void sum() {
        System.out.println("���� ����� " +(this.left + this.right)+"�Դϴ�.");
    }
     
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorDemo {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
//����� ���� Ŭ������ ����� ���� Ŭ�������� �����ִ� ����̴�. �׷��ٸ� ���� Ŭ������ ���� Ŭ������ �޼ҵ带 �־��� �״�� ����ؾ� �ұ�? ���� �׷��� �Ѵٸ� ������ ����� ���̴�. 
//�̷� ������ ������� ���� Ŭ������ �θ� Ŭ������ �⺻���� ���۹���� ������ �� �־�� �Ѵ�. 
//�̷� �ƶ����� ���Ե� ����� �޼ҵ� �������̵�(overriding)�̴�.
//�޼ҵ� sum��  SubstractionableCalculator�� �߰� �Ǿ���.
//�������� c1.sum�� ���� Ŭ������ �޼ҵ尡 �ƴ϶� ���� Ŭ������ �޼ҵ� sum�� �����ϰ� �ִٴ� ���� �����ش�. 
//���� Ŭ���� ���忡�� �θ� Ŭ������ �����ڸ� �⺻���� ���� ����� ������ ���̶�� ������ �� �ִ�. 
//���� Ŭ�������� ���� Ŭ������ ������ �޼ҵ带 �����ϸ� �θ� Ŭ�����κ��� ���� ���� �⺻ ���� ����� �����ϴ� ȿ���� ���� �ȴ�.
//�⺻������ ���а� ����ǰ�, �������� ������ �� ���� �켱������ �����ϰ� �ִ�. �̰��� ���п��� �Ϲ������� �߰ߵǴ� ��Ģ�̴�. 
//�̰��� �޼ҵ� �������̵�(overriding)�̶�� �Ѵ�.
