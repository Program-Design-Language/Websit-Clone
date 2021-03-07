package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.RadioButton;

public class Test02_01 extends Activity {
    private final int WRAP_CONTENT = ViewGroup.LayoutParams.WRAP_CONTENT;

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);

        TextView tv = new TextView(this);
        tv.setText("Which would you like to have?");
        linearLayout.addView(tv, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        RadioButton radio1 = new RadioButton(this);
        radio1.setText("Hamburger");
        linearLayout.addView(radio1, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        RadioButton radio2 = new RadioButton(this);
        radio2.setText("Pizza");
        linearLayout.addView(radio2, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));
    }
}
