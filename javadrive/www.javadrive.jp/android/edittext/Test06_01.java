package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.widget.TextView.BufferType;

public class Test06_01 extends Activity {
    private final int WRAP_CONTENT = ViewGroup.LayoutParams.WRAP_CONTENT;

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);

        TextView tv = new TextView(this);
        tv.setText("What's your name?");
        linearLayout.addView(tv, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        final EditText edit = new EditText(this);
        edit.setWidth(200);
        edit.setText("Takahashi", BufferType.NORMAL);
        linearLayout.addView(edit, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        Button button1 = new Button(this);
        button1.setText("move 4 index position");
        button1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                edit.setSelection(4);
            }
        });
        linearLayout.addView(button1, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        Button button2 = new Button(this);
        button2.setText("move last position");
        button2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                CharSequence str = edit.getText();
                edit.setSelection(str.length());
            }
        });
        linearLayout.addView(button2, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));
    }
}
