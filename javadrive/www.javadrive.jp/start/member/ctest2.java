class ctest2{

    public static void main(String args[]){
        Television tv1 = new Television();

        tv1.channelNo = 1;
    }
}

class Television{
    private int channelNo;

    void setChannel(int newChannelNo){
        channelNo = newChannelNo;
        System.out.println("êVÇµÇ¢ChannelNo=" + channelNo);
    }
}
