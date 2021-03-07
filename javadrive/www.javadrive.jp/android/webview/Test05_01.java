package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.view.View.OnClickListener;

public class Test05_01 extends Activity implements OnClickListener{

    private final int FP = ViewGroup.LayoutParams.FILL_PARENT; 
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT; 

    private Button buttonZoomin;
    private Button buttonZoomout;
    private Button buttonReset;
    private WebView webview;

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);


        LinearLayout btnLinearLayout = new LinearLayout(this);
        btnLinearLayout.setOrientation(LinearLayout.HORIZONTAL);

        buttonZoomin = new Button(this);
        buttonZoomin.setText("Zoomin");
        buttonZoomin.setOnClickListener(this);

        buttonZoomout = new Button(this);
        buttonZoomout.setText("Zoomout");
        buttonZoomout.setOnClickListener(this);

        buttonReset = new Button(this);
        buttonReset.setText("Reset");
        buttonReset.setOnClickListener(this);

        btnLinearLayout.addView(buttonZoomin, createParam(WC, WC));
        btnLinearLayout.addView(buttonZoomout, createParam(WC, WC));
        btnLinearLayout.addView(buttonReset, createParam(WC, WC));


        webview = new WebView(this);
        webview.loadUrl("http://www.google.co.jp/");

        linearLayout.addView(btnLinearLayout, createParam(FP, WC));
        linearLayout.addView(webview, createParam(WC, WC));
    }

    private LinearLayout.LayoutParams createParam(int w, int h){
        return new LinearLayout.LayoutParams(w, h);
    }

    public void onClick(View v) {
        if (v == buttonZoomin){
            webview.zoomIn();
        }else if (v == buttonZoomout){
            webview.zoomOut();
        }else if (v == buttonReset){
            webview.resetZoom();
        }
    }
}
