package com.iyang.design.modle.structure.adapter;

/**
 * @author Yang
 * @date 2020/8/6 / 23:42
 */
public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {

        System.out.println("Playing vlc file.name in VlcPlayer . the fileName is " + fileName);
    }

    @Override
    public void playMp4(String fileName) {



    }

}
