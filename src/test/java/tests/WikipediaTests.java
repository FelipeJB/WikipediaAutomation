package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.ResultPage;
import utils.baseTest.BaseTest;

import static org.testng.Assert.assertTrue;

public class WikipediaTests extends BaseTest {

    @Test
    @Parameters({ "textToSearch" })
    public void searchTest(String textToSearch){
        HomePage home = loadFirstPage();
        ResultPage results = home.searchText(textToSearch);

        assertTrue(results.isTitleCorrect(textToSearch), "The title does not match");
    }
}
