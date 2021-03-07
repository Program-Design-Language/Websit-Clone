package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.view.View.OnClickListener;
import android.app.AlertDialog;

public class Test05_01 extends Activity implements OnClickListener
{
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT; 
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT; 

    private ImageButton imgbutton1;
    private ImageButton imgbutton2;

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        setContentView(linearLayout);

        imgbutton1 = new ImageButton(this);
        imgbutton1.setImageResource(R.drawable.star1);
        imgbutton1.setPadding(25, 25, 25, 25);
        imgbutton1.setOnClickListener(this);
        linearLayout.addView(imgbutton1, createParam(WC, WC));

        imgbutton2 = new ImageButton(this);
        imgbutton2.setImageResource(R.drawable.star1);
        imgbutton2.setPadding(25, 25, 25, 25);
        imgbutton2.setOnClickListener(this);
        linearLayout.addView(imgbutton2, createParam(WC, WC));
    }

    private LinearLayout.LayoutParams createParam(int w, int h){
        return new LinearLayout.LayoutParams(w, h);
    }

    public void onClick(View v) {
        if (v == imgbutton1){
            AlertDialog.show(this, "Image", "Star1", "ok", false);
        }else if (v == imgbutton2){
            AlertDialog.show(this, "Image", "Star2", "ok", false);
        }
    }
}
