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
import android.app.AlertDialog;
import android.text.SpannableStringBuilder;

public class Test05_01 extends Activity {
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
        linearLayout.addView(edit, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        Button button1 = new Button(this);
        button1.setText("Get Text");
        button1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                AlertDialog.show(Test05_01.this, "Input Name", edit.getText(), "ok", false);
            }
        });
        linearLayout.addView(button1, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        Button button2 = new Button(this);
        button2.setText("Get Text");
        button2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                SpannableStringBuilder sb = (SpannableStringBuilder)edit.getText();
                AlertDialog.show(Test05_01.this, "Input Name", sb.toString(), "ok", false);
            }
        });
        linearLayout.addView(button2, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));
    }
}
