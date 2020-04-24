package io.binarybase.covid19.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
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


public class QAFragment extends Fragment {

    private static final String TAG = "DashboardFragment";

    private QAAdapter adapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_qa, container, false);

        //Log.d(TAG, "onCreateView: "+ getResources().getIdentifier("rosun", "drawable", getContext().getPackageName()));
        List<QA> qas1 = new ArrayList<>();
        qas1.add(new QA(getResources().getString(R.string.alive_surface_ans)));

        List<QA> qas = new ArrayList<>();
        qas.add(new QA(getResources().getString(R.string.what_corona_ans)));

        List<QA> covid = new ArrayList<>();
        covid.add(new QA(getResources().getString(R.string.covid_19_ans)));

        List<QA> symtom = new ArrayList<>();
        symtom.add(new QA(getResources().getString(R.string.symptoms_ans)));

        List<QA> sprate = new ArrayList<>();
        sprate.add(new QA(getResources().getString(R.string.how_sprate_ans)));

        List<QA> protect = new ArrayList<>();
        protect.add(new QA(getResources().getIdentifier("save_covid", "drawable", getContext().getPackageName()), 0));

        List<QA> mask = new ArrayList<>();
        mask.add(new QA(getResources().getIdentifier("mask", "drawable", getContext().getPackageName()), 0));

        List<QA> myth = new ArrayList<>();
        myth.add(new QA(getResources().getIdentifier("myth", "drawable", getContext().getPackageName()), 0));
        List<QA> myth2 = new ArrayList<>();
        myth2.add(new QA(getResources().getIdentifier("myth2", "drawable", getContext().getPackageName()), 0));
        List<QA> myth3 = new ArrayList<>();
        myth3.add(new QA(getResources().getIdentifier("myth3", "drawable", getContext().getPackageName()), 0));
        List<QA> myth4 = new ArrayList<>();
        myth4.add(new QA(getResources().getIdentifier("myth4", "drawable", getContext().getPackageName()), 0));
        List<QA> myth5 = new ArrayList<>();
        myth5.add(new QA(getResources().getIdentifier("myth5", "drawable", getContext().getPackageName()), 0));
        List<QA> myth6 = new ArrayList<>();
        myth6.add(new QA(getResources().getIdentifier("myth6", "drawable", getContext().getPackageName()), 0));

        List<QA> last = new ArrayList<>();
        last.add(new QA(getResources().getString(R.string.animal_ans)));

        List<QAExpand> qaExpands = new ArrayList<>();
        qaExpands.add(new QAExpand(getResources().getString(R.string.what_corona), qas));
        qaExpands.add(new QAExpand(getResources().getString(R.string.what_covid), covid));
        qaExpands.add(new QAExpand(getResources().getString(R.string.symptoms), symtom));
        qaExpands.add(new QAExpand(getResources().getString(R.string.how_spread), sprate));
        qaExpands.add(new QAExpand(getResources().getString(R.string.protect), protect));
        qaExpands.add(new QAExpand(getResources().getString(R.string.mask_use), mask));
        qaExpands.add(new QAExpand(getResources().getString(R.string.myths_and_rumours), myth));
        qaExpands.add(new QAExpand(getResources().getString(R.string.myths_and_rumours_con), myth2));
        qaExpands.add(new QAExpand(getResources().getString(R.string.myths_and_rumours_con), myth3));
        qaExpands.add(new QAExpand(getResources().getString(R.string.myths_and_rumours_con), myth4));
        qaExpands.add(new QAExpand(getResources().getString(R.string.myths_and_rumours_con), myth5));
        qaExpands.add(new QAExpand(getResources().getString(R.string.myths_and_rumours_con), myth6));
        // qaExpands.add(new QAExpand(getResources().getString(R.string.animal), last));
        //qaExpands.add(new QAExpand(getResources().getString(R.string.alive_surfaces), qas1));

        RecyclerView recyclerView = root.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());

        // RecyclerView has some built in animations to it, using the DefaultItemAnimator.
        // Specifically when you call notifyItemChanged() it does a fade animation for the changing
        // of the data in the ViewHolder. If you would like to disable this you can use the following:
        RecyclerView.ItemAnimator animator = recyclerView.getItemAnimator();
        if (animator instanceof DefaultItemAnimator) {
            ((DefaultItemAnimator) animator).setSupportsChangeAnimations(false);
        }

        adapter = new QAAdapter(qaExpands, getContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
        return root;
    }
}
