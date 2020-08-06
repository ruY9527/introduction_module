package com.iyang.design.modle.structure.adapter;

import com.sun.media.jfxmedia.events.MediaErrorListener;

/**
 * @author Yang
 * @date 2020/8/6 / 23:44
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {

        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc("GavinYang's VLC");
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4("GavinYang's mp4");
        }

    }
}
