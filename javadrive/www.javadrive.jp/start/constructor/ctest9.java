class ctest9{

    public static void main(String args[]){
        Television tv1 = new Television("����");

        tv1.dispChannel();

        Television tv2 = new Television("�䏊");

        tv2.dispChannel();
    }
}

class Television{
    private int channelNo;
    private String place;

    Television(String newPlace){
        channelNo = 1;
        place = newPlace;
    }

    public void setChannel(int newChannelNo){
        channelNo = newChannelNo;
    }

    public void dispChannel(){
        System.out.println("���݂̃`�����l����" + channelNo+ "�ł�");
        System.out.println("�ݒu���Ă���ꏊ��" + place + "�ł�");
    }
}
