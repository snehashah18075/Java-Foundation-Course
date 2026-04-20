public class A {
public void showA() {
System.out.println("Inside class A showA method...");
}
}
public class B extends A {
public void showB() {
System.out.println("Inside class B method...");
}
}
// SingleInheritance.java
public class SingleInheritance {
public static void main(String[] args) {
B b1 = new B();
b1.showA();
b1.showB();
}
}