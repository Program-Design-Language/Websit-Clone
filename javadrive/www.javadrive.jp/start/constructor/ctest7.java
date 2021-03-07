class ctest7{

    public static void main(String args[]){
        Television tv1 = new Television();

        tv1.dispChannel();
    }
}

class Television{
    private int channelNo;
    private String housouKyoku;

    public void setChannel(int newChannelNo){
        channelNo = newChannelNo;
        if (channelNo == 1){
            housouKyoku = "FujiTV";
        }else if (channelNo == 3){
            housouKyoku = "NHK";
        }
    }

    public void dispChannel(){
        System.out.println("Œ»İ‚Ìƒ`ƒƒƒ“ƒlƒ‹‚Í" + housouKyoku + "‚Å‚·");
    }
}
