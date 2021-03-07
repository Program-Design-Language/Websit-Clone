package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.view.View.OnClickListener;

public class Test04_01 extends Activity implements OnClickListener{

    private final int FP = ViewGroup.LayoutParams.FILL_PARENT; 
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT; 

    private Button buttonFirst;
    private Button buttonLast;
    private WebView webview;

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);


        LinearLayout btnLinearLayout = new LinearLayout(this);
        btnLinearLayout.setOrientation(LinearLayout.HORIZONTAL);

        buttonFirst = new Button(this);
        buttonFirst.setText("First");
        buttonFirst.setOnClickListener(this);

        buttonLast = new Button(this);
        buttonLast.setText("Last");
        buttonLast.setOnClickListener(this);

        btnLinearLayout.addView(buttonFirst, createParam(WC, WC));
        btnLinearLayout.addView(buttonLast, createParam(WC, WC));


        webview = new WebView(this);
        webview.loadUrl("http://www.google.co.jp/");

        linearLayout.addView(btnLinearLayout, createParam(FP, WC));
        linearLayout.addView(webview, createParam(WC, WC));
    }

    private LinearLayout.LayoutParams createParam(int w, int h){
        return new LinearLayout.LayoutParams(w, h);
    }

    public void onClick(View v) {
        if (v == buttonFirst){
            int count = -1;
            while(webview.canGoBackOrForward(count)){
                count--;
            }

            webview.goBackOrForward(count + 1);
        }else if (v == buttonLast){
            int count = 1;
            while(webview.canGoBackOrForward(count)){
                count++;
            }

            webview.goBackOrForward(count - 1);
        }
    }
}
