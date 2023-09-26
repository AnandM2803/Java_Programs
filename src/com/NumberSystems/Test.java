package com.NumberSystems;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class A { public A() { System.out.println("A");

}

}

 

 class B extends A implements Serializable {

public B() {

System.out.println("B");

}

 

}

 

public class Test {

 

public static void main(String... args) throws Exception { B b = new B();

 

ObjectOutputStream save = new ObjectOutputStream(new

FileOutputStream("datafile"));

save.writeObject(b);

save.flush();

ObjectInputStream restore = new ObjectInputStream(new

FileInputStream("datafile"));

B z = (B) restore.readObject();

 

}

 

}

		 
