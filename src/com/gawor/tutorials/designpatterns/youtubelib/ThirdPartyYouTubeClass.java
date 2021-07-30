package com.gawor.tutorials.designpatterns.youtubelib;

import java.util.HashMap;

//---// S E R V I C E
// This is the class provided by 3rd party. (e.g. YouTube)
public class ThirdPartyYouTubeClass implements IThirdPartyYouTubeLib {

    private HashMap<Integer, Video> videos;

    public ThirdPartyYouTubeClass() {
        videos = new HashMap<Integer, Video>();
        videos.put(1, new Video(1, "Cats", "Cats\nAll you should know about cats\nAuthor: CatWoman"));
        videos.put(2, new Video(1, "Funny Dogs", "Funny Dogs\nCompilation of funny dogs\nAuthor: MikeSpencer2137"));
        videos.put(3, new Video(1, "Most epic fails 2010", "Most epic fails 2010\nXDDD hahah\nAuthor: EpicFailsVideos"));
        videos.put(4, new Video(1, "Best Vines", "Best Vines\nCompilation of best vines. See how best they are\nAuthor: user420yeah"));
        videos.put(5, new Video(1, "Top 10 betrayals in anime", "Top 10 betrayals in anime \nNo comment\nAuthor: MangaLover"));
        videos.put(6, new Video(1, "Jake Paul vs Logan Paul - final fight", "Jake Paul vs Logan Paul - final fight\n Buy our clothes!\n Author: Mike Majlak"));
    }

    public void listVideos() {
        connectToServer("http://www.youtube.com");

        for (int key: videos.keySet()) {
            System.out.println(key + ": " + videos.get(key).title);
            experienceNetworkLatency(3,4);
        }

    }

    public Video downloadVideo(int id) {
        connectToServer("http://www.youtube.com/" + id);
        System.out.print("Downloading video... ");
        experienceNetworkLatency(25, 35);
        System.out.println("Done!");
        return videos.get(id);
    }

    public String getVideoInfo(int id) {
        connectToServer("http://www.youtube.com/" + id + "/info");
        experienceNetworkLatency(2,5);
        return videos.get(id).info;
    }


    // -----------------------------------------------------------------------
    // Fake methods to simulate API calls.
    private void connectToServer(String server) {
        System.out.print("Connecting to " + server + "... ");
        experienceNetworkLatency(8,12);
        System.out.print("Connected!" + "\n");
    }
    // -----------------------------------------------------------------------
    // Fake methods to simulate network activity. They as slow as a real life.
    private void experienceNetworkLatency(int x, int y) {
        int randomLatency = random(x, y);
        for (int i = 0; i < randomLatency; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    private int random(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }

}
