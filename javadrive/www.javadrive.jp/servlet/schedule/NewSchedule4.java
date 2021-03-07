import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.Calendar;
import java.sql.*;

public class NewSchedule4 extends HttpServlet{

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

        int year;
        int month;
        int day;

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

        param = req.getParameter("DAY");
        if (param == null || param.length() == 0){
            day = -999;
        }else{
            try{
                day = Integer.parseInt(param);
            }catch (NumberFormatException e){
                day = -999;
            }
        }

        /* �p�����[�^���w�肳��Ă��Ȃ��ꍇ�͖{���̓��t��ݒ� */
        if (year == -999 || month == -999 || day == -999){
            Calendar calendar = Calendar.getInstance();
            year = calendar.get(Calendar.YEAR);
            month = calendar.get(Calendar.MONTH);
            day = calendar.get(Calendar.DATE);
        }

        StringBuffer sb = new StringBuffer();

        sb.append("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.0.1//EN\" \"http://www.w3.org/TR/html4/strict.dtd\">");

        sb.append("<html lang=\"ja\">");
        sb.append("<head>");
        sb.append("<meta http-equiv=\"Content-Type\" Content=\"text/html;charset=Shift_JIS\">");

        sb.append("<title>�X�P�W���[���o�^</title>");

        sb.append("<style>");
        sb.append("table.sche{border:1px solid #a9a9a9;padding:0px;margin:0px;border-collapse:collapse;}");
        sb.append("td{vertical-align:top;margin:0px;padding:2px;font-size:0.75em;height:20px;}");
        sb.append("td.top{border-bottom:1px solid #a9a9a9;text-align:center;}");
        sb.append("td.time{background-color:#f0f8ff;text-align:right;border-right:1px double #a9a9a9;padding-right:5px;}");
        sb.append("td.timeb{background-color:#f0f8ff;border-bottom:1px solid #a9a9a9;border-right:1px double #a9a9a9;}");
        sb.append("td.contents{background-color:#ffffff;border-bottom:1px dotted #a9a9a9;}");
        sb.append("td.contentsb{background-color:#ffffff;border-bottom:1px solid #a9a9a9;}");
        sb.append("td.ex{background-color:#ffebcd;border:1px solid #8b0000;}");
        sb.append("img{border:0px;}");
        sb.append("p{font-size:0.75em;}");

        sb.append("#contents{margin:0;padding:0;width:710px;}");
        sb.append("#left{margin:0;padding:0;float:left;width:400px;}");
        sb.append("#right{margin:0;padding:0;float:right;width:300px;background-color:#ffffff;}");
        sb.append("#contents:after{content:\".\";display:block;height:0;clear:both;visibility:hidden;}");
        sb.append("</style>");

        sb.append("</head>");
        sb.append("<body>");

        sb.append("<p>");
        sb.append("�X�P�W���[���o�^&nbsp;&nbsp;");
        sb.append("[<a href=\"/schedule/MonthView");
        sb.append("?YEAR=");
        sb.append(year);
        sb.append("&MONTH=");
        sb.append(month);
        sb.append("\">�J�����_�[�֖߂�</a>]");
        sb.append("</p>");

        String[] scheduleArray = new String[49];
        int[] widthArray = new int[49];

        for (int i = 0 ; i < 49 ; i++){
            scheduleArray[i] = "";
            widthArray[i] = 0;
        }

        try {
            String sql = "SELECT * FROM schedule WHERE userid = ? and scheduledate = ? ORDER BY starttime";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            String startDateStr = year + "-" + (month + 1) + "-" + day;
            pstmt.setInt(1, 1);
            pstmt.setString(2, startDateStr);

            ResultSet rs = pstmt.executeQuery();

            while(rs.next()){
                String starttime = rs.getString("starttime");
                String endtime = rs.getString("endtime");
                String schedule = rs.getString("schedule");

                if (starttime == null || endtime == null){
                    widthArray[0] = 1;
                    scheduleArray[0] = scheduleArray[0] + schedule + "<br>";
                }else{
                    String startTimeStr = starttime.substring(0, 2);
                    String startMinuteStr = starttime.substring(3, 5);

                    int startTimeNum = Integer.parseInt(startTimeStr);
                    int index = startTimeNum * 2 + 1;
                    if (startMinuteStr.equals("30")){
                        index++;
                    }

                    if (widthArray[index] == 0){
                    /* ���Ƀf�[�^�������Ă����ꍇ�ُ͈�ȏ�ԂȂ̂Ŗ������� */

                        String endTimeStr = endtime.substring(0, 2);
                        String endMinuteStr = endtime.substring(3, 5);

                        int endTimeNum = Integer.parseInt(endTimeStr);
                        int width = (endTimeNum - startTimeNum) * 2;

                        if (startMinuteStr.equals("30")){
                            width--;
                        }

                        if (endMinuteStr.equals("30")){
                            width++;
                        }

                        String totalTime = startTimeStr + ":" + startMinuteStr + "-" + endTimeStr + ":" + endMinuteStr + " ";
                        scheduleArray[index] = totalTime + schedule;
                        widthArray[index] = width;

                        /* �����X�P�W���[���̐擪�ȊO�̉ӏ��ɂ́u-1�v��ݒ� */
                        for (int i = 1 ; i < width ; i++){
                            widthArray[index + i] = -1;
                        }
                    }
                }
            }

            rs.close();
            pstmt.close();

        }catch (SQLException e){
            log("SQLException:" + e.getMessage());
        }

