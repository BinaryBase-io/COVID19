package io.binarybase.covid19.models;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class QAExpand extends ExpandableGroup<QA> {
    public QAExpand(String title, List<QA> items) {
        super(title, items);
    }
}
