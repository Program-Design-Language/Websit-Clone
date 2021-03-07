package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class Test03_01 extends Activity
{
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT; 
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT; 

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        setContentView(linearLayout);

        ImageButton imgbutton1 = new ImageButton(this);
        imgbutton1.setImageResource(R.drawable.star1);
        imgbutton1.setPadding(5, 5, 5, 5);
        linearLayout.addView(imgbutton1, createParam(WC, WC));

        ImageButton imgbutton2 = new ImageButton(this);
        imgbutton2.setImageResource(R.drawable.star2);
        linearLayout.addView(imgbutton2, createParam(120, 100));
    }

    private LinearLayout.LayoutParams createParam(int w, int h){
        return new LinearLayout.LayoutParams(w, h);
    }
}
