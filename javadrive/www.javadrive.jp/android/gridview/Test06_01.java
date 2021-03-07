package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ArrayAdapter;
import android.graphics.Color;

public class Test06_01 extends Activity
{
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT;
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT;

    private String[] data = {"Tokyo", "Osaka", "Aichi", "Hokkaido",
                             "Fukuoka", "Chiba", "Kyoto", "Nara"};

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        setContentView(linearLayout);

        GridView grid  = new GridView(this);
        grid.setNumColumns(3);
        grid.setHorizontalSpacing(20);
        grid.setVerticalSpacing(30);
        grid.setBackgroundColor(Color.LTGRAY);
        linearLayout.addView(grid, createParam(250, FP));

        ArrayAdapter<String> arrayAdapter
            = new ArrayAdapter<String>(this, R.layout.rowdata, data);

        grid.setAdapter(arrayAdapter);
    }

    private LinearLayout.LayoutParams createParam(int w, int h){
        return new LinearLayout.LayoutParams(w, h);
    }
}
