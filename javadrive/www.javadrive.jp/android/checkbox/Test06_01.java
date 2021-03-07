package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.CheckBox;
import android.widget.Button;
import android.view.View.OnClickListener;

public class Test06_01 extends Activity implements OnClickListener{
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT;
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT;

    private Button buttonAllCheck;
    private Button buttonClear;
    private CheckBox checkbox1;
    private CheckBox checkbox2;
    private CheckBox checkbox3;

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);


        LinearLayout btnLinearLayout = new LinearLayout(this);
        btnLinearLayout.setOrientation(LinearLayout.HORIZONTAL);

        buttonAllCheck = new Button(this);
        buttonAllCheck.setText("All Check");
        buttonAllCheck.setOnClickListener(this);

        buttonClear = new Button(this);
        buttonClear.setText("Clear");
        buttonClear.setOnClickListener(this);

        btnLinearLayout.addView(buttonAllCheck, createParam(WC, WC));
        btnLinearLayout.addView(buttonClear, createParam(WC, WC));

        linearLayout.addView(btnLinearLayout, createParam(FP, WC));


        TextView text = new TextView(this);
        text.setText("What would you like to have?");
        linearLayout.addView(text, createParam(WC, WC));

        checkbox1 = new CheckBox(this);
        checkbox1.setText("Hamburger");
        checkbox1.setChecked(true);
        linearLayout.addView(checkbox1, createParam(WC, WC));

        checkbox2 = new CheckBox(this);
        checkbox2.setText("Coffee");
        linearLayout.addView(checkbox2, createParam(WC, WC));

        checkbox3 = new CheckBox(this);
        checkbox3.setText("Potato");
        checkbox3.setChecked(true);
        linearLayout.addView(checkbox3, createParam(WC, WC));
    }

    private LinearLayout.LayoutParams createParam(int w, int h){
        return new LinearLayout.LayoutParams(w, h);
    }

    public void onClick(View v) {
        if (v == buttonAllCheck){
            checkbox1.setChecked(true);
            checkbox2.setChecked(true);
            checkbox3.setChecked(true);
        }else if (v == buttonClear){
            checkbox1.setChecked(false);
            checkbox2.setChecked(false);
            checkbox3.setChecked(false);
        }
    }
}
