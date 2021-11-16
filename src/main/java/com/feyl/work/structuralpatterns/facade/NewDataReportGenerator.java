package com.feyl.work.structuralpatterns.facade;

/**
 * @author Feyl
 * @date 2021/10/26 17:04
 */
public class NewDataReportGenerator extends AbstractDataReportGenerator{
    private NewDataReader reader;
    private DataDecryptor decryptor;
    private DataGraphicalEditor graphicalEditor;

    public NewDataReportGenerator() {
        reader = new NewDataReader();
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
