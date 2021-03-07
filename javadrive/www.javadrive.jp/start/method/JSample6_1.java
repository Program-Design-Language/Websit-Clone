class JSample6_1{
  public static void main(String args[]){
    int data[];

    data = init();
    System.out.println(data[0]);
    System.out.println(data[1]);
  }

  private static int[] init(){
    int data[] = new int[2];
    data[0] = 10;
    data[1] = 19;

    return data;
  }
}
