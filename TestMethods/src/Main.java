class Mobile
{
    String brand;
    int price;
    static String name;

    public void show()
    {
        System.out.println("Brand: " + brand + ", Price: " + price + ", Name: " + name);
    }

    public static void show1(Mobile obj)
    {
        System.out.println(obj.brand +","+ obj.price + "," + name);
    }
}



public class Main
{
    public static void main(String[] args)
    {
        Mobile obj1= new Mobile();
        obj1.brand="Apple";
        obj1.price=300;
        Mobile.name="SmartPhone";

        Mobile obj2= new Mobile();
        obj2.brand="Samsung";
        obj2.price=200;
        Mobile.name="Smartphone";

        obj1.show();
        obj2.show();
       //Mobile.show();
        System.out.println("Test Statement");

    }
}
