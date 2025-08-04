package tests;

import constants.MainPageNavigation;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;
import pages.UploadFilePage;
import utils.TestDataReader;

import java.io.File;

public class FileUploadTest extends BaseTest {
    private final String fileName = TestDataReader.getFileData().getUploadFile();
    private final String filePath = TestDataReader.TEST_DATA_PATH + fileName;

    private FileUploadPage fileUploadPage = new FileUploadPage();
    private UploadFilePage uploadFilePage = new UploadFilePage();

    @Test
    public void fileUploadTest() {
      mainPage.clickNavigationLink(MainPageNavigation.FILE_UPLOAD);
      fileUploadPage.ChooseFile(new File(filePath).getAbsolutePath());
      fileUploadPage.UploadFile();
      Assert.assertEquals(uploadFilePage.getFileName(), fileName, "File is not uploaded or missing");
    }
}
