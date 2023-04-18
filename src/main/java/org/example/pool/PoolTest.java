package org.example.pool;

public class PoolTest {
    //Basically Pool changes the value right after the variable is reassigned

    public static void main(String[] args) {


      /*  String firstName = new String("David");
        String lastName = new String("David");*/

        String firstName =  "David";
        String lastName = "James";

        // pool

//        System.out.println("first name is: " + firstName);
//        System.out.println("last name is: " + lastName);

        String temp = "Beckham";
        firstName = temp;
        temp = lastName;
        lastName = "454455";

        System.out.println("first name is: " + firstName);
        System.out.println("last name is: " + lastName);

        firstName = "jkjdkgjdkjgkdjgkdjgdgdg";
        lastName = "123";

        System.out.println("first name is: " + firstName);
        System.out.println("last name is: " + lastName);


    }

}
