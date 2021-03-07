package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.ViewGroup;
import android.graphics.Color;
import android.view.View.OnClickListener;

public class Test07_01 extends Activity implements OnClickListener
{
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT; 
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT; 

    private Button buttonText;
    private Button buttonButton;
    private FrameLayout frameLayout;

    @Override public void onCreate(Bundle icicle)
    {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);


        LinearLayout btnLinearLayout = new LinearLayout(this);
        btnLinearLayout.setOrientation(LinearLayout.HORIZONTAL);

        buttonText = new Button(this);
        buttonText.setText("Text");
        buttonText.setOnClickListener(this);

        buttonButton = new Button(this);
        buttonButton.setText("Button");
        buttonButton.setOnClickListener(this);

        btnLinearLayout.addView(buttonText, createParam(WC, WC));
        btnLinearLayout.addView(buttonButton, createParam(WC, WC));

        frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(Color.GRAY);

        linearLayout.addView(btnLinearLayout, createParam(FP, WC));
        linearLayout.addView(frameLayout, createParam(200, 100));
    }

    private LinearLayout.LayoutParams createParam(int w, int h){
        return new LinearLayout.LayoutParams(w, h);
    }

    private ViewGroup.LayoutParams createViewGroupParam(int w, int h){
        return new ViewGroup.LayoutParams(w, h);
    }

    public void onClick(View v) {
        if (v == buttonText){
            TextView text = new TextView(this);
            text.setText("TextView");
            text.setTextColor(Color.RED);
            frameLayout.addView(text, createViewGroupParam(WC, WC));
        }else if (v == buttonButton){
            Button button = new Button(this);
            button.setText("Button");
            frameLayout.addView(button, createViewGroupParam(WC, WC));
        }
    }
}
