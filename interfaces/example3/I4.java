package org.opentutorials.javatutorials.interfaces.example3;
 
interface I3{
    public void x();
}
 
interface I4 extends I3{
    public void z();
}
 
class B implements I4{
    public void x(){}
    public void z(){}   
}

//abstract vs interface
//�������̽��� �߻� Ŭ������ ���� ����� �� �ٸ� ����̴�. 
//�������̽��� Ŭ������ �ƴ� �������̽���� ������ ���¸� ������ �ִ� �ݸ� �߻� Ŭ������ �Ϲ����� Ŭ������. 
//�� �������̽��� ��ü���� �����̳� ���¸� ������ ���� �� ����, �߻� Ŭ������ ��ü���� �����̳� ���¸� ������ ���� �� �ִ�.