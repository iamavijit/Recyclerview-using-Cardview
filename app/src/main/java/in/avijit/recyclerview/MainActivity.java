package in.avijit.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager layoutManager;
    ArrayList<Upload> myFile = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myFile.add(new Upload(R.drawable.node,"Created By Avijit"));
        myFile.add(new Upload(R.drawable.oner,"Created By Sailen"));
        myFile.add(new Upload(R.drawable.twor,"Created By Smriti"));
        myFile.add(new Upload(R.drawable.threer,"Created By Amit"));
        myFile.add(new Upload(R.drawable.fourr,"Created By Avi"));
        myFile.add(new Upload(R.drawable.fiver,"Created By Joker"));
        myFile.add(new Upload(R.drawable.sixr,"Created By Master"));

        recyclerView = findViewById(R.id.recycle);
        mAdapter = new MyAdapter(myFile);
        layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(mAdapter);
        recyclerView.setLayoutManager(layoutManager);


    }
}
