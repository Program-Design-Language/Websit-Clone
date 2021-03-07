/* Java正規表現サンプル */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class JSample7_1{
  public static void main(String args[]){
    String str1 = "ＡＮＴ";
    String str2 = "ａｎｔ";

    String regex1 = "ａｎｔ";
    Pattern p1 = Pattern.compile(regex1);

    String regex2 = "(?u)ａｎｔ";
    Pattern p2 = Pattern.compile(regex2);

    String regex3 = "(?i)ａｎｔ";
    Pattern p3 = Pattern.compile(regex3);

    String regex4 = "(?i)(?u)ａｎｔ";
    Pattern p4 = Pattern.compile(regex4);

    String regex5 = "ａｎｔ";
    Pattern p5 = Pattern.compile(regex5, Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE);

    System.out.println("パターン : " + regex1);

    check(p1, str1);
    check(p1, str2);

    System.out.println("パターン : " + regex2);

    check(p2, str1);
    check(p2, str2);

    System.out.println("パターン : " + regex3);

    check(p3, str1);
    check(p3, str2);

    System.out.println("パターン : " + regex4);

    check(p4, str1);
    check(p4, str2);

    System.out.println("\nPattern.compile(regex, Pattern.UNICODE_CASE | Pattern.CASE_INSENSITIVE)");
    System.out.println("パターン : " + regex5);

    check(p5, str1);
    check(p5, str2);
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
