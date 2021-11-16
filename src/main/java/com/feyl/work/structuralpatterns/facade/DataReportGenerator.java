package com.feyl.work.structuralpatterns.facade;

/**
 * @author Feyl
 * @date 2021/10/26 17:01
 */
public class DataReportGenerator extends AbstractDataReportGenerator {
    private DataReader reader;
    private DataDecryptor decryptor;
    private DataGraphicalEditor graphicalEditor;

    public DataReportGenerator() {
        reader = new DataReader();
        decryptor = new DataDecryptor();
        graphicalEditor = new DataGraphicalEditor();
    }

    @Override
    public void generatingDataReport(String data) {
        reader.readData(data);
        decryptor.decryptData(data);
        graphicalEditor.graphicalData(data);
    }
}
