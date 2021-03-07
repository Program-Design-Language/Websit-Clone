package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class Test04_01 extends Activity implements 
    DialogInterface.OnClickListener, DialogInterface.OnCancelListener{

    private final int WRAP_CONTENT = ViewGroup.LayoutParams.WRAP_CONTENT;
    private TextView tv;

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);

        final Button button = new Button(this);
        button.setText("Open Dialog");
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                AlertDialog.show(Test04_01.this, 
                                 "Alert Test", 
                                 "Hello, This is Alert Dialog.", 
                                 "yes",
                                 Test04_01.this, 
                                 "no",
                                 Test04_01.this, 
                                 true,
                                 Test04_01.this);
            }
        });
        linearLayout.addView(button, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        tv = new TextView(this);
        linearLayout.addView(tv, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));
    }

    public void onClick(DialogInterface dialog, int whichButton) {
        if (whichButton == DialogInterface.BUTTON1){
            tv.setText("yes");
        }else if (whichButton == DialogInterface.BUTTON2){
            tv.setText("no");
        }
    }

    public void onCancel(DialogInterface dialog) {
        tv.setText("cancel");
    }
}
