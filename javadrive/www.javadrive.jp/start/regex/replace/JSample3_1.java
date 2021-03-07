/* Java正規表現サンプル */

import java.util.regex.Pattern;
import java.util.regex.Matcher;

class JSample3_1{
  public static void main(String args[]){
    String str = "Orange is 100dollar, Banana is 180dollar.";

    String regex = "(\\d.+?)dollar";
    Pattern p = Pattern.compile(regex);

    Matcher m = p.matcher(str);

    String result = m.replaceAll("\\$$1");

    System.out.println("replaceAll(\"\\$$1\")");
    System.out.println("before : " + str);
    System.out.println("after  : " + result);
  }
}
