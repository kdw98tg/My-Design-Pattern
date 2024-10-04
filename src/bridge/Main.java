package src.bridge;

import src.bridge.remote.GenericRemote;
import src.bridge.remote.SpecialRemote;
import src.bridge.tv.TVType;

public class Main {
    public static void main(String[] args) {
        TVFactory tvFactory = new TVFactory();
        SpecialRemote remoteSony = new SpecialRemote(tvFactory);
        System.out.println("TV 랑 리모컨이랑 연결하세요");

        remoteSony.setTV(TVType.Sony);
        remoteSony.on();
        remoteSony.up();
        remoteSony.down();
        remoteSony.off();

        System.out.println("\n\n");

        GenericRemote remoteLG = new GenericRemote(tvFactory);
        System.out.println("TV랑 리모컨이랑 연결하세요");
        remoteLG.setTV(TVType.LG);
        remoteLG.on();
        remoteLG.nextChannel();
        remoteLG.prevChannel();
        remoteLG.off();
    }
}
