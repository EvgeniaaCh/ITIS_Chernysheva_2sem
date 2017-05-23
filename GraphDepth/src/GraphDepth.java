public class GraphDepth {
    private Graph graph;
    private ArrayStack vertex0;
    private boolean[] vertex;
    private int firstVertex = 0;

    public GraphDepth(Graph graph) {
        this.graph = graph;
        vertex0 = new ArrayStack(graph.getNumberOfVertex());
        vertex = new boolean[graph.getNumberOfVertex()];
    }

    public void deepSearch() {
        int[][] matrix = graph.getMatrixOfAdjacency();
        vertex[firstVertex] = true;
        vertex0.push(firstVertex);
        int currentVertex;

        while (vertex0.size() > 0) {
            currentVertex = (int) vertex0.pop();
            if (vertexIsUsed(currentVertex)) {
                continue;
            }
            vertex[currentVertex] = true;
            for (int i = currentVertex; i < graph.getNumberOfVertex(); i++) {
                if (matrix[currentVertex][i] == 1 & !vertex[i]) {
                    vertex0.push(i);
                }
            }
        }
    }

    public boolean vertexIsUsed(int currentVertex) {
        if (vertex[currentVertex]) {
            return true;
        }
        return false;
    }

    public void stackPush(int currentVertex, int[][] currentMatrix) {
        for (int i = 0; i < graph.getNumberOfVertex(); i++) {
            if (currentMatrix[currentVertex][i] == 1 && !vertexIsUsed(i)) {
                vertex0.push((int)i);
            }
        }
    }
}
