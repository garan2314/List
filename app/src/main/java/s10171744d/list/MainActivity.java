package s10171744d.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    String[] poly = {
            "Republic Polytechnic",
            "Nanyang Polytechnic",
            "Ngee Ann Polytechnic",
            "Temasek Polytehcnic",
            "Singapore Polytechnic"
    };
    ListView classlistview;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        classlistview = (ListView)findViewById(R.id.classlistview);
        text=(TextView)findViewById(R.id.count);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_checked,poly);
        classlistview.setAdapter(adapter);

        classlistview.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
            {
                Log.d("asf",position+"");
                text.setText(classlistview.getCheckedItemCount()+"");
            }
        });
        classlistview.setItemChecked(1,true);
    }
}
