package org.opentutorials.javatutorials.classninstance;
 
class Calculator2 {
    static double PI = 3.14;
    // Ŭ���� ������ base�� �߰��Ǿ���.
    static int base = 0;
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        // ���ϱ⿡ base�� ���� ���Խ�Ų��.
        System.out.println(this.left + this.right + base);
    }
 
    public void avg() {
        // ���ġ�� base�� ���� ���Խ�Ų��.
        System.out.println((this.left + this.right + base) / 2);
    }
}