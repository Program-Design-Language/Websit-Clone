class ctest9{

    public static void main(String args[]){
        Television tv1 = new Television("居間");

        tv1.dispChannel();

        Television tv2 = new Television("台所");

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
        System.out.println("現在のチャンネルは" + channelNo+ "です");
        System.out.println("設置してある場所は" + place + "です");
    }
}
