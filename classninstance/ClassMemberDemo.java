package org.opentutorials.javatutorials.classninstance;

public class ClassMemberDemo {  
    public static void main(String[] args) {
        C1 c = new C1();
        // �ν��Ͻ��� �̿��ؼ� ���� �޼ҵ忡 ���� -> ����
        // �ν��Ͻ� �޼ҵ尡 ���� ������ ���� -> ����
        c.static_static();
        // �ν��Ͻ��� �̿��ؼ� ���� �޼ҵ忡 ���� -> ����
        // ���� �޼ҵ尡 �ν��Ͻ� ������ ���� -> ����
        c.static_instance();
        // �ν��Ͻ��� �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ���� -> ����
        // �ν��Ͻ� �޼ҵ尡 Ŭ���� ������ ���� -> ����
        c.instance_static();
        // �ν��Ͻ��� �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ���� -> ���� 
        // �ν��Ͻ� �޼ҵ尡 �ν��Ͻ� ������ ���� -> ����
        c.instance_instance();
        // Ŭ������ �̿��ؼ� Ŭ���� �޼ҵ忡 ���� -> ����
        // Ŭ���� �޼ҵ尡 Ŭ���� ������ ���� -> ����
        C1.static_static();
        // Ŭ������ �̿��ؼ� Ŭ���� �޼ҵ忡 ���� -> ����
        // Ŭ���� �޼ҵ尡 �ν��Ͻ� ������ ���� -> ����
        C1.static_instance();
        // Ŭ������ �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ���� -> ����
        //C1.instance_static();
        // Ŭ������ �̿��ؼ� �ν��Ͻ� �޼ҵ忡 ���� -> ����
        //C1.instance_instance();
    }
 
}