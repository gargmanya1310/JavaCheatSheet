public class Main
{
        public static void isInteger(Number num)
        {
            if(num instanceof Integer)
                System.out.println(num+"is an integer.");
            else
                System.out.println(num+"is not an integer.");
            System.out.println(null instanceof Object);                                 // => always returns false
           // System.out.println(null instanceof null);                                 //does not compile
        }
    public static void main(String[] args)
    {

//        //using Wrapper class
//        Double d = Double.valueOf(314.67);
//        System.out.println(d.byteValue());     // 58       (wrap: 314-256=58)
//        System.out.println(d.intValue());      // 314
//        System.out.println(d.doubleValue());

        isInteger(5);
        isInteger(3.14);

    }
}
