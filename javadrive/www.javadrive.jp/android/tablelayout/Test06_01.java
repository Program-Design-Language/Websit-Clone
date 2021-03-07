package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.view.ViewGroup;
import android.graphics.Color;

public class Test06_01 extends Activity {
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT; 
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT; 

    @Override public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        TableLayout tableLayout = new TableLayout(this);
        tableLayout.setColumnShrinkable(1, true);
        setContentView(tableLayout);


        TextView text11 = new TextView(this);
        text11.setText("Nakayama");

        TextView text12 = new TextView(this);
        text12.setText("Tarou");
        text12.setBackgroundColor(Color.LTGRAY);

        TextView text13 = new TextView(this);
        text13.setText("Sotokanda Chiyoda-ku Tokyo");

        TableRow tableRow1 = new TableRow(this);
        tableRow1.addView(text11);
        tableRow1.addView(text12);
        tableRow1.addView(text13);


        TextView text21 = new TextView(this);
        text21.setText("Endou");

        TextView text22 = new TextView(this);
        text22.setText("Kenichirou");
        text22.setBackgroundColor(Color.LTGRAY);

        TextView text23 = new TextView(this);
        text23.setText("daiba Minato-ku Tokyo");

        TableRow tableRow2 = new TableRow(this);
        tableRow2.addView(text21);
        tableRow2.addView(text22);
        tableRow2.addView(text23);


        tableLayout.addView(tableRow1, createParam(FP, WC));
        tableLayout.addView(tableRow2, createParam(FP, WC));
    }

    private TableLayout.LayoutParams createParam(int w, int h){
        return new TableLayout.LayoutParams(w, h);
    }
}
