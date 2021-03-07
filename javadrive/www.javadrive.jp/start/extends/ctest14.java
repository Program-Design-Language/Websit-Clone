class ctest14{
    public static void main(String args[]){
        C sample = new C();
    }
}

class A{
    A(){
        System.out.println("クラスAのコンストラクタ");
    }
}

class B extends A{
    B(){
        System.out.println("クラスBのコンストラクタ");
    }
}

class C extends B{
    C(){
        System.out.println("クラスCのコンストラクタ");
    }
}
