package literals;

public class charlit2 {
    public static void main(String[] args) {
        char ch = 97;// print a
        char dh = 99; // prints b

        // 97 and 98 and unicode values of a nad b
        // but allowed range is 0-65535
        // we can assign octal, integer and hexadecimal values to char
        char eh = 0777;//
        System.out.println(ch+" "+dh+" "+eh);
    }
}
