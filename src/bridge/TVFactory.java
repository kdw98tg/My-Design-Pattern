package src.bridge;

import src.bridge.tv.LG;
import src.bridge.tv.Sony;
import src.bridge.tv.TV;
import src.bridge.tv.TVType;

public class TVFactory {
    public TV getTV(TVType _type) throws Exception {
        switch (_type) {
            case LG:
                return new LG();
            case Sony:
                return new Sony();
            default:
                throw new Exception("Invalid TV Type");
        }

    }
}
