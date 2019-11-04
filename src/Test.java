import java.io.*;
import java.util.*;


public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine().trim());
        String[] S = new String[N];
        for(int i_S=0; i_S<N; i_S++)
        {
            S[i_S] = br.readLine();
        }

        int out_ = solve(N , S);
        System.out.println(out_);

        wr.close();
        br.close();
    }
    static int solve(int N , String[] S){
            int count = 0;
            for(String s : S){
                    if(CheckOdd(s))
                        count++;
            }
          return count;
    }

    static boolean checkPalindrome(String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }
        return true;
    }

    static boolean CheckOdd(String s)
    {
        int n = s.length();
        for (int i = 0; i < n; i++)
        {
            String x = "";
            for (int j = i; j < n; j=j+2)
            {
               x=s.substring(i,j+1);
                if(
                        checkPalindrome(x) == false)
                    return false;
            }
        }

        return true;
    }
}