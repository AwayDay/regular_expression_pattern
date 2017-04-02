package com.awayday.rep;

import com.awayday.rep.pattern.Pattern;
import com.awayday.rep.pattern.impl.PatternArray;
import com.awayday.rep.pattern.impl.PatternString;

import java.util.ArrayList;

/**
 * Created by AwayDay on 2017-04-02.
 */
public class PatternFactory {
    public static Pattern getNewPattern() {
        return new PatternArray(new ArrayList<>());
    }

    public static Pattern getNewPattern(String pattern) {
        return new PatternString(pattern);
    }
}
