class ctest11{
    public static void main(String args[]){
        Soarer soarer = new Soarer();

        soarer.openRoof();
        if (soarer.roofOpenFlag){
            System.out.println("�������J���Ă��܂�");
        }else{
            System.out.println("���������Ă��܂�");
        }

        soarer.accele();
        System.out.println("���݂̑��x��" + soarer.speed + "�L���ł�");
    }
}

class Car{
    int speed = 0;

    public void accele(){
        speed += 5;
    }

    public void brake(){
        speed -= 5;
    }
}

class Soarer extends Car{
    boolean roofOpenFlag = false;

    public void openRoof(){
        roofOpenFlag = true;
    }

    public void closeRoof(){
        roofOpenFlag = true;
    }
}
