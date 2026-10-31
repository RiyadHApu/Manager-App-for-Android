package com.deskbook.manager;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
    private WebView web;

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        web = new WebView(this);
        setContentView(web);
        WebSettings s = web.getSettings();
        s.setJavaScriptEnabled(true);
        s.setDomStorageEnabled(true);
        s.setAllowFileAccess(true);
        web.setWebViewClient(new WebViewClient());
        if (b != null) web.restoreState(b); else web.loadUrl("file:///android_asset/index.html");
    }

    @Override
    protected void onSaveInstanceState(Bundle out) { super.onSaveInstanceState(out); web.saveState(out); }

    @Override
    public void onBackPressed() {
        // Close an open form first; leave the app only when nothing is open.
        web.evaluateJavascript("(function(){var m=document.getElementById('modal');if(m&&!m.hidden){var c=m.querySelector('[data-x=close],[data-v=close]');if(c){c.click();return 1}}return 0})()",
            v -> { if (!"1".equals(v)) finish(); });
    }
}
