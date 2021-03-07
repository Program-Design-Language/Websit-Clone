class ctest20{
    public static void main(String args[]){
        seihinA c = new seihinA();

        c.dispName();
    }
}

abstract class base{
    abstract public void dispName();

    public void dispCompany(){
        System.out.println("XYZ社製造の製品です");
    }
}

class seihinA extends base{

    public void dispName(){
        System.out.println("製品名はXXXです");
    }

    public void dispVersion(){
        System.out.println("バージョンは1.0です");
    }

}
