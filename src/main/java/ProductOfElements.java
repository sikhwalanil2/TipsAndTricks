import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.IntStream;

public class ProductOfElements {

    public static void main(String[] args) {
        int a[]= {0,2,3,4,5};

        int b[]= new int [a.length];
//        product(a);
        index();


        // iterate over array elements
//        for(int i=0;i<a.length;i++){
//            int count =1;
//
//            //
//            for(int j=0;j<a.length;j++){
//                if(i!=j){
//                    count*=a[j];
//                }
//            }
//            b[i]=count;
//        }
//
//
//
//        for(int x:b){
//            System.out.println(x);
//        }
    }


    public  static void product(int a[]){
        int total=1;
        //product of all elems
        for(int i:a){
            if(i!=0)
                total*=i;
        }

            //division
            for (int i : a) {

                if(i!=0)
                    System.out.println(total / i);
                else
                    System.out.println(i);

            }

    }


    public static void index(){
        int k=9;
        int a[] = {2,15,5,7};
//        Map<Integer,Integer> m = new LinkedHashMap<>();
        List li = new ArrayList();

        for(int i: a){
            int diff = k-i;
            li.add(i);
            if(li.contains(diff)){
                System.out.println(li.indexOf(i)+","+li.indexOf(diff));
            }
        }

//        for(int x: a) {
//            int s=k-x;
//            int t =IntStream.range(0, a.length).filter(i->i==s).findFirst().getAsInt();
//            System.out.println(t);
//        }
    }
}
