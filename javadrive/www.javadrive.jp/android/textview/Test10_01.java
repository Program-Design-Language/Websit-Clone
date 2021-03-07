package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.widget.TextView;
import android.graphics.Color;
import android.text.Layout.Alignment;

public class Test10_01 extends Activity
{
    private final int WRAP_CONTENT = ViewGroup.LayoutParams.WRAP_CONTENT; 

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);

        TextView tv1 = new TextView(this);
        tv1.setText("Android");
        tv1.setWidth(150);
        tv1.setBackgroundColor(Color.LTGRAY);
        tv1.setAlignment(Alignment.ALIGN_NORMAL);
        linearLayout.addView(tv1, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        TextView tv2 = new TextView(this);
        tv2.setText("Android");
        tv2.setWidth(150);
        tv2.setBackgroundColor(Color.GREEN);
        tv2.setAlignment(Alignment.ALIGN_CENTER);
        linearLayout.addView(tv2, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        TextView tv3 = new TextView(this);
        tv3.setText("Android");
        tv3.setWidth(150);
        tv3.setBackgroundColor(Color.LTGRAY);
        tv3.setAlignment(Alignment.ALIGN_OPPOSITE);
        linearLayout.addView(tv3, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));
    }
}
