package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.widget.TextView;
import android.content.Resources;

public class Test02_01 extends Activity {
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT; 
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT; 

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);

        Resources res = getResources();
        int olive_color = res.getColor(R.color.olive);
        int chocolate_color = res.getColor(R.color.chocolate);

        TextView text1 = new TextView(this);
        text1.setText("Olive Color");
        text1.setBackgroundColor(olive_color);
        linearLayout.addView(text1, createParam(WC, WC));

        TextView text2 = new TextView(this);
        text2.setText("Chocolate Color");
        text2.setBackgroundColor(chocolate_color);
        linearLayout.addView(text2, createParam(WC, WC));
    }

    private LinearLayout.LayoutParams createParam(int w, int h){
        return new LinearLayout.LayoutParams(w, h);
    }
}
