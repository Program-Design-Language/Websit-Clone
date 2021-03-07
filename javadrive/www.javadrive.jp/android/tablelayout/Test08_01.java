package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.view.ViewGroup;
import android.graphics.Color;
import android.text.Layout.Alignment;

public class Test08_01 extends Activity {
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT; 
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT; 

    @Override public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        TableLayout tableLayout = new TableLayout(this);
        tableLayout.setColumnStretchable(2, true);
        setContentView(tableLayout);


        TextView text11 = new TextView(this);
        text11.setText("Java");
        text11.setBackgroundColor(Color.MAGENTA);
        text11.setAlignment(Alignment.ALIGN_CENTER);

        TextView text12 = new TextView(this);
        text12.setText("PHP");
        text12.setBackgroundColor(Color.GREEN);
        text12.setAlignment(Alignment.ALIGN_CENTER);

        TextView text13 = new TextView(this);
        text13.setText("Ruby");
        text13.setBackgroundColor(Color.BLUE);
        text13.setAlignment(Alignment.ALIGN_CENTER);

        TableRow tableRow1 = new TableRow(this);
        tableRow1.addView(text11);
        tableRow1.addView(text12);
        tableRow1.addView(text13);


        TextView text21 = new TextView(this);
        text21.setText("MySQL");
        text21.setBackgroundColor(Color.MAGENTA);
        text21.setAlignment(Alignment.ALIGN_CENTER);

        TextView text22 = new TextView(this);
        text22.setText("PostgreSQL");
        text22.setBackgroundColor(Color.GREEN);
        text22.setAlignment(Alignment.ALIGN_CENTER);

        TableRow.LayoutParams rowLayout2 = new TableRow.LayoutParams();
        rowLayout2.span = 2;

        TableRow tableRow2 = new TableRow(this);
        tableRow2.addView(text21);
        tableRow2.addView(text22, rowLayout2);


        TextView text31 = new TextView(this);
        text31.setText("Access");
        text31.setBackgroundColor(Color.MAGENTA);
        text31.setAlignment(Alignment.ALIGN_CENTER);

        TableRow.LayoutParams rowLayout3 = new TableRow.LayoutParams();
        rowLayout3.span = 2;

        TextView text32 = new TextView(this);
        text32.setText("Excel");
        text32.setBackgroundColor(Color.GREEN);
        text32.setAlignment(Alignment.ALIGN_CENTER);

        TableRow tableRow3 = new TableRow(this);
        tableRow3.addView(text31, rowLayout3);
        tableRow3.addView(text32);


        tableLayout.addView(tableRow1, createParam(FP, WC));
        tableLayout.addView(tableRow2, createParam(FP, WC));
        tableLayout.addView(tableRow3, createParam(FP, WC));
    }

    private TableLayout.LayoutParams createParam(int w, int h){
        return new TableLayout.LayoutParams(w, h);
    }
}
