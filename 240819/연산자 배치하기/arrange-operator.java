import java.util.*;

public class Main {
    static int op[];
    static int num[];
    static int n;
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    static boolean v[];
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        op = new int[3]; //연산자
        num = new int[n]; //숫자
        for(int i = 0; i < n; i++)
            num[i] = sc.nextInt(); //숫자 입력
        
        for(int i = 0; i < 3; i++){
            op[i] = sc.nextInt(); //연산자 입력
        }

        dfs(1, num[0]);
        System.out.println(min + " " + max);
    }

    public static void dfs(int t, int sum){
        if(t == n){
            max = Math.max(max,sum);
            min = Math.min(min,sum); //최댓값 최솟값 정리
            return;
        }
        if(op[0]>0){ //더하기를 했을 경우
            op[0]--;
            dfs(t+1, sum + num[t]);
            op[0]++; //복구
        }
        
        if(op[1]>0){ //빼기를 했을 경우
            op[1]--;
            dfs(t+1, sum - num[t]);
            op[1]++; //복구
        }  
            
        if(op[2]>0){ //곱하기를 했을 경우
            op[2]--;
            dfs(t+1, sum * num[t]);
            op[2]++; //복구
        }   
        
    }
}