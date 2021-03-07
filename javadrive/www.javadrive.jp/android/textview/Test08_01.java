package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.widget.TextView;
import android.graphics.Color;

public class Test08_01 extends Activity
{
    private final int WRAP_CONTENT = ViewGroup.LayoutParams.WRAP_CONTENT; 
    private final int FILL_PARENT = ViewGroup.LayoutParams.FILL_PARENT; 

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);

        TextView tv1 = new TextView(this);
        tv1.setText("Android");
        tv1.setBackgroundColor(Color.GRAY);
        linearLayout.addView(tv1, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        TextView tv2 = new TextView(this);
        tv2.setText("Android");
        tv2.setWidth(80);
        tv2.setHeight(40);
        tv2.setBackgroundColor(Color.RED);
        linearLayout.addView(tv2, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        TextView tv3 = new TextView(this);
        tv3.setText("Android");
        tv3.setWidth(80);
        tv3.setHeight(40);
        tv3.setBackgroundColor(Color.BLUE);
        linearLayout.addView(tv3, new LinearLayout.LayoutParams(FILL_PARENT, WRAP_CONTENT));

        TextView tv4 = new TextView(this);
        tv4.setText("Android");
        tv4.setWidth(80);
        tv4.setHeight(40);
        tv4.setBackgroundColor(Color.GREEN);
        linearLayout.addView(tv4, new LinearLayout.LayoutParams(120, 60));
    }
}
