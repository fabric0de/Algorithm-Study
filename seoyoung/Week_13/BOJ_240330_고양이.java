package seoyoung.Week_13;

import java.util.Arrays;

public class BOJ_240330_고양이 {
  // \    /\
  // )  ( ')
  // (  /  )
  //  \(__)|
  public static void main(String[] args) {
    String blank = " ";         // 0
    String slash = "/";         // 1
    String backSlash = "\\";    // 2
    String openBracket = "(";   // 3
    String closeBracket = ")";  // 4
    String singleQuote = "'";   // 5
    String underBar = "_";      // 6
    String verticalBar = "|";   // 7
    String enter = "\n";        // 8

//    String[] cat = {backSlash,blank,blank,blank,blank,slash,backSlash,enter,
//                    blank,closeBracket,blank,blank,openBracket,blank,singleQuote,closeBracket,enter,
//                    openBracket,blank,blank,slash,blank,blank,closeBracket,enter,
//                    blank,backSlash,openBracket,underBar,underBar,closeBracket,verticalBar};
//
//    for(String i : cat){
//      System.out.print(i);
//    }

    String[] drawingTools = {blank, slash, backSlash, openBracket, closeBracket, singleQuote, underBar, verticalBar, enter};

    int[] cat = {2,0,0,0,0,1,2,8,
                 0,4,0,0,3,0,5,4,8,
                 3,0,0,1,0,0,4,8,
                 0,2,3,6,6,4,7};

    for(int i : cat) {
      System.out.print(drawingTools[i]);
    }
  }
}
