/***********************************
File Name: TestTV.java
Author: island
Email: 1159401236@qq.com 
Created Time: 2016年08月25日 星期四 16时28分59秒
***********************************/
public class TestTV {
    public static void main(String[] args) {
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(39);
        tv1.setVolume(3);

        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.volumeUp();

        System.out.println("tv1's channel is " + tv1.channel +
            " and volume is " + tv1.volumeLevel);
        System.out.println("tv2's channel is " + tv2.channel + 
            " and volume is " + tv2.volumeLevel);
    }
}