package lab3.hardCodeChallenge1;

import java.util.ArrayList;
import java.util.List;

public class Garland implements Decorations {
    private DecorableTree christmasTree;
    private List<List<String>> tree;

    public Garland(DecorableTree christmasTree){
        this.christmasTree = christmasTree;
        this.tree = getTree();
    }
    @Override
    public List<List<String>> getTree(){
        this.tree = new ArrayList<>();
        tree = deepCopy(christmasTree.getTree());
        //Collections.copy(tree,christmasTree.getTree());
        tree = putDecorations(tree);
        //christmasTree.display();
        return tree;
    }

    public List<List<String>> putDecorations(List<List<String>> tree){
        for(int j=0; j<tree.get(9).size();j++){
            if(tree.get(9).get(j).equals(" "))
                if(j>=tree.get(9).size()/2-9 && j<tree.get(9).size()/2+9) tree.get(9).set(j,"G");
            if(tree.get(9).get(j).equals("<")) tree.get(9).set(j,"<");
            if(tree.get(9).get(j).equals(">")) tree.get(9).set(j,">");
        }
        return tree;
    }

    public void display(){
        //christmasTree.display();
        for(int i=0; i<tree.size(); i++){
            for(int j=0; j<tree.get(i).size(); j++){
                System.out.print(tree.get(i).get(j));
            }
            System.out.println();
        }
    }

    private List<List<String>> deepCopy(List<List<String>> list) {
        List<List<String>> copy = new ArrayList<List<String>>(list.size());
        List<String> row;
        for(int i=0; i<list.size(); i++) {
            row = new ArrayList<>();
            for (int j = 0; j < list.get(i).size(); j++) {
                row.add(list.get(i).get(j));
            }
            copy.add(row);
        }
        return copy;
    }


}
