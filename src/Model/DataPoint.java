package Model;

public class DataPoint {
    private String label;
    private double[] data;

    public DataPoint(String label, double[] data) {
        this.label = label;
        this.data = data;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double[] getData() {
        return data;
    }

    public void setData(double[] data) {
        this.data = data;
    }

    public double distanceTo(DataPoint other) {
        double[] otherData = other.getData();
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += Math.pow(data[i] - otherData[i], 2);
        }
        return Math.sqrt(sum);
    }
}
