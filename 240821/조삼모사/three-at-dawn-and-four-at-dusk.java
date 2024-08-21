import java.util.*;
public class Main {
    static boolean[] v;
    static int N;
    static int min = Integer.MAX_VALUE;
    static int[][] map;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        map = new int[N][N];
        v = new boolean[N];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                map[i][j] = sc.nextInt();
            }
        }
        dfs(0);
        System.out.println(min);
    }

    public static void dfs(int cnt){
        if(cnt>= N/2){
            diff(); //일 나누기
            return;
        }

        for(int i = 0; i < N; i++){
            if(v[i])
                continue;
            v[i] = true;
            dfs(cnt+1);
            v[i] = false;
        }

    }

    public static void diff(){
        int morning = 0;
        int evening = 0;
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(i != j){ //같은 번호 제외
                    if(v[i]){ //i가 아침일때
                        if(v[j])
                            morning += map[i][j];
                    }else{ //i가 저녁일때
                        if(!v[j])
                            evening += map[i][j];
                    }
                }
                
            }
        }
        min = Math.min(min,(Math.abs(morning-evening)));
    }
}