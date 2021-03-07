class ctest9{

    public static void main(String args[]){
        Television tv1 = new Television("‹ŠÔ");

        tv1.dispChannel();

        Television tv2 = new Television("‘äŠ");

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
        System.out.println("Œ»İ‚Ìƒ`ƒƒƒ“ƒlƒ‹‚Í" + channelNo+ "‚Å‚·");
        System.out.println("İ’u‚µ‚Ä‚ ‚éêŠ‚Í" + place + "‚Å‚·");
    }
}
