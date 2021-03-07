import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Calendar;

public class MonthView3 extends HttpServlet{

    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException{

        res.setContentType("text/html;charset=Shift_Jis");
        PrintWriter out = res.getWriter();

        int[] calendarDay;
        int count;

        int year;
        int month;
        int day = 1;

        calendarDay = new int[42];  /* �ő��7���~6�T */
        count = 0;

        String param = req.getParameter("YEAR");
        if (param == null || param.length() == 0){
            year = -999;
        }else{
            try{
                year = Integer.parseInt(param);
            }catch (NumberFormatException e){
                year = -999;
            }
        }

        param = req.getParameter("MONTH");
        if (param == null || param.length() == 0){
            month = -999;
        }else{
            try{
                month = Integer.parseInt(param);
            }catch (NumberFormatException e){
                month = -999;
            }
        }

        /* �p�����[�^���w�肳��Ă��Ȃ��ꍇ�͖{���̓��t��ݒ� */
        if (year == -999 || month == -999){
            Calendar calendar = Calendar.getInstance();
            year = calendar.get(Calendar.YEAR);
            month = calendar.get(Calendar.MONTH);
            day = calendar.get(Calendar.DATE);
        }else{
            if (month == 12){
                month = 0;
                year++;
            }

            if (month == -1){
                month = 11;
                year--;
            }
        }

        StringBuffer sb = new StringBuffer();

        sb.append("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.0.1//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">");

        sb.append("<html lang=\"ja\">");
        sb.append("<head>");
        sb.append("<meta http-equiv=\"Content-Type\" Content=\"text/html;charset=Shift_JIS\">");

        sb.append("<title>�X�P�W���[���Ǘ�</title>");

        sb.append("<style>");
        sb.append("table{border:1px solid #a9a9a9;width:90%;padding:0px;margin:0px;border-collapse:collapse;}");
        sb.append("td{width:12%;border-top:1px solid #a9a9a9;border-left:1px solid #a9a9a9;vertical-align:top;margin:0px;padding:2px;}");
        sb.append("td.week{background-color:#f0f8ff;text-align:center;}");
        sb.append("td.day{background-color:#f5f5f5;text-align:right;font-size:0.75em;}");
        sb.append("td.otherday{background-color:#f5f5f5;color:#d3d3d3;text-align:right;font-size:0.75em;}");
        sb.append("td.sche{background-color:#fffffff;text-align:left;height:80px;}");
        sb.append("img{border:0px;}");
        sb.append("span.small{font-size:0.75em;}");
        sb.append("</style>");

        sb.append("</head>");
        sb.append("<body>");

        /* ���t�f�[�^��z��Ɋi�[ */
        count = setDateArray(year, month, day, calendarDay, count);

        /* �N���̃����N�쐬 */
        sb.append(createMonthLink(year, month));

        sb.append("<table>");

        sb.append("<tr><td class=\"week\">��</td><td class=\"week\">��</td><td class=\"week\">��</td><td class=\"week\">��</td><td class=\"week\">��</td><td class=\"week\">��</td><td class=\"week\">�y</td></tr>");

        int weekCount = count / 7;

        for (int i = 0 ; i < weekCount ; i++){
            sb.append("<tr>");

            for (int j = i * 7 ; j < i * 7 + 7 ; j++){
                if (calendarDay[j] > 35){
                    sb.append("<td class=\"otherday\">");
                    sb.append(calendarDay[j] - 35);
                }else{
                    sb.append("<td class=\"day\">");
                    sb.append(calendarDay[j]);
                }
                sb.append("</td>");
            }

            sb.append("</tr>");
            sb.append(createScheduleStr());
        }

        sb.append("</table>");

        sb.append("</body>");
        sb.append("</html>");

        out.println(new String(sb));
    }

    protected String createScheduleStr(){
        StringBuffer sb = new StringBuffer();

        sb.append("<tr>");
        for (int i = 0 ; i < 7 ; i++){
            sb.append("<td class=\"sche\"><img src=\"./img/memo.png\" width=\"14\" height=\"16\"></td>");
        }
        sb.append("</tr>");

        return (new String(sb));
    }

    protected int setDateArray(int year, int month, int day, int[] calendarDay, int count){
        Calendar calendar = Calendar.getInstance();

        /* ���������j������J�n����Ă��邩�m�F���� */
        calendar.set(year, month, 1);
        int startWeek = calendar.get(Calendar.DAY_OF_WEEK);
        System.out.println("�����̗j����" + startWeek + "����");

        /* �挎�������܂ł����������m�F���� */
        calendar.set(year, month, 0);
        int beforeMonthlastDay = calendar.get(Calendar.DATE);
        System.out.println("�挎��" + beforeMonthlastDay + "���܂�");

        /* �����������܂ł����m�F���� */
        calendar.set(year, month + 1, 0);
        int thisMonthlastDay = calendar.get(Calendar.DATE);
        System.out.println("������" + thisMonthlastDay + "���܂�\r\n");

        /* �挎���̓��t���i�[���� */
        for (int i = startWeek - 2 ; i >= 0 ; i--){
            calendarDay[count++] = beforeMonthlastDay - i + 35;
        }

        /* �������̓��t���i�[���� */
        for (int i = 1 ; i <= thisMonthlastDay ; i++){
            calendarDay[count++] = i;
        }

        /* �������̓��t���i�[���� */
        int nextMonthDay = 1;
        while (count % 7 != 0){
            calendarDay[count++] = 35 + nextMonthDay++;
        }

        return count;
    }

    protected String createMonthLink(int year, int month){
        StringBuffer sb = new StringBuffer();

        sb.append("<p>");

        sb.append("<a href=\"/schedule/MonthView?YEAR=");
        sb.append(year);
        sb.append("&MONTH=");
        sb.append(month - 1);
        sb.append("\"><span class=\"small\">�O��</span></a>&nbsp;&nbsp;");

        sb.append(year);
        sb.append("�N");
        sb.append(month + 1);
        sb.append("��&nbsp;&nbsp;");

        sb.append("<a href=\"/schedule/MonthView?YEAR=");
        sb.append(year);
        sb.append("&MONTH=");
        sb.append(month + 1);
        sb.append("\"><span class=\"small\">����</span></a>");

        sb.append("</p>");

        return (new String(sb));
    }

}