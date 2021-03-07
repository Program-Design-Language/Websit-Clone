class JSample4_1{
  public static void main(String args[]){
    String str1 = "abc";
    String str2 = "abc";
    String str3 = "ab";

    System.out.println("str1 = " + str1);
    System.out.println("str2 = " + str2);

    if (str1 == str2){
      System.out.println("“™‚µ‚¢");
    }else{
      System.out.println("“™‚µ‚­‚È‚¢");
    }

    str3 = str3 + "c";

    System.out.println("str1 = " + str1);
    System.out.println("str3 = " + str3);

    if (str1 == str3){
      System.out.println("“™‚µ‚¢");
    }else{
      System.out.println("“™‚µ‚­‚È‚¢");
    }

    System.out.println("equalsƒƒ\ƒbƒh‚Å”äŠr");
    if (str1.equals(str3)){
      System.out.println("“™‚µ‚¢");
    }else{
      System.out.println("“™‚µ‚­‚È‚¢");
    }
  }
}
