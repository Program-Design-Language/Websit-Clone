package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.Button;
import android.widget.TextView;
import android.view.ViewGroup;
import android.graphics.Color;

public class Test05_01 extends Activity
{
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT; 
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT; 

    @Override public void onCreate(Bundle icicle)
    {
        super.onCreate(icicle);

        FrameLayout frameLayout = new FrameLayout(this);
        setContentView(frameLayout);

        Button button1 = new Button(this);
        button1.setText("Long Long Button");
        frameLayout.addView(button1, createParam(WC, WC));

        TextView text = new TextView(this);
        text.setText("Long Long TextView");
        text.setTextColor(Color.RED);
        frameLayout.addView(text, createParam(WC, WC));

        Button button2 = new Button(this);
        button2.setText("Short Button");
        frameLayout.addView(button2, createParam(WC, WC));

        frameLayout.removeViewAt(1);
    }

    private ViewGroup.LayoutParams createParam(int w, int h){
        return new ViewGroup.LayoutParams(w, h);
    }
}
