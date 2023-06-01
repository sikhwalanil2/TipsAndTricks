public class Metrice {


    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int total =0;

        for(int i=0;i<3;i++){

            for(int j=0;j<3;j++){

                total+=a[i][j];

            }
        }

        System.out.println(total);

    }


}
