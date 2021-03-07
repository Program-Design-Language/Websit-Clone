import java.util.Calendar;

class testCalendar2{

    public static void main(String args[]){

        Calendar calendar = Calendar.getInstance();

        System.out.println("Œ»İ‚Ì“ú‚ğİ’è‚µ‚Ü‚·");
        dispCalendar(calendar);

        System.out.println("-- -- -- -- -- --");

        calendar.set(Calendar.YEAR, 2005);
        System.out.println("”N‚ğ2005”N‚Éİ’è‚µ‚Ü‚·");
        dispCalendar(calendar);

        System.out.println("-- -- -- -- -- --");

        calendar.set(2005, 10, 25);
        System.out.println("”NŒ“ú‚ğ2005”N11Œ25“ú‚Éİ’è‚µ‚Ü‚·");
        dispCalendar(calendar);

        System.out.println("-- -- -- -- -- --");

        calendar.set(2005, 10, 25, 14, 18);
        System.out.println("“ú‚ğ2005”N11Œ25“ú1418•ª‚Éİ’è‚µ‚Ü‚·");
        dispCalendar(calendar);
    }

    private static void dispCalendar(Calendar calendar){
        String[] week_name = {"“ú—j“ú", "Œ—j“ú", "‰Î—j“ú", 
                 "…—j“ú", "–Ø—j“ú", "‹à—j“ú", "“y—j“ú"};

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DATE);
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int week = calendar.get(Calendar.DAY_OF_WEEK) - 1;

        System.out.println("İ’è‚³‚ê‚Ä‚¢‚é“ú‚Í");
        System.out.println(year + "”N" + month + "Œ" + day + "“ú");
        System.out.println("(" + week_name[week] + ")");
        System.out.println(hour + "" + minute + "•ª" + second + "•b");
    }
}
