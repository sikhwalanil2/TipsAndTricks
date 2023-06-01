import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        String s="My name is Anil ";
        s=s.toLowerCase();
        int count=0;

        List li = new ArrayList<>();

        for (int i=0;i<s.length();i++){
            char t = s.charAt(i);
            if((t=='a' || t=='e' || t=='i' || t=='o' || t=='u')  &&  !li.contains(t)){
                count++;
                li.add(t);
            }
        }


        System.out.println(count);
    }
}