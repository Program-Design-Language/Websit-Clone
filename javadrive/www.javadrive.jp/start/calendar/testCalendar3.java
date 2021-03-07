import java.util.Calendar;

class testCalendar3{

    public static void main(String args[]){

        Calendar calendar = Calendar.getInstance();

        System.out.println("“ú‚ğ2005/12/30‚Éİ’è‚µ‚Ü‚·");
        calendar.set(2005, 11, 30);
        dispCalendar(calendar);

        System.out.println("-- -- -- -- -- --");

        System.out.println("“ú‚ğ1‚¸‚Â‘‰Á‚³‚¹‚Ü‚·");
        for (int i = 0 ; i < 6 ; i++){
            calendar.add(Calendar.DAY_OF_MONTH, 1);
            dispCalendar(calendar);
        }

        System.out.println("-- -- -- -- -- --");

        System.out.println("“ú‚ğ2006/1/31‚Éİ’è‚µ‚Ü‚·");
        calendar.set(2006, 0, 31);
        dispCalendar(calendar);

        System.out.println("-- -- -- -- -- --");

        System.out.println("Œ‚ğ1‚¸‚Â‘‰Á‚³‚¹‚Ü‚·");
        for (int i = 0 ; i < 4 ; i++){
            calendar.add(Calendar.MONTH, 1);
            dispCalendar(calendar);
        }

    }

    private static void dispCalendar(Calendar calendar){

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DATE);

        StringBuffer sb = new StringBuffer();
        sb.append("İ’è‚³‚ê‚Ä‚¢‚é“ú‚Í");
        sb.append(year + "”N" + month + "Œ" + day + "“ú");
        sb.append("‚Å‚·B");

        System.out.println(new String(sb));
    }
}
