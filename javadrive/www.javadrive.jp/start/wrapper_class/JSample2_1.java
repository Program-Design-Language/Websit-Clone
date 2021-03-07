class JSample2_1{
  public static void main(String args[]){
    int i = 84;
    Integer oi = new Integer(i);

    System.out.println(oi.intValue());

    /* オートボクシングを利用 */
    Long ol = 153L;

    System.out.println(ol.longValue());
  }
}
