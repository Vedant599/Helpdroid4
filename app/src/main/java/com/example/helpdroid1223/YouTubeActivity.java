package com.example.helpdroid1223;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.Vector;

public class YouTubeActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Vector<YouTubeVideo> youTubeVideos=new Vector<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_you_tube);

        recyclerView=findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        youTubeVideos.add(new YouTubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/d0ZcvDRUobE\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/XH6TiJzEoW4\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Nrqm6ZzKuBw\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/qhU8BOhrzic\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/w4jHpHoYZhk\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/lAB1TM02moQ\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youTubeVideos.add(new YouTubeVideo("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/WiIGMWRKfQI\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));

        VideoAdapter videoAdapter=new VideoAdapter(youTubeVideos,YouTubeActivity.this);
        Toast.makeText(this,"hello",Toast.LENGTH_SHORT).show();
        recyclerView.setAdapter(videoAdapter);
    }
}
