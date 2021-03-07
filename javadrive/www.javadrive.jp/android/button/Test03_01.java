package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View.OnClickListener;

public class Test03_01 extends Activity {
    private final int WRAP_CONTENT = ViewGroup.LayoutParams.WRAP_CONTENT;
    private int count1;
    private int count2;

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        count1 = 0;
        count2 = 0;

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);

        final Button button1 = new Button(this);
        button1.setText("Count");
        button1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                count1++;
                button1.setText("Count:" + count1);
            }
        });
        linearLayout.addView(button1, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        final Button button2 = new Button(this);
        button2.setText("Count");
        button2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                count2++;
                button2.setText("Count:" + count2);
            }
        });
        linearLayout.addView(button2, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));
    }
}
