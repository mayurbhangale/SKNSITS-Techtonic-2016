package com.mayurbhangale.sknsitstechtonic;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.util.ArrayList;

public class EventsCards extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private static String LOG_TAG = "CardViewActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new EventsAdapter(getDataSet());
        mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        ((EventsAdapter) mAdapter).setOnItemClickListener(new EventsAdapter
                .MyClickListener() {
            @Override
            public void onItemClick(int position, View v) {
                Log.i(LOG_TAG, " Clicked on Item " + position);
                setContentView(R.layout.form_activity);
                WebView webView = (WebView) findViewById(R.id.webview);
                WebSettings webSettings = webView.getSettings();
                webSettings.setJavaScriptEnabled(true);
                webView.setWebViewClient(new WebViewClient() {
                    @Override
                    public boolean shouldOverrideUrlLoading(WebView view, String url) {
                        view.loadUrl(url);
                        return false;
                    }
                });

                if (position == 0) {
                    webView.loadUrl("http://goo.gl/forms/ALWq5olUdG"); //geoSK@N
                }
                else if (position == 1){
                    webView.loadUrl("http://goo.gl/forms/4avxQWKLSM"); //BusinessClub
                }
                else if (position == 2){
                    webView.loadUrl("http://goo.gl/forms/6FTTq87Uj4"); //NFS
                }
                else if(position == 3){
                    webView.loadUrl("http://goo.gl/forms/Jl5mKebhK0"); // C Venture
                }
                else if(position == 4){
                    webView.loadUrl("http://goo.gl/forms/aAg2Om4uSZ"); //geo dimensions..
                }
                else if(position == 5){
                    webView.loadUrl("http://goo.gl/forms/WeY8zMmuoX");//robosoccer
                }
                else if(position == 6){
                    webView.loadUrl("http://goo.gl/forms/S1K6KbhNQl");//2wheeler
                }
                else if(position == 7){
                    webView.loadUrl("http://goo.gl/forms/L036eLeBVH");//glowcric
                }
                else if(position == 8){
                    webView.loadUrl("http://goo.gl/forms/lVfpbIfIKC");//clashofquads
                }
                else if(position == 9){
                    webView.loadUrl("http://goo.gl/forms/VcFtYTKwlf");//ewaste
                }
                else if(position == 10){
                        webView.loadUrl("http://goo.gl/forms/tFwszNShCJ");//cs
                }
                else if(position == 11){
                        webView.loadUrl("http://goo.gl/forms/AXOSkxpHsV");//rudiff
                }
                else if(position == 12){
                    webView.loadUrl("http://goo.gl/forms/7fFwUn6v1F");//techquiz
                }
                else if(position == 13){
                    webView.loadUrl("http://goo.gl/forms/xegIZJHVWV");//codemeifucan
                }
                else if(position == 14){
                    webView.loadUrl("http://goo.gl/forms/HRyCUiUM6h");//innopowergen
                }
                else if(position == 15){
                    webView.loadUrl("http://goo.gl/forms/azD9ko2aYJ");//roadwaystopublic
                }
                else if(position == 16){
                    webView.loadUrl("http://goo.gl/forms/fDqdr2OlHy");//isomech
                }
                else if(position == 17){
                    webView.loadUrl("http://goo.gl/forms/GxbkC9x4Ld");//livecs
                }

            }
        });
    }

    private ArrayList<DataObject> getDataSet() {
        String comp = new String("Department of Computer Engineering");
        String mech = new String("Department of Mechanical Engineering");
        String elec = new String("Department of Electrical Engineering");
        String it = new String("Department of Information Technology");
        String entc = new String("Department of Electronics & Telecommunication Engineering");

        ArrayList results = new ArrayList<DataObject>();
        for (int index = 0; index < 1; index++) {


            DataObject obj17 = new DataObject("LiveCS",""+mech);
            results.add(index, obj17);
            DataObject obj16 = new DataObject("Isomecher",""+mech);
            results.add(index, obj16);

            DataObject obj7 = new DataObject("Roadways to Public Sector Units",""+elec);
            results.add(index, obj7);
            DataObject obj8 = new DataObject("Innovative Power Generation",""+elec);
            results.add(index, obj8);

            DataObject obj9 = new DataObject("Code Me If You Can", ""+it);
            results.add(index, obj9);
            DataObject obj10 = new DataObject("Technical Quiz",""+it);
            results.add(index, obj10);
            DataObject obj11 = new DataObject("Are you Different",""+it);
            results.add(index, obj11);
            DataObject obj12 = new DataObject("Counter Strike",""+it);
            results.add(index, obj12);

            DataObject obj13 = new DataObject("Best out of e-waste",""+entc);
            results.add(index, obj13);
            DataObject obj14 = new DataObject("Clash of Quads",""+entc);
            results.add(index, obj14);
            DataObject obj15 = new DataObject("Glow Cricket",""+entc);
            results.add(index, obj15);


            DataObject obj4 = new DataObject("Two Wheeler Maintenance",""+mech);
            results.add(index, obj4);
            DataObject obj5 = new DataObject("Robosoccer",""+mech);
            results.add(index, obj5);
            DataObject obj6 = new DataObject("Geometrical Dimensions & Tolerance",""+mech);
            results.add(index, obj6);

            DataObject obj = new DataObject("C Venture", ""+comp);
            results.add(index, obj);
            DataObject obj1 = new DataObject("NFS",""+comp);
            results.add(index, obj1);
            DataObject obj2 = new DataObject("Business Club Poster Presentation",""+comp);
            results.add(index, obj2);
            DataObject obj3 = new DataObject("geoSK@N",""+comp);
            results.add(index, obj3);

        }
        return results;
    }
}