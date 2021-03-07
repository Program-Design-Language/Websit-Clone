package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView.BufferType;

public class Test11_01 extends Activity {
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT;
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT;

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);

        EditText edit1 = new EditText(this);
        edit1.setWidth(200);
        edit1.setText("Yamada", BufferType.NORMAL);
        linearLayout.addView(edit1, createParam(WC, WC));

        EditText edit2 = new EditText(this);
        edit2.setWidth(200);
        edit2.setText("Katou", BufferType.NORMAL);
        edit2.setPadding(10, 10, 10, 10);
        linearLayout.addView(edit2, createParam(WC, WC));
    }

    private LinearLayout.LayoutParams createParam(int w, int h){
        return new LinearLayout.LayoutParams(w, h);
    }
}
