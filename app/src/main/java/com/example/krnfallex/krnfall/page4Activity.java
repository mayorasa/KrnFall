package com.example.krnfallex.krnfall;

import android.support.v7.app.AppCompatActivity;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerFragment;
import com.google.android.youtube.player.YouTubePlayerView;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import android.os.Bundle;
import android.widget.Toast;
import android.content.Intent;

public class page4Activity  extends YouTubeBaseActivity
        implements YouTubePlayer.OnInitializedListener{
public static final String DEVELOPER_KEY = "AIzaSyB9aLqLwp2-N_W18nWDQEPUhrdmOKij8iw";
private static final String VIDEO_ID = "IETZuHVlPqU";
private static final int RECOVERY_DIALOG_REQUEST = 1;
        YouTubePlayerFragment myYouTubePlayerFragment;
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
        myYouTubePlayerFragment = (YouTubePlayerFragment)getFragmentManager()
        .findFragmentById(R.id.youtubeplayerfragment);
        myYouTubePlayerFragment.initialize(DEVELOPER_KEY, this);
        }
@Override
public void onInitializationFailure(YouTubePlayer.Provider provider,
        YouTubeInitializationResult errorReason) {
        if (errorReason.isUserRecoverableError()) {
        errorReason.getErrorDialog(this, RECOVERY_DIALOG_REQUEST).show();
        } else {
        String errorMessage = String.format(
        "There was an error initializing the YouTubePlayer (%1$s)",
        errorReason.toString());
        Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show();
        }
        }
@Override
public void onInitializationSuccess(Provider provider, YouTubePlayer player,
        boolean wasRestored) {
        if (!wasRestored) {
        player.cueVideo(VIDEO_ID);
        }
        }
@Override
protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RECOVERY_DIALOG_REQUEST) {
// Retry initialization if user performed a recovery action
        getYouTubePlayerProvider().initialize(DEVELOPER_KEY, this);
        }
        }
protected YouTubePlayer.Provider getYouTubePlayerProvider() {
        return (YouTubePlayerView)findViewById(R.id.youtubeplayerfragment);
        }
        }