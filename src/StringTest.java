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

        // if final index is too large, replace goes through the end (no exception!)
        StringBuilder name2 = new StringBuilder("John Wayne");
        name2.replace(5, 100, "Doe");
        System.out.println(name2);

        // reverse()
        StringBuilder sb = new StringBuilder("LUKA");
        sb.reverse();
        System.out.println(sb);

        //equal string
        StringBuilder sbName1 = new StringBuilder("John Wayne");
        StringBuilder sbName2 = new StringBuilder("John Wayne");
        System.out.println(sbName1 == sbName2);
        System.out.println(sbName1.equals(sbName2));
        System.out.println(sbName1.toString().equals(sbName2.toString()));  // if we want to compare content we have to convert it back to String:

        // substring() returns a String and doesn't change the StringBuilder
        StringBuilder name4 = new StringBuilder("John Wayne");
        name4.substring(2, 6);
        System.out.println(name4);
        // So, we should do this:
        String subName = name4.substring(2, 6);
        System.out.println(subName);










    }
}
