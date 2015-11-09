package com.htt.views.widgets.videoplayer;

//import io.vov.vitamio.MediaPlayer;

public interface OnVideoPlayEvent {
	public abstract void onEnd();
	public void onOneClipEnd();
	public void onError(int paramInt);

	public void onPause();

	public void onPlay();
	public void onPrepared();
	public void onRatioChanged(int paramInt);
	public void onSeekCompleted();
	public void onBufferingStart();
	public void onBufferingEnd();
//	void onDownloadRateChanged(MediaPlayer arg0, int arg1, int arg2);
}