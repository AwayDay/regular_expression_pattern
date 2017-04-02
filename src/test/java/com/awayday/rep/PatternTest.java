package com.awayday.rep;

import com.awayday.rep.pattern.Pattern;
import com.awayday.rep.type.PreparedMetaCharacter;
import org.junit.Before;
import org.junit.Test;

import java.util.regex.Matcher;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
 * Created by AwayDay on 2017-04-03.
 */
public class PatternTest {

    private Pattern pattern;

    @Before
    public void setup(){
        pattern = PatternFactory.getNewPattern();
    }

    @Test
    public void test(){
        assertEquals("", pattern.toString());
    }

    @Test
    public void appendPatternStringTest(){
        assertEquals("a", pattern.appendPattern("a").toString());
    }

    @Test
    public void testPatternTest(){
        pattern.appendPattern(PreparedMetaCharacter.DIGIT)
                .appendPattern(PreparedMetaCharacter.WORD)
                .appendPattern("_")
                .appendPattern(PreparedMetaCharacter.DIGIT);
        java.util.regex.Pattern p = java.util.regex.Pattern.compile(pattern.toString());
        Matcher m = p.matcher("1b_1");

        assertTrue(m.matches());
    }
}
