class ctest14{
    public static void main(String args[]){
        C sample = new C();
    }
}

class A{
    A(){
        System.out.println("�N���XA�̃R���X�g���N�^");
    }
}

class B extends A{
    B(){
        System.out.println("�N���XB�̃R���X�g���N�^");
    }
}

class C extends B{
    C(){
        System.out.println("�N���XC�̃R���X�g���N�^");
    }
}
