package structural.facade;

import java.io.File;

import structural.facade.some_complex_media_library.facade.VideoConversionFacade;

public class Demo {
    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        System.out.println(mp4Video);
    }
}
