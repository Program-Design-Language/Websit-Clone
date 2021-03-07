package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.widget.TextView;

public class Test05_01 extends Activity
{
    private final int WRAP_CONTENT = ViewGroup.LayoutParams.WRAP_CONTENT; 

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);

        TextView tv1 = new TextView(this);
        tv1.setText("ABCDefg 12.0f");
        tv1.setTextSize(12.0f);
        linearLayout.addView(tv1, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        TextView tv2 = new TextView(this);
        tv2.setText("ABCDefg 18.0f");
        tv2.setTextSize(18.0f);
        linearLayout.addView(tv2, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        TextView tv3 = new TextView(this);
        tv3.setText("ABCDefg 32.0f");
        tv3.setTextSize(32.0f);
        linearLayout.addView(tv3, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));
    }
}