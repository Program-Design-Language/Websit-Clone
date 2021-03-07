package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.util.Log;

public class Test02_01 extends Activity implements OnClickListener
{
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT; 
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT; 
    private final String TAG = "Test02_01"; 

    private EditText editLeft;
    private EditText editRight;
    private TextView textResult;
    private Button buttonCalc;
    private Button buttonClear;

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);


        LinearLayout calcLayout = new LinearLayout(this);
        calcLayout.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout.addView(calcLayout, createParam(WC, WC));

        editLeft = new EditText(this);
        editLeft.setWidth(50);
        calcLayout.addView(editLeft, createParam(WC, WC));

        TextView textPlus = new TextView(this);
        textPlus.setText("+");
        calcLayout.addView(textPlus, createParam(WC, WC));

        editRight = new EditText(this);
        editRight.setWidth(50);
        calcLayout.addView(editRight, createParam(WC, WC));

        TextView textEqual = new TextView(this);
        textEqual.setText("=");
        calcLayout.addView(textEqual, createParam(WC, WC));

        textResult = new TextView(this);
        textResult.setText("");
        calcLayout.addView(textResult, createParam(WC, WC));


        LinearLayout buttonLayout = new LinearLayout(this);
        buttonLayout.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout.addView(buttonLayout, createParam(WC, WC));

        buttonCalc = new Button(this);
        buttonCalc.setText("Calc");
        buttonCalc.setOnClickListener(this);
        buttonLayout.addView(buttonCalc, createParam(WC, WC));

        buttonClear = new Button(this);
        buttonClear.setText("Clear");
        buttonClear.setOnClickListener(this);
        buttonLayout.addView(buttonClear, createParam(WC, WC));
    }

    private LinearLayout.LayoutParams createParam(int w, int h){
        return new LinearLayout.LayoutParams(w, h);
    }

    public void onClick(View v) {
        if (v == buttonCalc){
            try{
                CharSequence cs1 = editLeft.getText();
                int leftVal = Integer.parseInt(cs1.toString());

                CharSequence cs2 = editRight.getText();
                int rightVal = Integer.parseInt(cs2.toString());

                int sum = leftVal + rightVal;

                textResult.setText(Integer.toString(sum));
                Log.d(TAG, "CALC:" + leftVal + "+" + rightVal + "=" + sum);
            }catch(NumberFormatException e){
                Log.e(TAG, e.toString());
            }
        }else if (v == buttonClear){
            editLeft.setText("");
            editRight.setText("");
            textResult.setText("");
        }
    }
}
