package com.apple.factory;

import com.apple.factory.features.prototype.Iphone;

public class Factory {
    private static final String msc = null;

    public static void main(String[] args) {
        Iphone prot1  = new Iphone();

        prot1.playMusic(msc);
        prot1.addQueue(msc);
        prot1.newTab();

    }
}