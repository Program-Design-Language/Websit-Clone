package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.graphics.Typeface;

public class Test03_01 extends Activity
{
    private final int WRAP_CONTENT = ViewGroup.LayoutParams.WRAP_CONTENT; 

    /** Called with the activity is first created. */
    @Override
    public void onCreate(Bundle icicle)
    {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);

        TextView tv1 = new TextView(this);
        tv1.setTextSize(32.0f);
        tv1.setText("abcdefg");
        linearLayout.addView(tv1, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        TextView tv2 = new TextView(this);
        tv2.setTextSize(32.0f);
        tv2.setText("abcdefg");
        tv2.setTypeface(Typeface.SERIF);
        linearLayout.addView(tv2, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        TextView tv3 = new TextView(this);
        tv3.setTextSize(32.0f);
        tv3.setText("abcdefg");
        tv3.setTypeface(Typeface.SANS_SERIF);
        linearLayout.addView(tv3, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        TextView tv4 = new TextView(this);
        tv4.setTextSize(32.0f);
        tv4.setText("abcdefg");
        tv4.setTypeface(Typeface.MONOSPACE);
        linearLayout.addView(tv4, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));
    }
}
