package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.view.ViewGroup;

public class Test02_01 extends Activity {
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT; 
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT; 

    @Override public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        RelativeLayout relativeLayout = new RelativeLayout(this);
        setContentView(relativeLayout);

        Button button1 = new Button(this);
        button1.setText("Button1");
        relativeLayout.addView(button1, createParam(140, 80));

        Button button2 = new Button(this);
        button2.setText("Button2");
        relativeLayout.addView(button2, createParam(WC, WC));
    }

    private RelativeLayout.LayoutParams createParam(int w, int h){
        return new RelativeLayout.LayoutParams(w, h);
    }
}
