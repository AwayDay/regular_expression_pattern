package com.awayday.rep.pattern.impl;

import com.awayday.rep.pattern.Pattern;
import com.awayday.rep.type.PreparedMetaCharacter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AwayDay on 2017-04-02.
 */
public class PatternArray implements Pattern {

    private List<Pattern> patternList;

    private StringBuilder patternBuilder;

    public PatternArray() {
        patternList = new ArrayList<>();
    }

    public PatternArray(String patternString) {
        if (!isEmptyString(patternString)) {
            this.patternBuilder = new StringBuilder();
            this.patternBuilder.append(patternString);
        }
    }

    @Override
    public Pattern addPattern(Pattern pattern) {
        if (isPatternString()) {
            patternBuilder.append(pattern.toString());
        } else {
            patternList.add(pattern);
        }
        return this;
    }

    @Override
    public Pattern addPattern(String patternString) {
        if (isPatternString()) {
            this.patternBuilder.append(patternString);
        } else {
            patternList.add(new PatternArray(patternString));
        }

        return this;
    }

    @Override
    public Pattern addPattern(PreparedMetaCharacter preparedPattern) {
        if (isPatternString()) {
            patternBuilder.append(preparedPattern.toString());
        } else {
            patternList.add(preparedPattern.toPattern());
        }

        return this;
    }

    @Override
    public String toString() {
        if (isPatternString()) {
            return patternBuilder.toString();
        } else {
            return patternList.stream().map(Pattern::toString).reduce("", (s1, s2) -> s1 + s2);
        }
    }

    private boolean isPatternString() {
        return (patternBuilder != null);
    }

    private boolean isEmptyString(String s) {
        return (s == null || "".equals(s));
    }
}
