package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.widget.Button;

public class Test02_01 extends Activity {
    private final int WRAP_CONTENT = ViewGroup.LayoutParams.WRAP_CONTENT;

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);

        Button button1 = new Button(this);
        button1.setText("Yes");
        linearLayout.addView(button1, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        Button button2 = new Button(this);
        button2.setText("No");
        linearLayout.addView(button2, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));
    }
}
