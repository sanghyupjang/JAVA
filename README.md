![dbgxt2rvpd26udoyzcqn 0 0](https://user-images.githubusercontent.com/31435126/49341247-0e451f00-f68e-11e8-88e1-9a99641bfd74.jpg)




# JAVA

썬 마이크로시스템즈에서 1995년에 개발한 객체 지향 프로그래밍 언어. 창시자는 제임스 고슬링이다. 2010년에 오라클이 썬 마이크로시스템즈을 인수하면서 Java의 저작권을 소유하였다. 현재는 OpenJDK는 GPL2이나 오라클이 배포하는 Oracle JDK는 상업라이선스로 오라클이 돈독 올랐는지 2019년 1월부터 유료화정책을 강화하고 있다. Java EE는 이클립스 재단의 소유이다. Java 언어는 J2SE 1.4부터는 Java Community Process (JCP)에서 개발을 주도하고 있다.

C#과 문법적 성향이 굉장히 비슷하며[1], 그에 비해 2019년 Q3에서 가장 많이 이용하는 언어로 뽑혔다. Java와 JavaScript는 인도와 인도네시아가 다른 것만큼 다르다.

온라인 상으로 코드를 실행시켜 보고 싶다면 여기로.

Java로 만들어진 소프트웨어 중 유명한 것으로는 바로 마인크래프트 자바 에디션를 꼽을 수 있다.

<h2>이름 유래</h2>
처음엔 고슬링 사무실 앞에 있는 참나무에서 따와 OAK로 지었다가 그대로 상표로 등록하기엔 문제가 생겨서[2] 컨설턴트가 극단적인 방법을 도입, 오후에 개발진들을 회의실에 가둬서(...) 브레인스토밍을 시켰다. "기분이 어떤가요"(Excited!), "무엇이 당신 기분을 좋게 만드나요?"(Java coffee!) 같은 연상적인 작용을 거쳐 여러가지 이름을 정하고, 그 중에서 자바 커피의 Java를 선택했다. Java는 랭킹 중 네 번째. 리스트의 첫 번째 이름은 Silk였고 고슬링이 가장 좋아했던 이름은 Lyrics, 세 번째에 올라왔던 이름이라고.

개발진이 자바산 커피를 좋아해서 그랬다는 설도 있다. 3 Bilion Devices like Java(Coffee) 아이콘도 커피잔 모양. 또는 개발자의 이름인 James Gosling, Arthur Van Hoff, Andy Bechtolsheim의 머릿글자를 따온 것이라는 설도 있고, 그냥 사전을 펼쳤는데 눈에 들어온 이름이었다는 설도 있다.

<h2>분류</h2>
Java는 크게 다음과 같은 4가지 에디션으로 나뉜다.
Java SE(Java Standard Edition / J2SE)
대부분의 사람들이 가장 많이 접하는 표준 에디션. Java의 핵심 API와 기능들을 제공한다. JDK 항목도 참고.
Jakarta EE, 구 Java EE(Java Enterprise Edition / J2EE)
기업에서 운영하는 서버 페이지에 특화된 에디션이다. JSP와 서블릿을 비롯한 웹 애플리케이션 서버에 관련된 기술들이 포함되어 있다.
Java ME(Java Micro Edition / J2ME)
PDA나 셋톱박스, 센서 등의 임베디드 시스템 환경에 특화된 에디션이다.
JavaFX
데스크톱 애플리케이션 개발 및 배포를 위한 에디션으로, 크로스플랫폼 이식과 GUI 라이브러리를 공급한다.

Non-JVM
Some platforms offer direct hardware support for Java; there are microcontrollers that can run Java bytecode in hardware instead of a software Java virtual machine,[52] and some ARM based processors could have hardware support for executing Java bytecode through their Jazelle option, though support has mostly been dropped in current implementations of ARM.

Automatic memory management
Java uses an automatic garbage collector to manage memory in the object lifecycle. The programmer determines when objects are created, and the Java runtime is responsible for recovering the memory once objects are no longer in use. Once no references to an object remain, the unreachable memory becomes eligible to be freed automatically by the garbage collector. Something similar to a memory leak may still occur if a programmer's code holds a reference to an object that is no longer needed, typically when objects that are no longer needed are stored in containers that are still in use. If methods for a nonexistent object are called, a "null pointer exception" is thrown.

One of the ideas behind Java's automatic memory management model is that programmers can be spared the burden of having to perform manual memory management. In some languages, memory for the creation of objects is implicitly allocated on the stack or explicitly allocated and deallocated from the heap. In the latter case, the responsibility of managing memory resides with the programmer. If the program does not deallocate an object, a memory leak occurs. If the program attempts to access or deallocate memory that has already been deallocated, the result is undefined and difficult to predict, and the program is likely to become unstable or crash. This can be partially remedied by the use of smart pointers, but these add overhead and complexity. Note that garbage collection does not prevent "logical" memory leaks, i.e., those where the memory is still referenced but never used.

Garbage collection may happen at any time. Ideally, it will occur when a program is idle. It is guaranteed to be triggered if there is insufficient free memory on the heap to allocate a new object; this can cause a program to stall momentarily. Explicit memory management is not possible in Java.

Java does not support C/C++ style pointer arithmetic, where object addresses and unsigned integers (usually long integers) can be used interchangeably. This allows the garbage collector to relocate referenced objects and ensures type safety and security.

As in C++ and some other object-oriented languages, variables of Java's primitive data types are either stored directly in fields (for objects) or on the stack (for methods) rather than on the heap, as is commonly true for non-primitive data types (but see escape analysis). This was a conscious decision by Java's designers for performance reasons.

Java contains multiple types of garbage collectors. By default, HotSpot uses the parallel scavenge garbage collector. However, there are also several other garbage collectors that can be used to manage the heap. For 90% of applications in Java, the Concurrent Mark-Sweep (CMS) garbage collector is sufficient. Oracle aims to replace CMS with the Garbage-First collector (G1).

<h2>Syntax</h2>
Main article: Java syntax

Dependency graph of the Java Core classes (created with jdeps and Gephi). The most frequently used classes Object and String appear in the centre of the diagram.
The syntax of Java is largely influenced by C++. Unlike C++, which combines the syntax for structured, generic, and object-oriented programming, Java was built almost exclusively as an object-oriented language. All code is written inside classes, and every data item is an object, with the exception of the primitive data types, (i.e. integers, floating-point numbers, boolean values, and characters), which are not objects for performance reasons. Java reuses some popular aspects of C++ (such as the printf method).

Unlike C++, Java does not support operator overloading or multiple inheritance for classes, though multiple inheritance is supported for interfaces.

Java uses comments similar to those of C++. There are three different styles of comments: a single line style marked with two slashes (//), a multiple line style opened with /* and closed with */, and the Javadoc commenting style opened with /** and closed with */. The Javadoc style of commenting allows the user to run the Javadoc executable to create documentation for the program and can be read by some integrated development environments (IDEs) such as Eclipse to allow developers to access documentation within the IDE.


```

"Hello world" example
The traditional "Hello, world!" program can be written in Java as:

class HelloWorldApp {
    public static void main(String[] args) {
        System.out.println("Hello World!"); // Prints the string to the console.
    }
}

```

Source files must be named after the public class they contain, appending the suffix .java, for example, HelloWorldApp.java. It must first be compiled into bytecode, using a Java compiler, producing a file named HelloWorldApp.class. Only then can it be executed, or "launched". The Java source file may only contain one public class, but it can contain multiple classes with other than public access modifier and any number of public inner classes. When the source file contains multiple classes, make one class "public" and name the source file with that public class name.

A class that is not declared public may be stored in any .java file. The compiler will generate a class file for each class defined in the source file. The name of the class file is the name of the class, with .class appended. For class file generation, anonymous classes are treated as if their name were the concatenation of the name of their enclosing class, a $, and an integer.

The keyword public denotes that a method can be called from code in other classes, or that a class may be used by classes outside the class hierarchy. The class hierarchy is related to the name of the directory in which the .java file is located. This is called an access level modifier. Other access level modifiers include the keywords private and protected.

The keyword static in front of a method indicates a static method, which is associated only with the class and not with any specific instance of that class. Only static methods can be invoked without a reference to an object. Static methods cannot access any class members that are not also static. Methods that are not designated static are instance methods and require a specific instance of a class to operate.

The keyword void indicates that the main method does not return any value to the caller. If a Java program is to exit with an error code, it must call System.exit() explicitly.

The method name "main" is not a keyword in the Java language. It is simply the name of the method the Java launcher calls to pass control to the program. Java classes that run in managed environments such as applets and Enterprise JavaBeans do not use or need a main() method. A Java program may contain multiple classes that have main methods, which means that the VM needs to be explicitly told which class to launch from.

The main method must accept an array of String objects. By convention, it is referenced as args although any other legal identifier name can be used. Since Java 5, the main method can also use variable arguments, in the form of public static void main(String... args), allowing the main method to be invoked with an arbitrary number of String arguments. The effect of this alternate declaration is semantically identical (to the args parameter which is still an array of String objects), but it allows an alternative syntax for creating and passing the array.

The Java launcher launches Java by loading a given class (specified on the command line or as an attribute in a JAR) and starting its public static void main(String[]) method. Stand-alone programs must declare this method explicitly. The String[] args parameter is an array of String objects containing any arguments passed to the class. The parameters to main are often passed by means of a command line.

Printing is part of a Java standard library: The System class defines a public static field called out. The out object is an instance of the PrintStream class and provides many methods for printing data to standard out, including println(String) which also appends a new line to the passed string.

The string "Hello World!" is automatically converted to a String object by the compiler.

<h2>Example with methods</h2>
This is an example of a single line comment using two slashes

 This is an example of a multiple line comment using the slash and asterisk.
 This type of comment can be used to hold a lot of information or deactivate
 code, but it is very important to remember to close the comment. 

package fibsandlies;
import java.util.HashMap;


 * This is an example of a Javadoc comment; Javadoc can compile documentation
 * from this text. Javadoc comments must immediately precede the class, method, or field being documented.
 
```

public class FibCalculator extends Fibonacci implements Calculator {

    private static Map<Integer, Integer> memoized = new HashMap<Integer, Integer>();

   
     * The main method written as follows is used by the JVM as a starting point for the program.
     
    public static void main(String[] args) {
        memoized.put(1, 1);
        memoized.put(2, 1);
        System.out.println(fibonacci(12)); //Get the 12th Fibonacci number and print to console
    }

    
     * An example of a method written in Java, wrapped in a class.
     * Given a non-negative number FIBINDEX, returns
     * the Nth Fibonacci number, where N equals FIBINDEX.
     * @param fibIndex The index of the Fibonacci number
     * @return The Fibonacci number
     
    public static int fibonacci(int fibIndex) {
        if (memoized.containsKey(fibIndex)) {
            return memoized.get(fibIndex);
        } else {
            int answer = fibonacci(fibIndex - 1) + fibonacci(fibIndex - 2);
            memoized.put(fibIndex, answer);
            return answer;
        }
    }
}

```

<h2>Special classes</h2>
Applet
Main article: Java applet
Java applets were programs that were embedded in other applications, typically in a Web page displayed in a web browser. The Java applet API is now deprecated since Java 9 in 2017.

<h2>Servlet</h2>
Main article: Java servlet
Java servlet technology provides Web developers with a simple, consistent mechanism for extending the functionality of a Web server and for accessing existing business systems. Servlets are server-side Java EE components that generate responses (typically HTML pages) to requests (typically HTTP requests) from clients.

The Java servlet API has to some extent been superseded by two standard Java technologies for web services:

the Java API for RESTful Web Services (JAX-RS 2.0) useful for AJAX, JSON and REST services, and
the Java API for XML Web Services (JAX-WS) useful for SOAP Web Services.
JavaServer Pages
Main article: JavaServer Pages
JavaServer Pages (JSP) are server-side Java EE components that generate responses, typically HTML pages, to HTTP requests from clients. JSPs embed Java code in an HTML page by using the special delimiters <% and %>. A JSP is compiled to a Java servlet, a Java application in its own right, the first time it is accessed. After that, the generated servlet creates the response.

<h2>Swing application</h2>
Main article: Swing (Java)
Swing is a graphical user interface library for the Java SE platform. It is possible to specify a different look and feel through the pluggable look and feel system of Swing. Clones of Windows, GTK+, and Motif are supplied by Sun. Apple also provides an Aqua look and feel for macOS. Where prior implementations of these looks and feels may have been considered lacking, Swing in Java SE 6 addresses this problem by using more native GUI widget drawing routines of the underlying platforms.

<h2>Generics</h2>
Main article: Generics in Java
In 2004, generics were added to the Java language, as part of J2SE 5.0. Prior to the introduction of generics, each variable declaration had to be of a specific type. For container classes, for example, this is a problem because there is no easy way to create a container that accepts only specific types of objects. Either the container operates on all subtypes of a class or interface, usually Object, or a different container class has to be created for each contained class. Generics allow compile-time type checking without having to create many container classes, each containing almost identical code. In addition to enabling more efficient code, certain runtime exceptions are prevented from occurring, by issuing compile-time errors. If Java prevented all runtime type errors (ClassCastException's) from occurring, it would be type safe.

In 2016, the type system of Java was proven unsound.
