package io.binarybase.covid19.adapters;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

import io.binarybase.covid19.R;
import io.binarybase.covid19.models.QA;
import io.binarybase.covid19.models.QAExpand;
import io.binarybase.covid19.viewHolder.AnsViewHolder;
import io.binarybase.covid19.viewHolder.QAExpendViewHolder;

public class QAAdapter extends ExpandableRecyclerViewAdapter<QAExpendViewHolder, AnsViewHolder> {
    private Context context;

    public QAAdapter(List<? extends ExpandableGroup> groups, Context context) {
        super(groups);
        this.context = context;
    }

    @Override
    public QAExpendViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.qa_expand, parent, false);
        return new QAExpendViewHolder(view);
    }

    @Override
    public AnsViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.ans_expand, parent, false);
        return new AnsViewHolder(view);
    }

    @Override
    public void onBindChildViewHolder(AnsViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        final QA artist = ((QAExpand) group).getItems().get(childIndex);
        holder.setAnsTextView(null);
        holder.setPhotoView(null);
        if (artist.getIsImage() == 1)
            holder.setAnsTextView(artist.getAnswer());
        else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
            holder.setPhotoView(context.getResources().getDrawable(artist.getImage(), context.getTheme()));
        else
            holder.setPhotoView(context.getResources().getDrawable(artist.getImage()));
    }

    @Override
    public void onBindGroupViewHolder(QAExpendViewHolder holder, int flatPosition, ExpandableGroup group) {
        holder.setTitle(group);
    }

}
