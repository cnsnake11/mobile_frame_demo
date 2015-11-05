package cn.mobile_frame_demo;


import android.content.Intent;
import android.os.Bundle;
import atom.mobile.frame.activity.OpenWebViewActivity;
import atom.mobile.frame.util.WebViewUtil;


public class LogonActivity extends OpenWebViewActivity {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logon);

        String url="file:///android_asset/demo2/demo2-1.html";

         this.wv= WebViewUtil.initWebView(this,R.id.webview);
        this.wv.loadUrl(url);


    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(Intent.ACTION_MAIN);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        i.addCategory(Intent.CATEGORY_HOME);
        startActivity(i);//返回桌面而不退出程序
    }

}