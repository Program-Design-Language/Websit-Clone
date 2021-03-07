package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Button;
import android.widget.TextView;
import android.view.ViewGroup;

public class Test04_01 extends Activity
{
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT; 
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT; 

    /** Called with the activity is first created. */
    @Override
    public void onCreate(Bundle icicle)
    {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);

        Button button1 = new Button(this);
        button1.setText("Button1");
        linearLayout.addView(button1, createParam(WC, WC));

        TextView text = new TextView(this);
        text.setText("Text");
        linearLayout.addView(text, createParam(WC, WC));

        Button button2 = new Button(this);
        button2.setText("Button2");
        linearLayout.addView(button2, createParam(WC, WC));
    }

    private LinearLayout.LayoutParams createParam(int w, int h){
        return new LinearLayout.LayoutParams(w, h);
    }
}