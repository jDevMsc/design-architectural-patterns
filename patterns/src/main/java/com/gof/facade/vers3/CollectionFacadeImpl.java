package com.gof.facade.vers3;

import com.google.common.collect.Collections2;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * API from other dev
 * One method from Collections, another from guava for example
 */
public class CollectionFacadeImpl implements CollectionFacade{

    @Override
    public <T extends Comparable<? super T>> void sort(List<T> list) {
        Collections.sort(list);
    }

    @Override
    public <T> Collection<List<T>> getPermutations(List<T> list) {
        return Collections2.permutations(list);
    }
}
