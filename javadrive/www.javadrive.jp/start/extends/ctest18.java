class ctest18{
    public static void main(String args[]){
        superClass obj = new subClass();

        obj.dispName();
    }
}

class superClass{
    public void dispName(){
        System.out.println("����`�ł�");
    }
}

class subClass extends superClass{
    public void dispName(){
        System.out.println("���i����XXX�ł�");
    }

    public void dispVersion(){
        System.out.println("�o�[�W����1.0�ł�");
    }
}
