package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class Test05_01 extends Activity implements DialogInterface.OnClickListener{

    private final int WRAP_CONTENT = ViewGroup.LayoutParams.WRAP_CONTENT;
    private TextView tv;
    private EditText edit;

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);

        final Button button = new Button(this);
        button.setText("Open Dialog");
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                edit = new EditText(Test05_01.this);
                edit.setWidth(50);

                AlertDialog.show(Test05_01.this, 
                                 "Alert Test", 
                                 edit, 
                                 "OK",
                                 Test05_01.this, 
                                 "Cancel",
                                 Test05_01.this, 
                                 false,
                                 null);
            }
        });
        linearLayout.addView(button, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));

        tv = new TextView(this);
        linearLayout.addView(tv, new LinearLayout.LayoutParams(WRAP_CONTENT, WRAP_CONTENT));
    }

    public void onClick(DialogInterface dialog, int whichButton) {
        if (whichButton == DialogInterface.BUTTON1){
            tv.setText(edit.getText());
        }
    }
}
