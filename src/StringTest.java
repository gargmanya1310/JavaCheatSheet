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

        // delete()
        StringBuilder sb1 = new StringBuilder("abcdef");
        System.out.println(sb1.delete(1, 4));

        // deleteCharAt()
        StringBuilder sb2 = new StringBuilder("abcdef");
        System.out.println(sb2.deleteCharAt(2));

        //System.out.println(sb2.deleteCharAt(6));        Gives out of bound exception







    }
}
