package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.app.AlertDialog;

public class Test02_01 extends Activity {
    private final int WRAP_CONTENT = ViewGroup.LayoutParams.WRAP_CONTENT;

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);

        final Button button = new Button(this);
        button.setText("Open Dialog");
        button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                AlertDialog.show(Test02_01.this, "Alert Test", "Hello, This is Alert Dialog.", "ok", false);
            }
        });
        linearLayout.addView(button, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));
    }
}
