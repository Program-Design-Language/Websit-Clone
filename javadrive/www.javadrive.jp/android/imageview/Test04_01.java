package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.content.Resources;
import java.io.IOException;

public class Test04_01 extends Activity
{
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT; 
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT; 

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout.setBackground(R.drawable.flower);
        setContentView(linearLayout);

        ImageView image1 = new ImageView(this);
        image1.setImageResource(R.drawable.star1);
        image1.setAlpha(50);
        linearLayout.addView(image1, createParam(WC, WC));

        ImageView image2 = new ImageView(this);
        image2.setImageResource(R.drawable.star1);
        image2.setAlpha(160);
        linearLayout.addView(image2, createParam(WC, WC));

        ImageView image3 = new ImageView(this);
        image3.setImageResource(R.drawable.star1);
        image3.setAlpha(255);
        linearLayout.addView(image3, createParam(WC, WC));
    }

    private LinearLayout.LayoutParams createParam(int w, int h){
        return new LinearLayout.LayoutParams(w, h);
    }
}
