package lecture_variables;

public class staticvar {
    static int x =123;

    public static void main(String[] args) {
        staticvar s = new staticvar();
        System.out.println(s.x);
        System.out.println(staticvar.x);
        System.out.println(x);
    }
}
