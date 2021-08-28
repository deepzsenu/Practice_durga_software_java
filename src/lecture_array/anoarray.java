package lecture_array; // anonymous array

public class anoarray {

    public static void main(String[] args) {
        Sum(new int[] {10,20,30,3,44,4,4,5,433,3,33,});

    }
    public static void Sum( int[] x)
    {
        int total = 0;
        for (int xi :x )
        {
            total = total+xi;

        }
        System.out.println(total);
    }

}
