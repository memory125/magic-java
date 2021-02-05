package com.wing.chat.multithread;

import com.wing.chat.multithread.receiver.UdpReceiver;
import com.wing.chat.multithread.sender.UdpSender;

public class ChatB {
    public static void main(String[] args) {
        new Thread(new UdpSender(7730, "localhost", 6640)).start();
        new Thread(new UdpReceiver(6630, "ChatA")).start();
    }
}
