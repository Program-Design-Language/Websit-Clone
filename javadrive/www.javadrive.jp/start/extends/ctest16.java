class ctest16{
    public static void main(String args[]){
        B1 b1 = new B1();
        b1.disp();

        B2 b2 = new B2();
        b2.disp();
    }
}

class A{
    public void disp(){
        System.out.println("�d�����i�ł�");
    }
}

class B1 extends A{
    public void disp(){
        System.out.println("�G�A�R���ł�");
    }
}

class B2 extends A{
}
