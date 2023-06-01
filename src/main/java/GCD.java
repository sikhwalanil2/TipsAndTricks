import static com.google.common.math.IntMath.gcd;

public class GCD {

    public static void main(String args[]){

        int a[] = {2,4,6};
        boolean isTraversal=true;

        for(int i=1;i<a.length;i++){
            int val = gcd(a[i-1],a[i]);
            if(val < 2){
                isTraversal = false;
                break;
            }
        }

            System.out.println(isTraversal);

    }

    public static int gcd(int a, int b){
        while(a!=b)
        {
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }

        return b;

    }
}
