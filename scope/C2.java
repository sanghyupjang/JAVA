package org.opentutorials.javatutorials.scope;
 
class C2 {
    int v = 10;
 
    void m() {
        int v = 20;
        System.out.println(v);
    }
}