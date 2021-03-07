/* Java正規表現サンプル */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class JSample6_1{
  public static void main(String args[]){
    String str1 = "Watch 3500yen";
    String str2 = "Apple 280yen";
    String str3 = "1350year";

    String regex1 = "(?x)" + 
      "(                          \n" +
      "  (                        \n" +
      "    \\d   #任意の数字      \n" +
      "    +     #1回以上繰り返し \n" +
      "  )                        \n" +
      "  (                        \n" +
      "    yen   #yenで終わる     \n" +
      "   )                       \n" +
      " )";

    Pattern p1 = Pattern.compile(regex1);

    String regex2 =
      "(                          \n" +
      "  (                        \n" +
      "    \\d   #任意の数字      \n" +
      "    +     #1回以上繰り返し \n" +
      "  )                        \n" +
      "  (                        \n" +
      "    yen   #yenで終わる     \n" +
      "   )                       \n" +
      " )";

    Pattern p2 = Pattern.compile(regex2, Pattern.COMMENTS);

    System.out.println("パターン : " + regex1);

    check(p1, str1);
    check(p1, str2);
    check(p1, str3);

    System.out.println("\nPattern.compile(regex, Pattern.COMMENTS)");
    System.out.println("パターン : " + regex2);

    check(p2, str1);
    check(p2, str2);
    check(p2, str3);
  }

  private static void check(Pattern p, String target){
    Matcher m = p.matcher(target);

    if (m.find()){
      System.out.println("○ " + target);
    }else{
      System.out.println("× " + target);
    }
  }
}
