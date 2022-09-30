package com.collectionpart3.question2.model;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SoftwarVersionComparator implements Comparator<String> {

    @Override
    public int compare(String version, String otherVersion) {
        return normalizedVersion(version).compareTo(normalizedVersion(otherVersion));
    }
    private String normalizedVersion(String version) {
        return Arrays.stream(version.split("\\."))
                .map(v -> String.format("%2s", v).replace(' ', '0'))
                .collect(Collectors.joining("."));
    }
}
