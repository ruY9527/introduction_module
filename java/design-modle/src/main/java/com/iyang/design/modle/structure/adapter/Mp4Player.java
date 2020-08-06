package com.iyang.design.modle.structure.adapter;

/**
 * @author Yang
 * @date 2020/8/6 / 23:43
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. name" + fileName);
    }

}
