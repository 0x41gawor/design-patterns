package com.gawor.tutorials.designpatterns;

/*
Comments in this case:
//---// T H I S   C A S E
refer to image in `doc.md/Structure`
 */

/*
    In this example we will present "Cashing Proxy" (see `doc.md/Applicability`).

    We will introduce lazy initialization and caching to a 3rd-party YouTube integration library.

    <h2> But, what is caching? </h2>

    The library provides us with the video downloading class. However, it’s very inefficient.
    If the client application requests the same video multiple times, the library just downloads it over and over,
    instead of caching and reusing the first downloaded file.

    The proxy class implements the same interface as the original downloader and delegates it all the work.
    However, it keeps track of the downloaded files and returns the cached result when the app requests the same video multiple times.
 */


import com.gawor.tutorials.designpatterns.youtubelib.IThirdPartyYouTubeLib;
import com.gawor.tutorials.designpatterns.youtubelib.ThirdPartyYouTubeClass;
import com.gawor.tutorials.designpatterns.youtubelib.YouTubeCacheProxy;

//---// C L I E N T   C O D E
public class Main {

    public static void main(String[] args) {

        IThirdPartyYouTubeLib youTubeLib = new YouTubeCacheProxy(new ThirdPartyYouTubeClass());
        System.out.println("--------    List all videos     ---------");
        youTubeLib.listVideos();
        System.out.println("\n--------   Download video 2     ---------");
        System.out.println(youTubeLib.downloadVideo(2));
        System.out.println("\n--------   Download video 5     ---------");
        System.out.println(youTubeLib.downloadVideo(5));
        System.out.println("\n-------- Download video 2 again ---------");
        System.out.println(youTubeLib.downloadVideo(2));
    }
}
