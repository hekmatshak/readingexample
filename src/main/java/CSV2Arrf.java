import weka.core.Instances;
import weka.core.converters.ArffSaver;
import weka.core.converters.CSVLoader;

import java.io.File;

public class CSV2Arrf {


    public static void main(String[] args) throws Exception{

        //load CSV
        CSVLoader loader = new CSVLoader();
        loader.setSource(new File("/home/issa/Desktop/ReadFromFileTest.csv"));
        Instances data = loader.getDataSet();


        //save ARFF
        ArffSaver saver = new ArffSaver();
        saver.setInstances(data);

        saver.setFile(new File("/home/issa/Desktop/ReadFromFileTest.arff"));
        saver.writeBatch();

    }
}
