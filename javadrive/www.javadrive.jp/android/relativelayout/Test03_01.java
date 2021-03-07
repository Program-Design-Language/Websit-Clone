package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.view.ViewGroup;

public class Test03_01 extends Activity {
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT; 

    @Override public void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        RelativeLayout relativeLayout = new RelativeLayout(this);
        setContentView(relativeLayout);

        Button button1 = new Button(this);
        button1.setId(1);
        button1.setText("Yahoo Japan");
        relativeLayout.addView(button1, createParam(140, 80));

        Button button2 = new Button(this);
        button2.setId(2);
        button2.setText("Microsoft Corp");
        RelativeLayout.LayoutParams param2 = createParam(WC, WC);
        param2.addRule(RelativeLayout.POSITION_TO_RIGHT, 1); 
        relativeLayout.addView(button2, param2);

        Button button3 = new Button(this);
        button3.setText("Google");
        RelativeLayout.LayoutParams param3 = createParam(WC, WC);
        param3.addRule(RelativeLayout.POSITION_BELOW, 2); 
        param3.addRule(RelativeLayout.ALIGN_RIGHT, 2); 
        relativeLayout.addView(button3, param3);
    }

    private RelativeLayout.LayoutParams createParam(int w, int h){
        return new RelativeLayout.LayoutParams(w, h);
    }
}
