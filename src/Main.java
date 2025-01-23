public class Main
{
    public static void main(String[] args)
    {

        //using Wrapper class
        Double d = Double.valueOf(314.67);
        System.out.println(d.byteValue());     // 58       (wrap: 314-256=58)
        System.out.println(d.intValue());      // 314
        System.out.println(d.doubleValue());

    }
}
