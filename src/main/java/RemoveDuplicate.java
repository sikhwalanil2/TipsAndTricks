public class RemoveDuplicate {


    public static void main(String[] args) {
        String s  = "deep";
        String output = "";
        int len = s.length();
        for (int i=0;i<len;i++){

            output+= len- s.replaceAll(""+s.charAt(i),"").length() ==1 ?""+s.charAt(i):"";

        }

        System.out.println(output);

    }
}
