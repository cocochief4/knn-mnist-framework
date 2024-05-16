import Model.DataLoader;
import Model.DataPoint;
import Model.KNNClassifier;

import java.util.List;

public class Tester {
    public static void main(String[] args) {
        KNNClassifier classifier;
        String prediction = "";

        classifier = new KNNClassifier(2);
        List<DataPoint> training = DataLoader.loadMNistData("data/mnist_train.csv");
        List<DataPoint> test = DataLoader.loadMNistData("data/mnist_test.csv");
        classifier.trainOnData(training);

        classifier.testOnData(test);
    }
}