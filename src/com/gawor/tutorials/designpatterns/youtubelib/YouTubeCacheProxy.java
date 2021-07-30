package com.gawor.tutorials.designpatterns.youtubelib;

import java.util.HashMap;

//---// P R O X Y
public class YouTubeCacheProxy implements IThirdPartyYouTubeLib {

    //---// R E A L   S E R V I C E
    ThirdPartyYouTubeClass realService;

    private HashMap<Integer, Video> cache;

    //---// P R O X Y  ( S :  S E R V I C E )
    public YouTubeCacheProxy(ThirdPartyYouTubeClass realService) {
        this.realService = realService;
        this.cache = new HashMap<Integer, Video>();
    }
    //---// O P E R A T I O N  ( )
    @Override
    public void listVideos() {
        realService.listVideos();
    }
    //---// O P E R A T I O N  ( )
    @Override
    public Video downloadVideo(int id) {
        if (cache.containsKey(id)) {
            System.out.println("Video retrieved from cache!");
            return cache.get(id);
        }
        else {
            Video result = realService.downloadVideo(id);
            cache.put(id, result);
            return result;
        }
    }
    //---// O P E R A T I O N  ( )
    @Override
    public String getVideoInfo(int id) {
        return realService.getVideoInfo(id);
    }

    public void reset() {
        cache.clear();
    }
}
