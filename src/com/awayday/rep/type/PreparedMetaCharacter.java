package com.awayday.rep.type;

import com.awayday.rep.PatternFactory;
import com.awayday.rep.pattern.Pattern;

/**
 * Created by AwayDay on 2017-04-02.
 */
public enum PreparedMetaCharacter {
    WORD_BOUNDARY("\\b"),
    NON_WORD_BOUNDARY("\\B"),
    DIGIT("\\d"),
    NON_DIGIT("\\D"),
    WHITE_SPACE("\\s"),
    NON_WHITE_SPACE("\\S"),
    TAB("\\t"),
    VERTICAL_TAB("\\T"),
    WORD("\\w"),
    NON_WORD("\\W");

    private String exp;

    PreparedMetaCharacter(String exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return exp;
    }

    public Pattern toPattern() {
        return PatternFactory.getNewPattern(exp);
    }
}
