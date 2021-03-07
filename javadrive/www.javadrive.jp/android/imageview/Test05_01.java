package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.graphics.Color;
import android.widget.Button;
import android.view.View.OnClickListener;

public class Test05_01 extends Activity implements OnClickListener
{
    private final int FP = ViewGroup.LayoutParams.FILL_PARENT; 
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT; 

    private Button buttonCenter;
    private Button buttonCenterCrop;
    private Button buttonFitCenter;
    private Button buttonFitEnd;
    private Button buttonFitStart;
    private Button buttonFitXY;
    private Button buttonMatrix;

    private ImageView image;

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setBackgroundColor(Color.BLACK);
        setContentView(linearLayout);


        LinearLayout btnLinearLayout1 = new LinearLayout(this);
        btnLinearLayout1.setOrientation(LinearLayout.HORIZONTAL);

        buttonCenter = new Button(this);
        buttonCenter.setText("Center");
        buttonCenter.setOnClickListener(this);

        buttonCenterCrop = new Button(this);
        buttonCenterCrop.setText("CenterCrop");
        buttonCenterCrop.setOnClickListener(this);

        buttonFitCenter = new Button(this);
        buttonFitCenter.setText("FitCenter");
        buttonFitCenter.setOnClickListener(this);

        LinearLayout btnLinearLayout2 = new LinearLayout(this);
        btnLinearLayout2.setOrientation(LinearLayout.HORIZONTAL);

        buttonFitEnd = new Button(this);
        buttonFitEnd.setText("FitEnd");
        buttonFitEnd.setOnClickListener(this);

        buttonFitStart = new Button(this);
        buttonFitStart.setText("FitStart");
        buttonFitStart.setOnClickListener(this);

        buttonFitXY = new Button(this);
        buttonFitXY.setText("FitXY");
        buttonFitXY.setOnClickListener(this);

        buttonMatrix = new Button(this);
        buttonMatrix.setText("Matrix");
        buttonMatrix.setOnClickListener(this);

        btnLinearLayout1.addView(buttonCenter, createParam(WC, WC));
        btnLinearLayout1.addView(buttonCenterCrop, createParam(WC, WC));
        btnLinearLayout1.addView(buttonFitCenter, createParam(WC, WC));
        btnLinearLayout2.addView(buttonFitEnd, createParam(WC, WC));
        btnLinearLayout2.addView(buttonFitStart, createParam(WC, WC));
        btnLinearLayout2.addView(buttonFitXY, createParam(WC, WC));
        btnLinearLayout2.addView(buttonMatrix, createParam(WC, WC));

        linearLayout.addView(btnLinearLayout1, createParam(FP, WC));
        linearLayout.addView(btnLinearLayout2, createParam(FP, WC));


        image = new ImageView(this);
        image.setImageResource(R.drawable.star1);
        linearLayout.addView(image, createParam(200, 100));
    }

    private LinearLayout.LayoutParams createParam(int w, int h){
        return new LinearLayout.LayoutParams(w, h);
    }

    public void onClick(View v) {
        if (v == buttonCenter){
            image.setScaleType(ImageView.ScaleType.CENTER);
        }else if (v == buttonCenterCrop){
            image.setScaleType(ImageView.ScaleType.CENTER_CROP);
        }else if (v == buttonFitCenter){
            image.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }else if (v == buttonFitEnd){
            image.setScaleType(ImageView.ScaleType.FIT_END);
        }else if (v == buttonFitStart){
            image.setScaleType(ImageView.ScaleType.FIT_START);
        }else if (v == buttonFitXY){
            image.setScaleType(ImageView.ScaleType.FIT_XY);
        }else if (v == buttonMatrix){
            image.setScaleType(ImageView.ScaleType.MATRIX);
        }
    }
}