        sb.append("<div id=\"contents\">");

        sb.append("<div id=\"left\">");

        sb.append("<table class=\"sche\">");
        sb.append("<tr><td class=\"top\" style=\"width:80px\">����</td><td class=\"top\" style=\"width:300px\">�\��</td></tr>");

        sb.append("<tr><td class=\"timeb\">����</td>");
        sb.append("<td class=\"contentsb\">");
        if (widthArray[0] == 1){
            sb.append(scheduleArray[0]);
        }
        sb.append("</td></tr>");

        for (int i = 1 ; i < 49 ; i++){
            if (i % 2 == 1){
                sb.append("<tr><td class=\"time\">");
                sb.append(i / 2);
                sb.append(":00</td>");
            }else{
                sb.append("<tr><td class=\"timeb\"></td>");
            }

            if (widthArray[i] != 0){
                if (widthArray[i] != -1){
                    sb.append("<td class=\"ex\" rowspan=\"");
                    sb.append(widthArray[i]);
                    sb.append("\">");

                    sb.append(scheduleArray[i]);
                }
            }else{
                if (i % 2 == 1){
                    sb.append("<td class=\"contents\">");
                }else{
                    sb.append("<td class=\"contentsb\">");
                }
            }

            sb.append("</td></tr>");
        }

        sb.append("</table>");

        sb.append("</div>");

        sb.append("<div id=\"right\">");

        sb.append("<form method=\"post\" action=\"/schedule/ScheduleInsert\">");
        sb.append("<table>");
        sb.append("<tr>");

        sb.append("<td nowrap>���t</td>");
        sb.append("<td>");
        sb.append("<select name=\"YEAR\">");
        for (int i = 2005 ; i <= 2010 ; i++){
            sb.append("<option value=\"");
            sb.append(i);
            sb.append("\"");
            if (i == year){
                sb.append(" selected");
            }
            sb.append(">");
            sb.append(i);
            sb.append("�N");
        }
        sb.append("</select> ");

        sb.append("<select name=\"MONTH\">");
        for (int i = 1 ; i <= 12 ; i++){
            sb.append("<option value=\"");
            sb.append(i);
            sb.append("\"");
            if (i == (month + 1)){
                sb.append(" selected");
            }
            sb.append(">");
            sb.append(i);
            sb.append("��");
        }
        sb.append("</select> ");

        sb.append("<select name=\"DAY\">");
        int monthLastDay = getMonthLastDay(year, month, day);
        for (int i = 1 ; i <= monthLastDay ; i++){
            sb.append("<option value=\"");
            sb.append(i);
            sb.append("\"");
            if (i == day){
                sb.append(" selected");
            }
            sb.append(">");
            sb.append(i);
            sb.append("��");
        }
        sb.append("</select>");

        sb.append("</td>");
        sb.append("</tr>");

        sb.append("<tr>");
        sb.append("<td nowrap>����</td>");
        sb.append("<td>");
        sb.append("<select name=\"SHOUR\">");
        sb.append("<option value=\"\" selected>--��");
        for (int i = 0 ; i <= 23 ; i++){
            sb.append("<option value=\"");
            sb.append(i);
            sb.append("\">");
            sb.append(i);
            sb.append("��");
        }
        sb.append("</select> ");

        sb.append("<select name=\"SMINUTE\">");
        sb.append("<option value=\"0\">00��");
        sb.append("<option value=\"30\">30��");
        sb.append("</select>");

        sb.append(" -- ");

        sb.append("<select name=\"EHOUR\">");
        sb.append("<option value=\"\" selected>--��");
        for (int i = 0 ; i <= 23 ; i++){
            sb.append("<option value=\"");
            sb.append(i);
            sb.append("\">");
            sb.append(i);
            sb.append("��");
        }
        sb.append("</select> ");

        sb.append("<select name=\"EMINUTE\">");
        sb.append("<option value=\"0\">00��");
        sb.append("<option value=\"30\">30��");
        sb.append("</select>");

        sb.append("</td>");
        sb.append("</tr>");

        sb.append("<tr>");
        sb.append("<td nowrap>�\��</td>");
        sb.append("<td><input type=\"text\" name=\"PLAN\" value=\"\" size=\"30\" maxlength=\"100\">");
        sb.append("</td>");
        sb.append("</tr>");

        sb.append("<tr>");
        sb.append("<td valign=\"top\" nowrap>����</td>");
        sb.append("<td><textarea name=\"MEMO\" cols=\"30\" rows=\"10\" wrap=\"virtual\"></textarea></td>");
        sb.append("</tr>");
        sb.append("</table>");

        sb.append("<p>");
        sb.append("<input type=\"submit\" name=\"Register\" value=\"�o�^����\"> <input type=\"reset\" value=\"���͂�����\">");
        sb.append("<p>");
        sb.append("</form>");

        sb.append("</div>");
        sb.append("</div>");

        sb.append("</body>");
        sb.append("</html>");

        out.println(new String(sb));
    }

    protected int getMonthLastDay(int year, int month, int day){

        Calendar calendar = Calendar.getInstance();

        /* �����������܂ł����m�F���� */
        calendar.set(year, month + 1, 0);
        int thisMonthlastDay = calendar.get(Calendar.DATE);

        return thisMonthlastDay;
    }

}