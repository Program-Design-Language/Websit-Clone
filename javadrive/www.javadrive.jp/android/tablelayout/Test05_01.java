package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.view.ViewGroup;

public class Test05_01 extends Activity {
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT; 
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT; 

    @Override public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        TableLayout tableLayout = new TableLayout(this);
        tableLayout.setColumnStretchable(1, true);
        setContentView(tableLayout);


        TextView text1 = new TextView(this);
        text1.setText("user");

        EditText edit1 = new EditText(this);

        TableRow tableRow1 = new TableRow(this);
        tableRow1.addView(text1);
        tableRow1.addView(edit1);


        TextView text2 = new TextView(this);
        text2.setText("pass");

        EditText edit2 = new EditText(this);

        TableRow tableRow2 = new TableRow(this);
        tableRow2.addView(text2);
        tableRow2.addView(edit2);


        TextView text3 = new TextView(this);
        text3.setText("mail address");

        EditText edit3 = new EditText(this);

        TableRow tableRow3 = new TableRow(this);
        tableRow3.addView(text3);
        tableRow3.addView(edit3);


        tableLayout.addView(tableRow1, createParam(FP, WC));
        tableLayout.addView(tableRow2, createParam(FP, WC));
        tableLayout.addView(tableRow3, createParam(FP, WC));
    }

    private TableLayout.LayoutParams createParam(int w, int h){
        return new TableLayout.LayoutParams(w, h);
    }
}
