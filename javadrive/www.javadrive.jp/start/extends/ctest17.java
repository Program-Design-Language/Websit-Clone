class ctest17{
    public static void main(String args[]){
        C c = new C();
        c.disp();
    }
}

class A{
    public void disp(){
        System.out.println("�d�����i�ł�");
    }
}

class B extends A{
    public void disp(){
        System.out.println("�G�A�R���ł�");
        super.disp();
    }
}

class C extends B{
    public void disp(){
        System.out.println("�O�H���ł�");
        super.disp();
    }
}
