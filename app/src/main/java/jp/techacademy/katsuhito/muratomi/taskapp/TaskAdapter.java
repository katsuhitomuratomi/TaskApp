package jp.techacademy.katsuhito.muratomi.taskapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;


public class TaskAdapter extends BaseAdapter {
    private LayoutInflater mLayoutInflater;//他のxmlリソースのViewを取り扱うための仕組み
    private List<Task> mTaskArrayList;//アイテムを保持するリスト

    public TaskAdapter(Context context){
        mLayoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void setTaskList(List<Task> taskList) {
        mTaskArrayList=taskList;
    }

    @Override//アイテムの数を返す
    public int getCount() {

        return mTaskArrayList.size();
    }


    @Override//アイテムを返す
    public Object getItem(int position) {

        return mTaskArrayList.get(position);
    }

    @Override//IDを返す
    public long getItemId(int position) {
        return mTaskArrayList.get(position).getId();


    }

    @Override//Viewを返す
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView==null){
            convertView=mLayoutInflater.inflate(android.R.layout.simple_list_item_2,null);
        }
        TextView textView1=(TextView)convertView.findViewById(android.R.id.text1);
        TextView textView2=(TextView)convertView.findViewById(android.R.id.text2);

        textView1.setText("タイトル：  "+mTaskArrayList.get(position).getTitle()+"  カテゴリー：  "+mTaskArrayList.get(position).getCategory());

        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH;mm", Locale.JAPANESE);
        Date date=mTaskArrayList.get(position).getDate();
        textView2.setText(simpleDateFormat.format(date));

        return convertView;
    }
}

