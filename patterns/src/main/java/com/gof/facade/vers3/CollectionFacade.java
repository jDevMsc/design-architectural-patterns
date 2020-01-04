package com.gof.facade.vers3;

import java.util.Collection;
import java.util.List;

public interface CollectionFacade {

    <T extends Comparable<? super T>> void sort (List<T> list);

    <T>Collection<List<T>> getPermutations(List<T> list);
}
