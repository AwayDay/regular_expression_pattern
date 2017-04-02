package com.awayday.rep;

import com.awayday.rep.pattern.Pattern;
import com.awayday.rep.pattern.impl.PatternArray;
import com.awayday.rep.pattern.impl.PatternString;

/**
 * Created by AwayDay on 2017-04-02.
 */
public class PatternFactory {
    public static Pattern getNewPattern() {
        return new PatternArray();
    }

    public static Pattern getNewPattern(String pattern) {
        return new PatternString(pattern);
    }
}
