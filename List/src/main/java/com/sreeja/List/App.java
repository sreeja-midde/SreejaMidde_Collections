package com.sreeja.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args )
    {
    	Integer[] array= {23,45,78,12,90,34,78,34,12,90};
    	MyList<Integer> list = new MyList<Integer>(array);
    	list.add(32);
    	System.out.println(list);
    }
}
