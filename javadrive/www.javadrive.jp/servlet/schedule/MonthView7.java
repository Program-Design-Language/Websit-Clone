import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Calendar;
import java.sql.*;

public class MonthView7 extends HttpServlet{

    protected Connection conn = null;

    public void init() throws ServletException{
        String url = "jdbc:mysql://localhost/servletschedule";
        String user = "scheduleuser";
        String password = "schedulepass";

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conn = DriverManager.getConnection(url, user, password);
        }catch (ClassNotFoundException e){
            log("ClassNotFoundException:" + e.getMessage());
        }catch (SQLException e){
            log("SQLException:" + e.getMessage());
        }catch (Exception e){
            log("Exception:" + e.getMessage());
        }
    }

    public void destory(){
        try{
            if (conn != null){
                conn.close();
            }
        }catch (SQLException e){
            log("SQLException:" + e.getMessage());
        }
    }

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

        /* ���[�U�[�������o�� */
        HttpSession session = req.getSession(false);
        String username = (String)session.getAttribute("username");
        String tmpuserid = (String)session.getAttribute("userid");
        int userid = 0;
        if (tmpuserid != null){
            userid = Integer.parseInt(tmpuserid);
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

        sb.append("<p>");
        sb.append(username);
        sb.append("����̃X�P�W���[���ł�");
        sb.append("</p>");

        /* ���t�f�[�^��z��Ɋi�[ */
        count = setDateArray(year, month, day, calendarDay, count);

        /* �N���̃����N�쐬 */
        sb.append(createMonthLink(year, month));

        sb.append("<table>");

        sb.append("<tr><td class=\"week\">��</td><td class=\"week\">��</td><td class=\"week\">��</td><td class=\"week\">��</td><td class=\"week\">��</td><td class=\"week\">��</td><td class=\"week\">�y</td></tr>");

        int weekCount = count / 7;

        for (int i = 0 ; i < weekCount ; i++){
            /* �X�P�W���[���̓��t��ʂ��쐬���� */
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

            /* �J�����_�[�̃X�P�W���[���o�^��ʂ��쐬���� */
            sb.append(createScheduleStr(year, month, i * 7, calendarDay, userid));
        }

        sb.append("</table>");

        sb.append("</body>");
        sb.append("</html>");

        out.println(new String(sb));
    }

    /* �X�P�W���[���o�^�ւ̃����N��ݒ肷�� */
    protected String createScheduleStr(int year, int month, int startDayNo, int[] calendarDay, int userid){
        StringBuffer sb = new StringBuffer();

        sb.append("<tr>");

        for (int i = startDayNo ; i < startDayNo + 7 ; i++){
            if (calendarDay[i] > 35){
                /* �O���y�ї����̉ӏ��ɂ̓A�C�R���͕\�����Ȃ� */
                sb.append("<td class=\"sche\"></td>");
            }else{
                sb.append("<td class=\"sche\">");
                sb.append("<a href=\"/schedule/NewSchedule");

                /* �p�����[�^�̍쐬 */
                sb.append("?YEAR=");
                sb.append(year);
                sb.append("&MONTH=");
                sb.append(month);
                sb.append("&DAY=");
                sb.append(calendarDay[i]);

                sb.append("\">");
                sb.append("<img src=\"./img/memo.png\" width=\"14\" height=\"16\">");
                sb.append("</a><br>");

                /* �X�P�W���[���̕\�� */

                sb.append("<span class=\"small\">");

                try {
                    String sql = "SELECT * FROM schedule WHERE userid = ? and scheduledate = ? ORDER BY starttime";
                    PreparedStatement pstmt = conn.prepareStatement(sql);

                    String startDateStr = year + "-" + (month + 1) + "-" + calendarDay[i];
                    pstmt.setInt(1, userid);
                    pstmt.setString(2, startDateStr);

                    ResultSet rs = pstmt.executeQuery();

                    while(rs.next()){
                        int id = rs.getInt("id");
                        String starttime = rs.getString("starttime");
                        String endtime = rs.getString("endtime");
                        String schedule = rs.getString("schedule");

                        if (starttime == null || endtime == null){
                            sb.append("* ");
                        }else{
                            sb.append(starttime.substring(0, 5));
                            sb.append("-");
                            sb.append(endtime.substring(0, 5));
                            sb.append(" ");
                        }
                        sb.append("<a href=\"/schedule/ScheduleView?ID=");
                        sb.append(id);
                        sb.append("\">");
                        sb.append(schedule);
                        sb.append("</a><br>");
                    }

                    rs.close();
                    pstmt.close();

                }catch (SQLException e){
                    log("SQLException:" + e.getMessage());
                }

                sb.append("</span>");

                sb.append("</td>");
            }
            sb.append("</td>");
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
