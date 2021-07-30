package com.gawor.tutorials.designpatterns.youtubelib;

//---// S E R V I C E   I N T E R F A C E
public interface IThirdPartyYouTubeLib {

    //---// O P E R A T I O N  ( )
    public void listVideos();
    public Video downloadVideo(int id);
    public String getVideoInfo(int id);
    //---// O P E R A T I O N  ( )
}
