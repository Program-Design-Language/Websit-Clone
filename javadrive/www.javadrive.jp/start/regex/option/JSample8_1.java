/* Java正規表現サンプル */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class JSample8_1{
  public static void main(String args[]){
    String str1 = "100";
    String str2 = "old20";
    String str3 = "\\d+";

    String regex1 = "\\d+";
    Pattern p1 = Pattern.compile(regex1);

    String regex2 = "\\d+";
    Pattern p2 = Pattern.compile(regex2, Pattern.LITERAL);

    System.out.println("パターン : " + regex1);

    check(p1, str1);
    check(p1, str2);
    check(p1, str3);

    System.out.println("\nPattern.compile(regex, Pattern.LITERAL)");
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
