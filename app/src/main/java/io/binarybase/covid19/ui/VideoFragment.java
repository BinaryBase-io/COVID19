package io.binarybase.covid19.ui;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import io.binarybase.covid19.R;

public class VideoFragment extends Fragment {

    private VideoView videoView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_video, container, false);

        videoView = root.findViewById(R.id.videoPlayer);
        //Set MediaController  to enable play, pause, forward, etc options.
        MediaController mediaController = new MediaController(getContext());
        mediaController.setAnchorView(videoView);
        //Location of Media File
        Uri uri = Uri.parse("android.resource://" + getContext().getPackageName() + "/" + R.raw.covid);
        //Starting VideView By Setting MediaController and URI
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();


        return root;
    }
}
