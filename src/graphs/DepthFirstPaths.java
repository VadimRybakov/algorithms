package graphs;

public class DepthFirstPaths extends FirstPath{

    public DepthFirstPaths(Graph g, int source) {
        super(g, source);
        dfs(g, source);
    }

    @Override
    protected void dfs(Graph g, int v) {
        marked[v] = true;
        for (int w : g.getAdjList(v)) {
            if (!marked[w]) {
                edgeTo[w] = v;
                dfs(g, w);
            }
        }
    }
}
