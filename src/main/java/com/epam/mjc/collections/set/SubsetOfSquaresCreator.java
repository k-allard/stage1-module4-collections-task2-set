package com.epam.mjc.collections.set;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SubsetOfSquaresCreator {
    public Set<Integer> createSubsetOfSquares(List<Integer> sourceList, int lowerBound, int upperBound) {
        List<Integer> squaredSourceList = new ArrayList<>(sourceList);
        squaredSourceList.replaceAll(i -> i * i);
        NavigableSet<Integer> res = new TreeSet<>(squaredSourceList);
        return res.subSet(lowerBound, true, upperBound, true);
    }
}
