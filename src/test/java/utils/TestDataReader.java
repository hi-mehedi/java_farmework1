package utils;

import models.*;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TestDataReader {
    public final String TEST_DATA_PATH = JsonUtils.RESOURCES_PATH + "testdata/";
    private final String DATA_TABLE_FILE_PATH = TEST_DATA_PATH + "dataTableData.json";
    private final String FILE_DATA_PATH = TEST_DATA_PATH + "fileData.json";

    // TODO: add a method for deserialization of userData.json file from resources to a class-model

    public DataTableData getDataTableData() {
        return JsonUtils.deserializeJson(DATA_TABLE_FILE_PATH, DataTableData.class);
    }

    public FileData getFileData() {
        return JsonUtils.deserializeJson(FILE_DATA_PATH, FileData.class);
    }
}
