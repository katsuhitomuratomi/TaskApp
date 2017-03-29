import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

/**
 * Created by katsu on 2017/03/28.
 */

public class TaskAdapter extends BaseAdapter {
    private List<String> mTaskList;

    public void setTaskList(List<String> taskList) {
        mTaskList = taskList;
    }

    @Override//アイテムの数を返す
    public int getCount() {

        return mTaskList.size();
    }


    @Override//アイテムを返す
    public Object getItem(int position) {
        return mTaskList.get(position);
    }

    @Override//IDを返す
    public long getItemId(int position) {

        return 0;
    }

    @Override//Viewを返す
    public View getView(int position, View convertView, ViewGroup parent) {

        return null;
    }
}
