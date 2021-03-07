class testString5{

    public static void main(String args[]){
        String str = "‚è‚ñ‚²,ƒŒƒ‚ƒ“,‚·‚¢‚©,‚Ô‚Ç‚¤";
        String[] fruit = str.split(",", 0);

        for (int i = 0 ; i < fruit.length ; i++){
            System.out.println(i + "”Ô–Ú‚Ì—v‘f = :" + fruit[i]);
        }
    }
}
