import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); //식당 수
        int[] shop = new int[N];
        for(int i = 0; i < N; i++){
            shop[i] = sc.nextInt(); //가게의 고객 수를 저장
        }
        int leader = sc.nextInt();
        int crew = sc.nextInt();

        int answer = 0;

        for(int i = 0; i < N; i++){
            answer++;
            shop[i] -= leader;
            if(shop[i] != 0)
                answer += shop[i]/crew; //남은 인원을 crew로 나누고 계산
        }
        System.out.println(answer);
    }
}