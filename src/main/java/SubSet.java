import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SubSet {

    public static void main(String[] args) {
        int arr[] = { 2, 5, 8, 3, 6, 11 };
        int k=8;
        int count =0;
        Arrays.sort(arr);
        Set<Set<Integer>> se = new HashSet<>();

        for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if((arr[i]==arr[j])){
                   continue;
               }
               if((arr[i]+arr[j])==k){
                   Set s = new HashSet();
                   s.add(arr[i]);
                   s.add(arr[j]);
                   se.add(s);
                   count++;
               }
               if((arr[i]+arr[j])>k)
                   break;;
           }
        }

        System.out.println(count);
        System.out.println(se);
    }

}
