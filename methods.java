import java.lang.reflect.Array;
import java.util.Arrays;

public class methods {

    public static void main(String[] args) {
        String name  = "kaushlendra thakur hello cool";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('a'));
        System.out.println("    kausu     ".strip());
        System.out.println(name.replace("kaushlendra", "kalu"));
        System.out.println(Arrays.toString(name.split(" ")));
    }   
}