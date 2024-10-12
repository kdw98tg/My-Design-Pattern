package src.flyweight;

public class Client {
    public static void main(String[] args) {
        int [][] deciduousLocations = {{1,1},{33,50},{100, 90}};
        int [][] coniferLocations = {{10,87},{24,76},{2, 64}};

        TreeFactory treeFactory = new TreeFactory();

        Tree deciduous = null;
        Tree conifer = null;

        try{
            deciduous = treeFactory.getTree(TreeType.Deciduous);
            conifer = treeFactory.getTree(TreeType.Conifer);

            for(int[] location : deciduousLocations){
                deciduous.display(location[0], location[1]);
            }

            for(int[] location : deciduousLocations){
                conifer.display(location[0], location[1]);
            }
        }
        catch(Exception _ex){
            _ex.printStackTrace();
        }
    }
}
