class ctest20{
    public static void main(String args[]){
        seihinA c = new seihinA();

        c.dispName();
    }
}

abstract class base{
    abstract public void dispName();

    public void dispCompany(){
        System.out.println("XYZ�А����̐��i�ł�");
    }
}

class seihinA extends base{

    public void dispName(){
        System.out.println("���i����XXX�ł�");
    }

    public void dispVersion(){
        System.out.println("�o�[�W������1.0�ł�");
    }

}
