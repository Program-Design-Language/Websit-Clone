/* Java正規表現サンプル */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class JSample2_1{
  public static void main(String args[]){
    String str1 = "No.8710";
    String str2 = "No.0000";

    String regex1 = "\\d\\d\\d\\d";
    Pattern p1 = Pattern.compile(regex1);

    String regex2 = "(?!0000)\\d\\d\\d\\d";
    Pattern p2 = Pattern.compile(regex2);

    System.out.println("パターン : " + regex1);

    check(p1, str1);
    check(p1, str2);

    System.out.println("パターン : " + regex2);

    check(p2, str1);
    check(p2, str2);
  }

  private static void check(Pattern p, String target){
    Matcher m = p.matcher(target);

    if (m.find()){
      System.out.println("○ " + target);
      System.out.println("   " + m.group());
    }else{
      System.out.println("× " + target);
    }
  }
}
