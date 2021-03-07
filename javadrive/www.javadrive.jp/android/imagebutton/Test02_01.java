package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.ViewGroup;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageButton;
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

        ImageButton imgbutton1 = new ImageButton(this);
        imgbutton1.setImageBitmap(bmp1);
        linearLayout.addView(imgbutton1, createParam(100, 100));

        ImageButton imgbutton2 = new ImageButton(this);
        imgbutton2.setImageBitmap(bmp2);
        linearLayout.addView(imgbutton2, createParam(120, 80));
    }

    private LinearLayout.LayoutParams createParam(int w, int h){
        return new LinearLayout.LayoutParams(w, h);
    }
}
