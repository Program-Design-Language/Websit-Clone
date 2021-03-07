class JSample6_1{
  public static void main(String args[]){
    String str = "˜rŽžŒv";

    System.out.println("•¶Žš—ñ‚Ì’·‚³‚Í" + str.length());

    for (int i = 0; i < str.length(); i++){
      char c = str.charAt(i);
      System.out.println(c);
    }
  }
}
