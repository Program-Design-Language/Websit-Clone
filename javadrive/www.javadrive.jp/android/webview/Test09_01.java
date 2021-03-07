package jp.javadrive.android;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.app.AlertDialog;

public class Test09_01 extends Activity implements OnClickListener{

    private final int FP = ViewGroup.LayoutParams.FILL_PARENT; 
    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT; 

    private Button buttonInfo;
    private WebView webview;

    @Override protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(linearLayout);

        buttonInfo = new Button(this);
        buttonInfo.setText("Info");
        buttonInfo.setOnClickListener(this);

        webview = new WebView(this);
        webview.loadUrl("http://www.google.co.jp/");

        linearLayout.addView(buttonInfo, createParam(WC, WC));
        linearLayout.addView(webview, createParam(WC, WC));
    }

    private LinearLayout.LayoutParams createParam(int w, int h){
        return new LinearLayout.LayoutParams(w, h);
    }

    public void onClick(View v) {
        String url = webview.getUrl();
        AlertDialog.show(this, "URL", url, "ok", false);
    }
}
