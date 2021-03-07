package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.CheckBox;
import android.graphics.Color;

public class Test03_01 extends Activity {
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT;
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT;

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);

        TextView text = new TextView(this);
        text.setText("What would you like to have?");
        linearLayout.addView(text, createParam(WC, WC));

        CheckBox checkbox1 = new CheckBox(this);
        checkbox1.setText("Hamburger");
        checkbox1.setTextColor(Color.RED);
        linearLayout.addView(checkbox1, createParam(WC, WC));

        CheckBox checkbox2 = new CheckBox(this);
        checkbox2.setText("Coffee");
        checkbox2.setTextColor(Color.GREEN);
        linearLayout.addView(checkbox2, createParam(WC, WC));
    }

    private LinearLayout.LayoutParams createParam(int w, int h){
        return new LinearLayout.LayoutParams(w, h);
    }
}
