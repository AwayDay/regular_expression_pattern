package com.awayday.rep.pattern.impl;

import com.awayday.rep.PatternFactory;
import com.awayday.rep.pattern.Pattern;
import com.awayday.rep.type.PreparedMetaCharacter;

/**
 * Created by AwayDay on 2017-04-02.
 */
public class PatternString implements Pattern {

    private StringBuilder patternBuilder;

    public PatternString(String patternString) {
        patternBuilder = new StringBuilder(patternString);
    }

    @Override
    public Pattern appendPattern(Pattern pattern) {
        return PatternFactory.getNewPattern().appendPattern(this).appendPattern(pattern);
    }

    @Override
    public Pattern appendPattern(String patternString) {
        patternBuilder.append(patternString);
        return this;
    }

    @Override
    public Pattern appendPattern(PreparedMetaCharacter preparedPattern) {
        patternBuilder.append(preparedPattern.toString());
        return this;
    }

    @Override
    public String toString() {
        return patternBuilder.toString();
    }

}
