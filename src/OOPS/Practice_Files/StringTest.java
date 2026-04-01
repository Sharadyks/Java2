package OOPS.Practice_Files;

public class StringTest {
    public static void main(String[] args) {
        StringBuilder intro = new StringBuilder("Hello my name is Sharad,");
        intro.append(" and I belong to Faridabad, haryana");
        System.out.println(intro.toString());
        // The Stringbuilder class is useful in a way that it can concatenate a new string to the existing object using append()
        // without creating any new object.
    }
}
