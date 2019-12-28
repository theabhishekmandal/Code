import java.util.*;

public class Main{
    private static int counter = 0;
    private static int length = 0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.nextInt();
        String string = s.next();
        char[][] arr = new char[8][8];
        length = arr.length;
        for(int i = 0; i < arr.length; i++){
            String input = s.next();
            for(int j = 0; j < arr[i].length; j++)
                arr[i][j] = input.charAt(j);
        }
        solve(string, arr);
        System.out.println(counter);
    }
    private static void solve(String string, char[][] arr){
        boolean[][] flag = new boolean[8][8];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] == 'f'){
                    flag[i][j] = true;
                    call(arr, string, 1, i, j, flag, "" + 'f');
                    flag[i][j] = false;
                }
            }
        }
    }

    private static boolean checkbounds(int row, int col){
        return (row < 0 || row >= length || col < 0 || col >= length);
    }

    private static void call(char[][] arr, String string, int stringCounter, int i, int j, boolean[][] flag, String answer){

        if(stringCounter == string.length()){
            System.out.println(answer);
            counter++;
            return;
        }

        char chartoBeMatched = string.charAt(stringCounter);

        for(int k = i - 1; k <= i + 1; k++){
            for(int l = j - 1; l <= j + 1; l++){
                if(k == i && l == j) continue;
                if(!checkbounds(k, l) && chartoBeMatched == arr[k][l] && !flag[k][l]){
                    flag[k][l] = true;
                    call(arr, string, stringCounter + 1, k, l, flag, answer + arr[k][l]);
                    flag[k][l] = false;
                }
            }
        }
    }
}