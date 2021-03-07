package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.Button;
import android.widget.TextView;
import android.view.ViewGroup;
import android.graphics.Color;

public class Test03_01 extends Activity
{
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT; 
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT; 

    @Override public void onCreate(Bundle icicle)
    {
        super.onCreate(icicle);

        FrameLayout frameLayout = new FrameLayout(this);
        setContentView(frameLayout);

        Button button = new Button(this);
        button.setText("Button");
        frameLayout.addView(button, createParam(WC, WC));

        TextView text = new TextView(this);
        text.setText("Long Long Text");
        text.setTextColor(Color.RED);
        frameLayout.addView(text, 0, createParam(WC, WC));
    }

    private ViewGroup.LayoutParams createParam(int w, int h){
        return new ViewGroup.LayoutParams(w, h);
    }
}
