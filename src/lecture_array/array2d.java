package lecture_array;

public class array2d {
    public static void main(String[] args) {
        // using array of array approach
        int[][] x = new int[3][3];
        x[0] = new int[2];// the length of second column by default is 3

        x[1] = new int[1];  // the lenght of third column by defautl is 3
        // the lenght of third column by default is 3

        System.out.println(x[1].length); // the changed length
        System.out.println(x.length); // return base lenght


    }
}
