public class SantaGifts {

    public static void main(String args[]){
        int x=5;
        int [][]b= {{1,1,3,2,3},{3,3,3,3,3},{2,3,1,1,3},{2,2,2,1,2},{2,1,1,2,}};

        System.out.print(counts(x,b));

    }


    public static int counts(int x ,int b[][]){
        int countTwos =0;
        int countThree =0;
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(b[i][j]==2){
                    countTwos++;
                }
                else if(b[i][j]==3){
                    countThree++;
                }
            }
        }
        if(countThree == 0 | countTwos == 0){
            return 1;
        }
        return countTwos+countThree;
    }
}
