class JSample5_1{
  public static void main(String args[]){
    String str1 = "124";
    String str2 = "73";
    String str3 = "4.987";

    int i = Integer.parseInt(str1);
    Byte ob = new Byte(str2);
    Double od = Double.valueOf(str3);

    System.out.println(i);
    System.out.println(ob.byteValue());
    System.out.println(od.doubleValue());
  }
}
