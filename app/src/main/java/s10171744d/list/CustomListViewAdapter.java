package s10171744d.list;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Lewis on 9/5/2017.
 */

public class CustomListViewAdapter extends BaseAdapter{


    List<Song> songList;

    CustomListViewAdapter(List<Song> songList){
        this.songList = songList;
    }

    @Override
    public int getCount() {
        return songList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView;
        rowView = LayoutInflater.from(parent.getContext()).inflate(R.layout.song,parent,false);
        TextView title = (TextView)rowView.findViewById(R.id.songTitle);
        TextView artist = (TextView)rowView.findViewById(R.id.songArtist);
        TextView duration = (TextView)rowView.findViewById(R.id.songDuration);
        Song song = songList.get(position);
        title.setText(song.getTitle());
        artist.setText(song.getArtist());
        duration.setText(song.getLength());
        return rowView;
    }
}
