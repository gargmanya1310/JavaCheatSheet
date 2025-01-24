public class StringTest
{
    public void showName()
    {
//        StringBuilder name = new StringBuilder("John");
//        name.append("Wayne");
//        System.out.println(name);
//
//        // chaining with append()
//        name.append(1).append(true);
//        System.out.println(name);

        // insert()
        StringBuilder name = new StringBuilder("John Wayne");
        name.insert(5, "D. ");
        System.out.println(name);



    }
}
