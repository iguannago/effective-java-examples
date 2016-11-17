package org.effectivejava.examples.item31;


import org.effectivejava.examples.chapter06.item31.Ensemble;
import org.effectivejava.examples.chapter06.item31.EnsembleBadPractice;
import org.junit.Test;

/**
 * Created by davicres on 17/11/2016.
 */
public class EnumTest {

    @Test
    public void EnsembleBadPracticeEnumTest() {
        EnsembleBadPractice ensembleBadPractice = EnsembleBadPractice.DUET;
        System.out.println("Bad practice: " + ensembleBadPractice.numberOfMusicians());
    }

    @Test
    public void EnsembleEnumBestPracticeTest() {
        Ensemble ensemble = Ensemble.DUET;
        System.out.println("Best practice: " + ensemble.numberOfMusicians());
    }
}
