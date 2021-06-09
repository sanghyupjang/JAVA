package org.opentutorials.javatutorials.progenitor;
 
class Student{
    String name;
    Student(String name){
        this.name = name;
    }
    public boolean equals(Object obj) {
        Student _obj = (Student)obj;
        return name == _obj.name;
    }
}
 
class ObjectDemo {
 
    public static void main(String[] args) {
        Student s1 = new Student("goldpenguin93");
        Student s2 = new Student("goldpenguin93");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
 
}