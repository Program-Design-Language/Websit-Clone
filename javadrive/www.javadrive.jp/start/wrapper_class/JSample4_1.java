class JSample4_1{
  public static void main(String args[]){
    int i = 84;
    Integer oi = new Integer(i);

    String str1 = oi.toString();
    String str2 = String.valueOf(i);
    String str3 = "" + i;

    System.out.println(str1);
    System.out.println(str2);
    System.out.println(str3);
  }
}
