package week5.week05d02ChangeLetterTest;

import week5.week05d02ChangeLetter.ChangeLetter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ChangeLetterTest {

    @Test



    public void testCreate() {

        ChangeLetter changeLetter =  new ChangeLetter();

        assertEquals("******", new ChangeLetter().changeVowels("AOUEYA"));
        assertEquals("S*MM*F*L*K*PP*NS*M", new ChangeLetter().changeVowels("SEMMIFELEKEPPENSEM"));

        }
}
