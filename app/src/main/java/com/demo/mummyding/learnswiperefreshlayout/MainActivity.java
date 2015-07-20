package com.demo.mummyding.learnswiperefreshlayout;

import android.app.Activity;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

/**
 * 这里要实现 OnRefreshListener 接口
 */
public class MainActivity extends Activity implements SwipeRefreshLayout.OnRefreshListener{
    private SwipeRefreshLayout swipeContainer;
    ListView listView;
    List<viewItem> list;
    itemAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    /**
     * 下来刷新就会触发执行此方法
     */
    @Override
    public void onRefresh() {
        /**
         * 用Handler().postDelayed 延迟执行
         * 当然,不用延迟也可以,我这里是为了看效果,因为这里刷新哗的一下就没了~
         */
         new Handler().postDelayed(new Runnable() {
             @Override
             public void run() {
                 list.clear();
                 addItems();
                 adapter.notifyDataSetChanged();
                 swipeContainer.setRefreshing(false);
             }
         }, 1000);

        /*
        不用延迟可以直接像下面这样写
         */
        /*
        *  list.clear();
                 addItems();
                 adapter.notifyDataSetChanged();
                 swipeContainer.setRefreshing(false);
                 */
    }

    /**
     * 初始化变量&添加事件监听
     */
    void init(){
        listView = (ListView) findViewById(R.id.list_view);
        swipeContainer = (SwipeRefreshLayout) findViewById(R.id.swipeContainer);
        swipeContainer.setOnRefreshListener(this);
        list = new ArrayList<viewItem>();
        adapter = new itemAdapter(this,R.layout.view_layout,list);
        listView.setAdapter(adapter);
    }

    /**
     * 向ListView添加Item
     */
    void addItems(){
        viewItem addItem = new viewItem("Aaron");
        list.add(addItem);
        addItem = new viewItem("Barton");
        list.add(addItem);
        addItem = new viewItem("Beacher");
        list.add(addItem);
        addItem = new viewItem("Colbert");
        list.add(addItem);
        addItem = new viewItem("Dick");
        list.add(addItem);
        addItem = new viewItem("Gregary");
        list.add(addItem);
        addItem = new viewItem("Francis");
        list.add(addItem);
        addItem = new viewItem("Fitch");
        list.add(addItem);
        addItem = new viewItem("Gordon");
        list.add(addItem);
        addItem = new viewItem("Eugene");
        list.add(addItem);
        addItem = new viewItem("Gregary");
        list.add(addItem);
        addItem = new viewItem("Francis");
        list.add(addItem);
        addItem = new viewItem("Fitch");
        list.add(addItem);
        addItem = new viewItem("Gordon");
        list.add(addItem);
        addItem = new viewItem("Eugene");
        list.add(addItem);
        addItem = new viewItem("Gregary");
        list.add(addItem);
        addItem = new viewItem("Francis");
        list.add(addItem);
        addItem = new viewItem("Fitch");
        list.add(addItem);
        addItem = new viewItem("Gordon");
        list.add(addItem);
        addItem = new viewItem("Eugene");
        list.add(addItem);
        addItem = new viewItem("Gregary");
        list.add(addItem);
        addItem = new viewItem("Francis");
        list.add(addItem);
        addItem = new viewItem("Fitch");
        list.add(addItem);
        addItem = new viewItem("Gordon");
        list.add(addItem);
        addItem = new viewItem("Eugene");
        list.add(addItem);
        addItem = new viewItem("Gregary");
        list.add(addItem);
        addItem = new viewItem("Francis");
        list.add(addItem);
        addItem = new viewItem("Fitch");
        list.add(addItem);
        addItem = new viewItem("Gordon");
        list.add(addItem);
        addItem = new viewItem("Eugene");
        list.add(addItem);
        addItem = new viewItem("Gregary");
        list.add(addItem);
        addItem = new viewItem("Francis");
        list.add(addItem);
        addItem = new viewItem("Fitch");
        list.add(addItem);
        addItem = new viewItem("Gordon");
        list.add(addItem);
        addItem = new viewItem("Eugene");
        list.add(addItem);
        addItem = new viewItem("Gregary");
        list.add(addItem);
        addItem = new viewItem("Francis");
        list.add(addItem);
        addItem = new viewItem("Fitch");
        list.add(addItem);
        addItem = new viewItem("Gordon");
        list.add(addItem);
        addItem = new viewItem("Eugene");
        list.add(addItem);
        addItem = new viewItem("Gregary");
        list.add(addItem);
        addItem = new viewItem("Francis");
        list.add(addItem);
        addItem = new viewItem("Fitch");
        list.add(addItem);
        addItem = new viewItem("Gordon");
        list.add(addItem);
        addItem = new viewItem("Eugene");
        list.add(addItem);
        addItem = new viewItem("Gregary");
        list.add(addItem);
        addItem = new viewItem("Francis");
        list.add(addItem);
        addItem = new viewItem("Fitch");
        list.add(addItem);
        addItem = new viewItem("Gordon");
        list.add(addItem);
        addItem = new viewItem("Eugene");
        list.add(addItem);
        addItem = new viewItem("Gregary");
        list.add(addItem);
        addItem = new viewItem("Francis");
        list.add(addItem);
        addItem = new viewItem("Fitch");
        list.add(addItem);
        addItem = new viewItem("Gordon");
        list.add(addItem);
        addItem = new viewItem("Eugene");
        list.add(addItem);
    }

}
