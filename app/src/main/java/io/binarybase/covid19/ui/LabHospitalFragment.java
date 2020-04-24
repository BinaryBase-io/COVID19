package io.binarybase.covid19.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import io.binarybase.covid19.R;
import io.binarybase.covid19.adapters.QAAdapter;
import io.binarybase.covid19.models.QA;
import io.binarybase.covid19.models.QAExpand;

public class LabHospitalFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_lab_hospital, container, false);

        List<QA> lab = new ArrayList<>();
        lab.add(new QA(getResources().getIdentifier("labs", "drawable", getContext().getPackageName()), 0));
        List<QA> hospital = new ArrayList<>();
        hospital.add(new QA(getResources().getIdentifier("hospital", "drawable", getContext().getPackageName()), 0));

        List<QAExpand> qaExpands = new ArrayList<>();
        qaExpands.add(new QAExpand(getResources().getString(R.string.labs), lab));
        qaExpands.add(new QAExpand(getResources().getString(R.string.hospital), hospital));

        RecyclerView recyclerView = root.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());

        // RecyclerView has some built in animations to it, using the DefaultItemAnimator.
        // Specifically when you call notifyItemChanged() it does a fade animation for the changing
        // of the data in the ViewHolder. If you would like to disable this you can use the following:
        RecyclerView.ItemAnimator animator = recyclerView.getItemAnimator();
        if (animator instanceof DefaultItemAnimator) {
            ((DefaultItemAnimator) animator).setSupportsChangeAnimations(true);
        }

        QAAdapter adapter = new QAAdapter(qaExpands, getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

        return root;
    }

}
