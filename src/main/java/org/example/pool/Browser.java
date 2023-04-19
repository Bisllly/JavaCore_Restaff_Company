package org.example.pool;

import javax.swing.text.Position;
import java.io.IOException;

import java.util.Scanner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browser {

    private String name;
    private double version;
    private String distributor;
    private int yearOfCreation;
    private Boolean launchFunction;
    private Boolean closeFunction;
    private Boolean searchFunction;

    //constructor
    public Browser(String name, double version, String distributor, int yearOfCreation, Boolean launchFunction,
                   Boolean closeFunction, Boolean searchFunction, Boolean aiSupported) {
        this.name = name;
        this.version = version;
        this.distributor = distributor;
        this.yearOfCreation = yearOfCreation;
        this.launchFunction = Boolean.valueOf(launchFunction);
        this.closeFunction = Boolean.valueOf(closeFunction);
        this.searchFunction = Boolean.valueOf(searchFunction);
    }

    // open, launch app (click: true => launch)

    // Class_Name object = new Class_Name();
    // object.method();

    public String launch(Boolean click) {
        if (click == true) {
            // open http://www.google.com
            Runtime rt = Runtime.getRuntime();
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the url: ");
                String url = scanner.nextLine();

                Process pr = rt.exec("open " + url);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return "launched!";
        } else {
            return "please click on the browser icon";
        }
    }

    //input a String keyword, automatically open Google and search it
        //findElement on a website to click
    public String search(Boolean click) {
        if (click == true) {

            //scanner for user searchString
           // Scanner scanner = new Scanner(System.in);
            //System.out.print("Ask me anything: ");
            //String searchString = scanner.nextLine();
            //System.out.println("Thank you, I have received "+ searchString);
            //copy - paste searchString in Google searchbar
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
            System.setProperty("webdriver.chrome.driver", "/Users/cuongnguyen-oceansmart/Downloads/drivers/chromedriver");
            driver.get("https://os-staging.oiigds.com/signin");
          //
            driver.quit();
            return "searched!";
        }
        return null;
    }


    public boolean isDrag(double prevCoordinate, double currentCoordinate) {
        if (prevCoordinate != currentCoordinate) {
            return true;
        } else{
            return false;
        }
    }
    // moveTo (coordinate double X return double Y)
    public double moveTo(double x, double currentCoordinate, boolean isDrag) {
        if (isDrag) {
            double y = currentCoordinate;
            return y;
        }
        return x;
    }
    // visit, get
    public boolean isVisit(boolean urlClick, boolean click) {
        if (urlClick == true) {
            if (click == true) {
                return true;
            }
        }
        if (urlClick == true) {
            if (click == false) {
                return false;
            }
        } return false;
    }
    public boolean visit() {

        //

        return false;
    };

    // max
    // close
    //back
    // next

    @Override
    public String toString() {
        return "SelfBrowserModel{" +
                "name='" + name + '\'' +
                ", version=" + version +
                ", distributor='" + distributor + '\'' +
                ", yearOfCreation=" + yearOfCreation +
                ", launchFunction=" + launchFunction +
                ", closeFunction=" + closeFunction +
                ", searchFunction=" + searchFunction +
                '}';
    }

    //Method that creates an object within the class

    //nest main within another function to call it everywhere


}
