package com.awayday.rep.pattern;

import com.awayday.rep.type.PreparedMetaCharacter;

/**
 * Created by AwayDay on 2017-04-02.
 */
public interface Pattern {
    String toString();

    Pattern addPattern(Pattern pattern);

    Pattern addPattern(String patternString);

    Pattern addPattern(PreparedMetaCharacter preparedPattern);
}
