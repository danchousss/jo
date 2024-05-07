import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner dan=new Scanner(System.in);
        int number=dan.nextInt();
        int [] rim=new int[number];
        int [] pipo=new int[number];
        int [] pipo = find_even(rim,dan);
    }
    public static int[] find_even(int[]rim,Scanner dan){
        for(int i=0;i<rim.length;i++){
            rim[i]=dan.nextInt();
        }
        int sum=0;
        int count=0;

        for(int i=0;i<rim.length;i++){
            if(rim [i]% 2==0) {
                sum += rim[i];
                count++;
            }
        }
        double aver =sum/count;
        return aver;
    }public static void

}


























































////1
//import java.util.Scanner;
//public class Main{
//    public static void main(String[]args){
//        Scanner dan=new Scanner(System.in);
//        int number=dan.nextInt();
//        int[]array=new int[number];
//        for(int i=0;i< array.length;i++){
//            array[i]=dan.nextInt();
//        }
//        System.out.println(findZero(array));
//
//    }
//    public static int findZero(int[]array){
//        int per=0;
//        for(int i=0;i< array.length;i++){
//            if(array[i]==707){
//                per=i;
//
//            }
//        }return per;
//    }
//}