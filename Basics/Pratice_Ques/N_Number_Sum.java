package Basics.Pratice_Ques;

public class N_Number_Sum {
    public static void main(String[] args) {
//        Normal Way -
        int n = 10;
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);

//        Efficient Way -
//        General Formula -
        System.out.println((n*(n+1))/2);
    }
}
