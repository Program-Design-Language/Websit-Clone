class ctest19{
    public static void main(String args[]){
        seihinA c = new seihinA();
    }
}

abstract class base{
    abstract public void dispName();

    public void dispCompany(){
        System.out.println("XYZ社製造の製品です");
    }
}

class seihinA extends base{

    public void dispVersion(){
        System.out.println("バージョンは1.0です");
    }

}
