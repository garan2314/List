package s10171744d.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.List;

public class SongActivity extends AppCompatActivity {

    List<Song> songList;
    ListView songListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);
        songList 
        songList.add(new Song("Some Ttle", "Some dude", "22222"));
        songList.add(new Song("lul", "sad dude", "3423"));
        songListView = (ListView)findViewById(R.id.songListView);
        CustomListViewAdapter adapter = new CustomListViewAdapter(songList);
        songListView.setAdapter(adapter);
    }

}
