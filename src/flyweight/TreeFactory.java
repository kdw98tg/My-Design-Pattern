package src.flyweight;

public class TreeFactory {

    private Tree deciduousTree = null;
    private Tree coniferTree = null;

    public TreeFactory() {
        this.deciduousTree = new DeciduousTree();
        this.coniferTree = new ConiferTree();
    }

    public Tree getTree(TreeType _type) throws Exception {
        switch (_type) {
            case Deciduous:
                return this.deciduousTree;
            case Conifer:
                return this.coniferTree;
            default:
                throw new Exception("Invalid kind of tree");
        }

    }
}
