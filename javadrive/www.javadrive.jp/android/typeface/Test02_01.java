package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.graphics.Typeface;

public class Test02_01 extends Activity
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
        tv1.setText("DEFAULT");
        tv1.setTypeface(Typeface.DEFAULT );
        linearLayout.addView(tv1, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        TextView tv2 = new TextView(this);
        tv2.setText("DEFAULT_BOLD");
        tv2.setTypeface(Typeface.DEFAULT_BOLD);
        linearLayout.addView(tv2, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        TextView tv3 = new TextView(this);
        tv3.setText("DEFAULT_ITALIC");
        tv3.setTypeface(Typeface.DEFAULT_ITALIC);
        linearLayout.addView(tv3, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        TextView tv4 = new TextView(this);
        tv4.setText("DEFAULT_BOLD_ITALIC ");
        tv4.setTypeface(Typeface.DEFAULT_BOLD_ITALIC );
        linearLayout.addView(tv4, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));
    }
}
