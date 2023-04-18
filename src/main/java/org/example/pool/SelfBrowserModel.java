package org.example.pool;

public class SelfBrowserModel {

    private String name;
    private double version;
    private String distributor;
    private int yearOfCreation;
    private Boolean launchFunction;
    private Boolean closeFunction;
    private Boolean searchFunction;

    //constructor
    public SelfBrowserModel(String name, double version, String distributor, int yearOfCreation, Boolean launchFunction,
                            Boolean closeFunction, Boolean searchFunction, Boolean aiSupported) {
        this.name = name;
        this.version = version;
        this.distributor = distributor;
        this.yearOfCreation = yearOfCreation;
        this.launchFunction = Boolean.valueOf(launchFunction);
        this.closeFunction = Boolean.valueOf(closeFunction);
        this.searchFunction = Boolean.valueOf(searchFunction);
    }

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
    public static void main(String[] args) {
        testSelfBrowserModel();
    }

    public static void testSelfBrowserModel() {
        SelfBrowserModel chrome = new SelfBrowserModel("Chrome", 1.0, "Google", 1999,
                true, true, true, false);
        SelfBrowserModel safari = new SelfBrowserModel("Safari", 4.5, "Apple", 2001,
                true, true, true, false);
        SelfBrowserModel edge = new SelfBrowserModel("Edge", 12.0, "Microsoft", 2010,
                true, true, true, true);
        System.out.println(chrome);
        System.out.println(safari);
        System.out.println(edge);
    }

    //nest main within another function to call it everywhere


}
