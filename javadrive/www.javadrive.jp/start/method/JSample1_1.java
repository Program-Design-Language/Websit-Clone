class JSample1_1{
  public static void main(String args[]){
    int eigo = 78;
    int suugaku = 90;
    int kokugo = 68;

    check("�p��", eigo);
    check("���w", suugaku);
    check("����", kokugo);
  }

  private static void check(String kyoka, int seiseki){
    System.out.print(kyoka + "�̎������ʂ�");
    if (seiseki > 80){
      System.out.println("���i�ł�");
    }else{
      System.out.println("�s���i�ł�");
    }
  }
}
