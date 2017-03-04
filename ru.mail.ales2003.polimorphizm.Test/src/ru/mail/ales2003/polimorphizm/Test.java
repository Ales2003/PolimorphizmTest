package ru.mail.ales2003.polimorphizm;

public class Test {

    
    public static void main(String[] args) {
      Child child =new Child();
      child.print();
      child.run();
      AbstractParent abstractParent = new Child();
      abstractParent.print();
      child.run();
      IPrintable iPrintable = new Child();
      iPrintable.print();
      
     
        System.out.println("");
        System.out.println("");
                
    }
    
}
