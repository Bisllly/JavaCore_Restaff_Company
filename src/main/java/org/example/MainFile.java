package org.example;
import org.example.pool.Browser;

public class MainFile { // bigmain class


    public static void main(String[] args) {



        //just a short function could run the whole SelfBrowserModel.java

        Browser chrome = new Browser("Chrome", 1.0, "Google", 1999,
                true, true, true, false);
        Browser safari = new Browser("Safari", 4.5, "Apple", 2001,
                true, true, true, false);
        Browser edge = new Browser("Edge", 12.0, "Microsoft", 2010,
                true, true, true, true);
        System.out.println(chrome);
        System.out.println(safari);
        System.out.println(edge);

//        System.out.println(chrome.launch(true));
        System.out.println(chrome.search(true));

//
//        // Jacob's code
//        Circle myCircle = new Circle();
//        System.out.println("====>" + myCircle);
//
//        Circle myCircle2 = new Circle(5, "blue");
//        System.out.println(myCircle2);
//        System.out.println(myCircle);
//        System.out.println(myCircle2.getColor());
//
//
//        int x = 10;
//        int y = 11;
//
//        // mutation
//        // immutation
//
//
//        y = x;
//
//        System.out.println("x = 10: " + x);
//        System.out.println("y = 10: " + y);
//
//        x = 12;
//
//        System.out.println("x = 12: " + x);
//        System.out.println("y=10: " + y);
//
//        myCircle = myCircle2;
//
//        System.out.println(myCircle2);
//        System.out.println(myCircle);
//
//        System.out.println(myCircle2.getColor());
//
//        myCircle.setColor("yellow");
//
//        System.out.println(myCircle2.getColor());


        //input an integer
//        Account a = new Account();
//        System.out.println(a.toString());

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int num = 1512;
//        int nextNum = 234;
//
//        if (num > nextNum) {
//            System.out.println(num > nextNum);
//        } else {
//            System.out.println(num > nextNum);
//        }

//        System.out.println("You've entered: " + num);
//
//        // an integer between 0 and 1000:
//        // 252/100=2 (separate nums), 252%100=52 (next num to be separated)
//
//        int first = num / 100; //output 1
//        System.out.println(first);
//
//        int firstDecimal = num % 100; //output 51
//        System.out.println(firstDecimal);
//
//        int second = firstDecimal / 10; //output 5
//        System.out.println(second);
//
//        int last = firstDecimal % 10; //output 1
//        System.out.println(last);
//
//        int sum = first + second + last;
//        System.out.println(sum);
    }
}