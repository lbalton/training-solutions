package week5.week05d02ChangeLetterTest;

import org.junit.jupiter.api.Test;
import week5.week05d02ChangeLetter.ChangeLetter;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ChangeLetterTest {



    @Test

    public void testCreate() {

        ChangeLetter changeLetter =  new ChangeLetter();

        assertEquals("*******", new ChangeLetter().changeVowels("AOUEYAA"));
        assertEquals("S*MM*F*L*K*PP*NS*M", new ChangeLetter().changeVowels("SEMMIFELEKEPPENSEM"));

        }
}
