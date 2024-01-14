import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 1000000;
        int[] customer = new int[max];
        int leader, staff;
        for(int i = 0; i<n; i++){
            customer[i] = sc.nextInt();
        }
        leader = sc.nextInt();
        staff = sc.nextInt();
        long answer = 0;
        for(int i = 0; i < n; i++){
            customer[i] -= leader;
            if(customer[i] <= 0){
                answer += 1;
            }
            else if(customer[i] % staff == 0){
                answer += customer[i] / staff + 1;
            } else{
                answer += customer[i] / staff + 2;
            }
        }
        System.out.println(answer);
    }
}