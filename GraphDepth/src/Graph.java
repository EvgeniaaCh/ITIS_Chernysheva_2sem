public class Graph {
    private int[][] matrixOfAdjacency;
    private int numberOfVertex;

    public Graph(int[][] matrixOfAdjacency) {
        this.matrixOfAdjacency = matrixOfAdjacency;
        numberOfVertex = matrixOfAdjacency.length;
    }

    public int getNumberOfVertex() {
        return numberOfVertex;
    }
    public int[][] getMatrixOfAdjacency() {
        return matrixOfAdjacency;
    }
}
