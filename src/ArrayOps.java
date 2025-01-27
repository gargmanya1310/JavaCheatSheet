import java.util.Arrays;

public class ArrayOps
{
    public void arrays()
    {
//        int[] nums=new int[] {3,-1,17};
//        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));

//        int result= Arrays.compare(new int[]{3, 7}, new int[]{3});
//        System.out.println(result);
//
//       int a=Arrays.compare(new int[]{3, 7}, new int[]{3, 7});
//       System.out.println(a);
//
//        int b=Arrays.compare(new String[]{"xy", "John Wayne"}, new String[]{"abc", "Hey!"});
//        System.out.println(b);
//
//        int c=Arrays.compare(new String[]{"John", "Wayne"}, new String[]{"john", "Doe"});
//        System.out.println(c);
//
//        int d=Arrays.compare(new String[]{"ab", "John Wayne"}, null);
//        System.out.println(d);
//
//        int e= Arrays.mismatch(new String[]{"John", "Wayne"}, new String[]{"John", "Doe"});
//        System.out.println(e);
//
//        String[] arr1 = new String[]{"John", "Wayne"};
//        String[] arr2 = new String[]{"John", "Wayne", "The Duke"};
//        int f= Arrays.mismatch(arr1, arr2);
//        System.out.println(f);
//
//       int g= Arrays.mismatch(new int[]{3, -2, 7}, new int[]{3, -2, 7});
//       System.out.println(g);

       int [][] arr={{-1,17},{8,14,-3},{2,-2,-3}};
       for(int row[]:arr)
           for(int ele:row)
               System.out.println(ele);

    }
}
