package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.TextView.BufferType;

public class Test03_01 extends Activity {
    private final int WRAP_CONTENT = ViewGroup.LayoutParams.WRAP_CONTENT;

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);

        TextView tv = new TextView(this);
        tv.setText("What's your name?");
        linearLayout.addView(tv, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        EditText edit1 = new EditText(this);
        edit1.setText("Katou", BufferType.NORMAL);
        linearLayout.addView(edit1, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        EditText edit2 = new EditText(this);
        edit2.setWidth(100);
        edit2.setText("Endou", BufferType.NORMAL);
        linearLayout.addView(edit2, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        EditText edit3 = new EditText(this);
        edit3.setWidth(100);
        edit3.setText("Suzuki, Ichirou", BufferType.NORMAL);
        linearLayout.addView(edit3, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));
    }
}
