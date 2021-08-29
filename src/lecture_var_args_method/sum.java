package lecture_var_args_method;

public class sum {
    public static void main(String[] args) {
        sum();
        sum(10,20,30);
        sum(10, 20, 30, 40);
        sum(40, 12,45, 12);
    }
    public static void sum(int... x)
    {
        int total = 0 ;
        for( int i : x)
        {
            total =total+i;
        }
        System.out.println(total);
    }
}
