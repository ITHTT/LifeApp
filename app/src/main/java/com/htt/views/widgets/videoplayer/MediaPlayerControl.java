package com.htt.views.widgets.videoplayer;

/**
 * 控制视频播放的代码
 * Created by Administrator on 2015/10/21.
 */
public interface MediaPlayerControl {
    void start();

    void pause();

    int getDuration();

    int getCurrentPosition();

    void seekTo(long pos);

    boolean isPlaying();

    int getBufferPercentage();

    boolean canPause();

    boolean canSeekBackward();

    boolean canSeekForward();
}
