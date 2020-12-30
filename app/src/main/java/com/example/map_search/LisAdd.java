package com.example.map_search;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class LisAdd extends Activity {
    ArrayList<String> items;
    ArrayAdapter<String> adapter;
    ListView listView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ad_res_w_r);

        items = new ArrayList<String>();
        items.add("      1                            비건식당1           ");
        items.add("      2                            비건식당2           ");
        items.add("      3                            비건식당3           ");
        items.add("      4                            비건식당4           ");
        items.add("      5                            비건식당5           ");
        items.add("      6                            비건식당6           ");
        items.add("      7                            비건식당7           ");
        items.add("      8                            비건식당8           ");
        items.add("      9                            비건식당9           ");
        items.add("      10                           비건식당10           ");
        items.add("      11                           비건식당11           ");



        // listView의 항목을 선택하려면 체크박스나 라디오 버튼이 있어야 하므로 아래의 레이아웃을 선택했다.
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice, items);
        listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setChoiceMode(ListView.CHOICE_MODE_SINGLE);


        listView.setOnItemClickListener(mItemClickListener);
        findViewById(R.id.button2).setOnClickListener(mClickListener);
    }

    // 상단 버튼에서 사용하는 listener
    Button.OnClickListener mClickListener = new View.OnClickListener() {
        public void onClick(View v) {
            switch(v.getId()) {
                case R.id.button2:
                    int id = listView.getCheckedItemPosition();
                    if(id != ListView.INVALID_POSITION) {
                        items.remove(id);
                        listView.clearChoices();
                        adapter.notifyDataSetChanged();
                    }
                    break;
            }
        }
    };

    // ListView에서 사용하는 listener
    AdapterView.OnItemClickListener mItemClickListener = new AdapterView.OnItemClickListener() {
        public void onItemClick(AdapterView parent, View view, int position, long id) {
            String mes = "Select item = " + items.get(position);
            Toast.makeText(LisAdd.this, mes, Toast.LENGTH_SHORT).show();
        }
    };
}
