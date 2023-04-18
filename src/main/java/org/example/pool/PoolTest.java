package org.example.pool;

public class PoolTest {


    public static void main(String[] args) {


      /*  String firstName = new String("David");
        String lastName = new String("David");*/

        String firstName =  "David";
        String lastName = "James";

        // pool

        System.out.println("first name is: " + firstName);
        System.out.println("last name is: " + lastName);

        firstName = lastName;

        System.out.println("first name is: " + firstName);
        System.out.println("last name is: " + lastName);

        lastName = "Beckham";

        System.out.println("first name is: " + firstName);
        System.out.println("last name is: " + lastName);


    }

}
