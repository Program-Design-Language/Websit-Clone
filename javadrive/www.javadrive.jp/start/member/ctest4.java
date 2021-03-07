class ctest4{

    public static void main(String args[]){
        Television tv1 = new Television();

        tv1.setChannel(1);
    }
}

class Television{
    private int channelNo;

    private void setChannel(int newChannelNo){
        channelNo = newChannelNo;
        System.out.println("êVÇµÇ¢ChannelNo=" + channelNo);
    }
}
