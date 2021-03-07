package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.view.View.OnClickListener;

public class Test07_01 extends Activity implements OnClickListener{

    private final int FP = ViewGroup.LayoutParams.FILL_PARENT; 
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT; 

    private Button buttonBack;
    private Button buttonForward;
    private Button buttonClearCache;
    private WebView webview;

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);


        LinearLayout btnLinearLayout = new LinearLayout(this);
        btnLinearLayout.setOrientation(LinearLayout.HORIZONTAL);

        buttonBack = new Button(this);
        buttonBack.setText("Back");
        buttonBack.setOnClickListener(this);

        buttonForward = new Button(this);
        buttonForward.setText("Forward");
        buttonForward.setOnClickListener(this);

        buttonClearCache = new Button(this);
        buttonClearCache.setText("Clear Cache");
        buttonClearCache.setOnClickListener(this);

        btnLinearLayout.addView(buttonBack, createParam(WC, WC));
        btnLinearLayout.addView(buttonForward, createParam(WC, WC));
        btnLinearLayout.addView(buttonClearCache, createParam(WC, WC));


        webview = new WebView(this);
        webview.loadUrl("http://www.google.co.jp/");

        linearLayout.addView(btnLinearLayout, createParam(FP, WC));
        linearLayout.addView(webview, createParam(WC, WC));
    }

    private LinearLayout.LayoutParams createParam(int w, int h){
        return new LinearLayout.LayoutParams(w, h);
    }

    public void onClick(View v) {
        if (v == buttonBack){
            if (webview.canGoBack()){
                webview.goBack();
            }
        }else if (v == buttonForward){
            if (webview.canGoForward()){
                webview.goForward();
            }
        }else if (v == buttonClearCache){
            webview.clearCache();
        }
    }
}
