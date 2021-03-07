class testString3{

    public static void main(String args[]){
        String str1 = new String("Good Morning");
        String upper_str1 = str1.toUpperCase();
        String lower_str1 = str1.toLowerCase();

        System.out.println("Œ³‚Ì•¶š—ñ : " + str1);
        System.out.println("‘å•¶š‚Ö•ÏŠ· : " + upper_str1);
        System.out.println("¬•¶š‚Ö•ÏŠ· : " + lower_str1);

        String str2 = new String("Œ»İ A.M. 320•ª‚Å‚·");
        String upper_str2 = str2.toUpperCase();
        String lower_str2 = str2.toLowerCase();

        System.out.println("Œ³‚Ì•¶š—ñ : " + str2);
        System.out.println("‘å•¶š‚Ö•ÏŠ· : " + upper_str2);
        System.out.println("¬•¶š‚Ö•ÏŠ· : " + lower_str2);
    }
}
