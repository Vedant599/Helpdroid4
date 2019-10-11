package com.example.helpdroid1223;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VideoAdapter extends RecyclerView.Adapter<VideoAdapter.VideoViewHolder> {

    List<YouTubeVideo> youTubeVideos;
    Context context;
    public VideoAdapter() {
    }

    public VideoAdapter(List<YouTubeVideo> youTubeVideos, Context context) {
        this.youTubeVideos = youTubeVideos;
        this.context = context;
    }

    @NonNull
    @Override
    public VideoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.card_video,parent,false);
        return new VideoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull VideoViewHolder holder, int position) {
        holder.webView.loadData(youTubeVideos.get(position).getVideoURL(),"text/html","utf-8");
    }

    @Override
    public int getItemCount() {
        return youTubeVideos.size();
    }

    public class VideoViewHolder extends RecyclerView.ViewHolder {

        WebView webView;
        public VideoViewHolder(@NonNull View itemView) {
            super(itemView);
            webView=(WebView)itemView.findViewById(R.id.webView);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebChromeClient(new WebChromeClient(){



            });
        }
    }


}
