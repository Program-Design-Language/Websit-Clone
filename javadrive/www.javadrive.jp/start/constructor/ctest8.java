class ctest8{

    public static void main(String args[]){
        Television tv1 = new Television();

        tv1.dispChannel();
    }
}

class Television{
    private int channelNo;
    private String housouKyoku;

    Television(){
        channelNo = 1;
        housouKyoku = "FujiTV";
    }

    public void setChannel(int newChannelNo){
        channelNo = newChannelNo;
        if (channelNo == 1){
            housouKyoku = "FujiTV";
        }else if (channelNo == 3){
            housouKyoku = "NHK";
        }
    }

    public void dispChannel(){
        System.out.println("åªç›ÇÃÉ`ÉÉÉìÉlÉãÇÕ" + housouKyoku + "Ç≈Ç∑");
    }
}
