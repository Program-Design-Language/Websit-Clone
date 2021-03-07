class ctest18{
    public static void main(String args[]){
        superClass obj = new subClass();

        obj.dispName();
    }
}

class superClass{
    public void dispName(){
        System.out.println("未定義です");
    }
}

class subClass extends superClass{
    public void dispName(){
        System.out.println("製品名はXXXです");
    }

    public void dispVersion(){
        System.out.println("バージョン1.0です");
    }
}
