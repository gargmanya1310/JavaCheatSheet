public class MethodsDemo
{
     int add(int ... nums)
    {
        int sum = 0;
        for(int i: nums)
            sum += i;
        return sum;
    }
    public void greet (String greeting, String... names)
    {
        for (String name : names) {
            System.out.println(greeting + ", " + name + "!");
        }
    }
}
