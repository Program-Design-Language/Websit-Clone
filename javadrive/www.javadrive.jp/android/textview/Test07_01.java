package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.widget.TextView;
import android.graphics.Typeface;

public class Test07_01 extends Activity
{
    private final int WRAP_CONTENT = ViewGroup.LayoutParams.WRAP_CONTENT; 

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);

        TextView tv1 = new TextView(this);
        tv1.setText("Android");
        tv1.setTypeface(Typeface.create(Typeface.SERIF, Typeface.BOLD_ITALIC));
        linearLayout.addView(tv1, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        TextView tv2 = new TextView(this);
        tv2.setText("Android");
        tv2.setTypeface(Typeface.create(Typeface.SANS_SERIF, Typeface.BOLD));
        linearLayout.addView(tv2, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        TextView tv3 = new TextView(this);
        tv3.setText("Android");
        tv3.setTextScaleX(1.5f);
        linearLayout.addView(tv3, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));
    }
}
