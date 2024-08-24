package com.mt.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

@FunctionalInterface  //It is optional
interface Drawable{  
    public void draw();  
}

interface Sayable{  
    public String say(String name);  
}

interface Addable{  
    int add(int a,int b);  
}

class ProductB{  
    int id;  
    String name;  
    float price;  
    public ProductB(int id, String name, float price) {  
        super();  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  

public class LambdaExpressionExample {

	public static void main(String[] args) {
		 int width=10;  
		  
        //without lambda, Drawable implementation using anonymous class  
        /*
		 Drawable d=new Drawable(){  
            public void draw(){System.out.println("Drawing "+width);}  
        };  
        d.draw();
        */
		//with lambda  
        Drawable d2=()->{  
            System.out.println("Drawing "+width);  
        };  
        d2.draw(); 
        
        // Lambda expression with single parameter.  
        Sayable s1=(name)->{  
            return "Hello, "+name;  
        };  
        System.out.println(s1.say("Sonoo"));  
          
        // You can omit function parentheses    
        Sayable s2= name ->{  
            return "Hello, "+name;  
        };  
        System.out.println(s2.say("Sonoo Two"));
        
        // Multiple parameters in lambda expression  
        Addable ad1=(a,b)->(a+b);  
        System.out.println(ad1.add(10,20));  
          
        // Multiple parameters with data type in lambda expression  
        Addable ad2=(int a,int b)->(a+b);  
        System.out.println(ad2.add(100,200));
        
        // Lambda expression with return keyword.    
        Addable ad3=(int a,int b)->{  
                            return (a+b);   
                            };  
        System.out.println(ad3.add(150,200));
        
        //Java Lambda Expression Example: Foreach Loop
        List<String> productLists=new ArrayList<String>();  
        productLists.add("ankit");  
        productLists.add("mayank");  
        productLists.add("irfan");  
        productLists.add("jai");  
          
        productLists.forEach(  
            (n)->System.out.println(n)  
        );
        
      //Thread Example without lambda  
       Runnable r1 = new Runnable() {
    	   public void run() {
    		   System.out.println("Thread1 is running...");
    	   }
       };
       Thread t1 = new Thread(r1);
       t1.start();
       
     //Thread Example with lambda
       Runnable r2 = ()->{
    	   System.out.println("Thread2 is running...");
       };
       Thread t2 = new Thread(r2);
       t2.start();
       
       List<ProductB> pls =new ArrayList<ProductB>();  
       pls.add(new ProductB(1,"Samsung A5",17000f));  
       pls.add(new ProductB(3,"Iphone 6S",65000f));  
       pls.add(new ProductB(2,"Sony Xperia",25000f));  
       pls.add(new ProductB(4,"Nokia Lumia",15000f));  
       pls.add(new ProductB(5,"Redmi4 ",26000f));  
       pls.add(new ProductB(6,"Lenevo Vibe",19000f)); 
       
       // implementing lambda expression  
       Collections.sort(pls,(p1,p2)->{  
    	   return p1.name.compareTo(p2.name);  
       });  
       for(ProductB p:pls){  
           System.out.println(p.id+" "+p.name+" "+p.price);  
       }
       // using lambda to filter data  
       Stream<ProductB> filtered_data = pls.stream().filter(p -> p.price > 20000);
       // using lambda to iterate through collection  
       filtered_data.forEach(  
               product -> System.out.println(product.name+": "+product.price)  
       );  
       

	}

}
