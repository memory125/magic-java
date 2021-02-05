package com.wing.chat.multithread;

import com.wing.chat.multithread.receiver.UdpReceiver;
import com.wing.chat.multithread.sender.UdpSender;

public class ChatA {
    public static void main(String[] args) {
        new Thread(new UdpSender(5520, "localhost", 6630)).start();
        new Thread(new UdpReceiver(6640, "ChatB")).start();
    }
}
