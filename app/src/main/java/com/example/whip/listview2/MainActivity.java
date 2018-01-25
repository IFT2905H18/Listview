package com.example.whip.listview2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    MyAdapter adapter;
    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.listview1);
        adapter = new MyAdapter();
        list.setAdapter(adapter);
    }

    public class MyAdapter extends BaseAdapter {

        LayoutInflater inflater;

        public MyAdapter(){
            inflater = (LayoutInflater) getSystemService(LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public int getCount() {
            return 30;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            if (view==null){
                view = inflater.inflate(R.layout.rangee,viewGroup,false);
            }

            TextView tv = (TextView) view.findViewById(R.id.textview1);
            //TextView tv2 = (TextView) view.findViewById(android.R.id.text2);

            tv.setText("Item " + ((Integer)i).toString());
            //tv2.setText(((Integer)i).toString());
            return view;
        }
    }
}
