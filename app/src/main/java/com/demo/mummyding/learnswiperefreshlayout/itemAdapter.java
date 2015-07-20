package com.demo.mummyding.learnswiperefreshlayout;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by mummyding on 15-7-20.
 */
public class itemAdapter extends ArrayAdapter<viewItem> {


    public itemAdapter(Context context, int resource, List<viewItem> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        ViewHolder viewHolder;
        viewItem item = getItem(position);
        if(convertView == null){
           view = LayoutInflater.from(getContext()).inflate(R.layout.view_layout, null);
            viewHolder = new ViewHolder();
            viewHolder.name = (TextView) view.findViewById(R.id.tv_Name);
            viewHolder.name.setText(item.getItemName());
            view.setTag(viewHolder);
        }else{
            view = convertView;
            viewHolder = (ViewHolder) convertView.getTag();
            viewHolder.name.setText(item.getItemName());
        }

        return view;
    }

    /**
     * 为了减少getView方法中 findViewById 调用次数 而添加的一个辅助类.
     */
    class ViewHolder{
        TextView name;
    }
}
