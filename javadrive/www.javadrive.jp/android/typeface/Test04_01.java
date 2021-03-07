package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.graphics.Typeface;

public class Test04_01 extends Activity
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
        tv1.setTextSize(24.0f);
        tv1.setText("abcdefg");
        tv1.setTypeface(Typeface.SERIF);
        linearLayout.addView(tv1, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        TextView tv2 = new TextView(this);
        tv2.setTextSize(24.0f);
        tv2.setText("abcdefg");
        tv2.setTypeface(Typeface.create(Typeface.SERIF, Typeface.BOLD_ITALIC));
        linearLayout.addView(tv2, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        TextView tv3 = new TextView(this);
        tv3.setTextSize(24.0f);
        tv3.setText("abcdefg");
        tv3.setTypeface(Typeface.SANS_SERIF);
        linearLayout.addView(tv3, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        TextView tv4 = new TextView(this);
        tv4.setTextSize(24.0f);
        tv4.setText("abcdefg");
        tv4.setTypeface(Typeface.create(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC));
        linearLayout.addView(tv4, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        TextView tv5 = new TextView(this);
        tv5.setTextSize(24.0f);
        tv5.setText("abcdefg");
        tv5.setTypeface(Typeface.MONOSPACE);
        linearLayout.addView(tv5, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        TextView tv6 = new TextView(this);
        tv6.setTextSize(24.0f);
        tv6.setText("abcdefg");
        tv6.setTypeface(Typeface.create(Typeface.MONOSPACE, Typeface.BOLD_ITALIC));
        linearLayout.addView(tv6, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));
    }
}
