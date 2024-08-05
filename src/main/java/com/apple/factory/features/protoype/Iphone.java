package com.apple.factory.features.protoype;

import com.apple.factory.features.browser.Browser;
import com.apple.factory.features.caller.Caller;
import com.apple.factory.features.player.Player;

public class Iphone implements Browser, Caller, Player {

    @Override
    public void currentPage() {
        System.out.println("www.apple.com");
    }

    @Override
    public void newTab() {
        System.out.println("Search or type URL.");
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing...");
    }

    @Override
    public void callNumber() {
        System.out.println("Calling...");
    }

    @Override
    public void answerCall() {
        System.out.println("00:01");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Starting voice mail service.");
    }

    @Override
    public void playMusic(String msc) {
        msc = "Crushed Velver from Molly Lewis";
        System.out.println("Now Playing " + msc);
    }

    @Override
    public void pauseMusic() {
        System.out.println("Paused.");
    }

    @Override
    public void addQueue(String msc) {
        msc = "Silhouette from Molly Lewis";
        System.out.println(msc + " added to the queue");
    }
    
}
