package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View.OnClickListener;

public class Test04_01 extends Activity implements OnClickListener{
    private final int WRAP_CONTENT = ViewGroup.LayoutParams.WRAP_CONTENT;
    private int count1;
    private int count2;
    private Button button1;
    private Button button2;

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        count1 = 0;
        count2 = 0;

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        setContentView(linearLayout);

        button1 = new Button(this);
        button1.setText("Count");
        button1.setOnClickListener(this);
        linearLayout.addView(button1, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        button2 = new Button(this);
        button2.setText("Count");
        button2.setOnClickListener(this);
        linearLayout.addView(button2, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));
    }

    public void onClick(View v) {
        if (v == button1){
            count1++;
            button1.setText("Count:" + count1);
        }else if (v == button2){
            count2++;
            button2.setText("Count:" + count2);
        }
    }
}
