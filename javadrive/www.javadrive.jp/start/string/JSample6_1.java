class JSample6_1{
  public static void main(String args[]){
    String str = "腕時計";

    System.out.println("文字列の長さは" + str.length());

    for (int i = 0; i < str.length(); i++){
      char c = str.charAt(i);
      System.out.println(c);
    }
  }
}
