package lecture_variables;

public class instancevariable {
    int x = 100;
    public static void main(String[] args) {
        //System.out.println(x);     //  give compilation error coz we cann't call instant variable in static function
        instancevariable i = new instancevariable();
        System.out.println(i.x); // prints the value of x
    }
    public void main()
    {
        System.out.println(x);// is valid
    }
}
