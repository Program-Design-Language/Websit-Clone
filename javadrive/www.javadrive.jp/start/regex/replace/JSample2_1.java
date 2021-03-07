/* Java正規表現サンプル */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class JSample2_1{
  public static void main(String args[]){
    String str = "Orange is 100yen, Banana is 180yen.";

    String regex = "(\\d.+?)(yen)";
    Pattern p = Pattern.compile(regex);

    Matcher m = p.matcher(str);

    String result1 = m.replaceAll("'$0'");

    System.out.println("replaceAll(\"'$0'\")");
    System.out.println("before : " + str);
    System.out.println("after  : " + result1);

    String result2 = m.replaceAll("$2_$1");

    System.out.println("replaceAll(\"$2_$1\")");
    System.out.println("before : " + str);
    System.out.println("after  : " + result2);

    String result3 = m.replaceAll("\\\\$1");

    System.out.println("replaceAll(\"\\\\$1\")");
    System.out.println("before : " + str);
    System.out.println("after  : " + result3);
  }
}
