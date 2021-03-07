package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import android.content.Resources;

public class Test02_01 extends Activity
{
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT; 
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT; 

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        setContentView(linearLayout);

        Resources r = getResources();
        Bitmap bmp1 = BitmapFactory.decodeResource(r, R.drawable.star1);
        Bitmap bmp2 = BitmapFactory.decodeResource(r, R.drawable.star2);

        ImageView image1 = new ImageView(this);
        image1.setImageBitmap(bmp1);
        linearLayout.addView(image1, createParam(WC, WC));

        ImageView image2 = new ImageView(this);
        image2.setImageBitmap(bmp2);
        linearLayout.addView(image2, createParam(WC, WC));

        ImageView image3 = new ImageView(this);
        image3.setImageBitmap(bmp1);
        linearLayout.addView(image3, createParam(100, 100));
    }

    private LinearLayout.LayoutParams createParam(int w, int h){
        return new LinearLayout.LayoutParams(w, h);
    }
}
