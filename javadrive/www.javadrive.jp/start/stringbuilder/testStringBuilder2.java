class testStringBuilder2{

    public static void main(String args[]){
        StringBuilder sb = new StringBuilder();
        sb.append("‚±‚ñ‚É‚¿‚ÍBŒ³‹C‚Å‚·B");
        sb.insert(5, "—é–Ø‚³‚ñ");

        System.out.println(new String(sb));
    }
}
