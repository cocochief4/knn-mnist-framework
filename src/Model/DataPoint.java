package Model;

import java.util.Arrays;

public class DataPoint {
    private String label;
    private double[] data;
    private double magnitude;

    public DataPoint(String label, double[] data) {
        this.label = label;
        this.data = data;
        double m = 0;
        for (int i = 0; i < data.length; i++) {
            m += Math.pow(data[i], 2);
        }
        
        magnitude = Math.sqrt(m);
 
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double[] getData() {
        return Arrays.copyOf(data, data.length);
    }

    public double getMagnitude() {
        return magnitude;
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
    
    public double cosDistanceTo(DataPoint other) {
        double[] otherData = other.getData();
        double dotProduct = 0;
        for (int i = 0; i < data.length; i++) {
            dotProduct += data[i] * otherData[i];
        }
        return Math.abs(1 - (dotProduct / ((magnitude) * (other.getMagnitude()))));
    }
}
