package org.effectivejava.examples.chapter06.item31;

/**
 * Created by davicres on 17/11/2016.
 */
public enum EnsembleBadPractice {
    SOLO, DUET, TRIO, QUARTET, QUINTET, SEXTET, SEPTET, OCTET, DOUBLE_QUARTET, NONET, DECTET, TRIPLE_QUARTET;

    public int numberOfMusicians() {
        return ordinal() + 1;
    }

}
