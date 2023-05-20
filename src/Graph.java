import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {
    private int numVertices;
    private Map<Integer, List<Integer>> graphDict;
    public Graph(int numVertices){
        this.numVertices=numVertices;
        this.graphDict=new HashMap<>();
        for(int i=0;i<numVertices;i++){
            graphDict.put(i,new ArrayList<>());
        }
    }
    public void add_edge(int vertex_1,int vertex_2){
        if(graphDict.containsKey(vertex_1) && graphDict.containsKey(vertex_2)){
            List<Integer>edge1=graphDict.get(vertex_1);
            List<Integer>edge2=graphDict.get(vertex_2);
            edge1.add(vertex_2);
            edge2.add(vertex_1);
            graphDict.put(vertex_1,edge1);
            graphDict.put(vertex_2,edge2);
        }
    }
    public void print(){
        for(Map.Entry<Integer,List<Integer>> entry:graphDict.entrySet() ){
            List<Integer> edges=entry.getValue();
            int vertex=entry.getKey();
            System.out.print(vertex+"[");
            for (int i = 0; i < edges.size(); i++) {
                System.out.print(edges.get(i));
                if (i != edges.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
