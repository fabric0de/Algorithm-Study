package seoyoung.Week_14;

import java.io.*;

public class BOJ_240406_빠른_A_plus_B {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
    int loopNum = Integer.parseInt(bufferedReader.readLine());

    for (int i=0; i<loopNum; i++) {
      String str = bufferedReader.readLine();
      int a = Integer.parseInt(str.split(" ")[0]);
      int b = Integer.parseInt(str.split(" ")[1]);

      bufferedWriter.write((a+b)+"\n");
    }
    bufferedWriter.close();
  }
}
