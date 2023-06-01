import java.util.HashSet;

public class RemoveDuplicates {


    public static void main(String[] args) {


//        int a[] = {3,4,9};
//
//         int output[] = plusOne(a);
//
//
//        for(int x:output){
//            System.out.println(x);
//        }


     //   System.out.println(countLongestSubString("dvdf"));

//        int []nums1 = {1,2};
//        int [] nums2 = {3,4};
//
//        System.out.println(findMedianSortedArrays(nums1,nums2));

        System.out.println(longestPalindrome("badad"));
    }

    public static int countLongestSubString(String s) {

        HashSet<Character> set = new HashSet<>();

        int max =0 ;
        int left=0;
        int right =0;
        for (;right<s.length();right++) {
            while (!set.add(s.charAt(right))) {
                set.remove(s.charAt(left++));
            }

            max = Math.max(max, right - left);
        }

        return set.size();
    }


    public static int[] plusOne(int[] digits) {


        int n = digits.length;
        for(int i=n-1; i>=0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] newNumber = new int [n+1];
        newNumber[0] = 1;

        return newNumber;
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int nLen1= nums1.length;
        int nLen2= nums2.length;
        int size = nLen1+nLen2;
        int c[] = new int[size];


            int i = c.length-1;
            while(i>=0){

                if(nLen1==0){
                    while(nLen2>0 ){
                        c[i--]=nums2[nLen2-1];
                        nLen2--;

                    }
                    break;
                }else if(nLen2==0){
                    while (nLen1>0){
                        c[i--]=nums1[nLen1-1];
                        nLen1--;
                    }
                    break;
                }

                int val1 = nums1[nLen1-1];
                int val2 = nums2[nLen2-1];

                if(val1>=val2){
                    c[i]=val1;
                    nLen1--;
                }else{
                    c[i]=val2;
                    nLen2--;
                }
//                System.out.println(c[i]);
                i--;

            }
            int mod = size%2;
            int divide = size/2;
            return mod==0? ((double) (c[divide]+c[divide-1])/2):c[divide];
    }

    public static String longestPalindrome(String s) {
        String output = "";
        for(int i=0;i<s.length();i++){
            int f = s.indexOf(s.charAt(i));
            int l = s.lastIndexOf(s.charAt(i));
            if(f!=l){
                if((l-f+1) > output.length()){
                    output="";
                while(l>f){
                    char fc = s.charAt(f++);
                    char lc = s.charAt(l--);

                    if(fc !=lc){
                        break;
                    }else {
                        output+=fc;
                    }
                }
                if(output.length()>1) {
                    if((l-f+1)%2 ==0)
                    output +=  new StringBuilder(output).reverse().toString();
                    else   output+=s.charAt(i)+new StringBuilder(output).reverse().toString();
                }else {
                    output += s.charAt(f);
                }


            }}
            ;

        }

        return  output.isEmpty()?output.substring(0,1):  output;
    }

    public static void removeDuplicates(int [] a){
        int t [];
        for(int i=0;i<a.length;i++){

        }
    }
}
