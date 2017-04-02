package com.awayday.rep.pattern.impl;

import com.awayday.rep.PatternFactory;
import com.awayday.rep.pattern.Pattern;
import com.awayday.rep.type.PreparedMetaCharacter;

import java.util.List;

/**
 * Created by AwayDay on 2017-04-02.
 */
public class PatternArray implements Pattern {

    private List<Pattern> patternList;

    public PatternArray(List<Pattern> patternList) {
        this.patternList = patternList;
    }

    @Override
    public Pattern appendPattern(Pattern pattern) {
        patternList.add(pattern);
        return this;
    }

    @Override
    public Pattern appendPattern(String patternString) {
        patternList.add(PatternFactory.getNewPattern(patternString));
        return this;
    }

    @Override
    public Pattern appendPattern(PreparedMetaCharacter preparedPattern) {
        patternList.add(preparedPattern.toPattern());
        return this;
    }

    @Override
    public String toString() {
        return patternList.stream().map(Pattern::toString).reduce("", (s1, s2) -> s1 + s2);
    }

    private boolean isEmptyString(String s) {
        return (s == null || "".equals(s));
    }
}
