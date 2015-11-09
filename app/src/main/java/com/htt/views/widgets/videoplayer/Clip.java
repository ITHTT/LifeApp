package com.htt.views.widgets.videoplayer;

public class Clip
{
  private long duration;
  private String url;

  public Clip(long paramLong, String paramString)
  {
    this.duration = paramLong;
    this.url = paramString;
  }

  public long getDuration()
  {
    return this.duration;
  }

  public String getUrl()
  {
    return this.url;
  }

  public void setDuration(long paramLong)
  {
    this.duration = paramLong;
  }

  public void setUrl(String paramString)
  {
    this.url = paramString;
  }
}

