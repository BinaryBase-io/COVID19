package io.binarybase.covid19.viewHolder;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;

import com.github.chrisbanes.photoview.PhotoView;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

import io.binarybase.covid19.R;

public class AnsViewHolder extends ChildViewHolder {

    TextView ansTextView;
    PhotoView photoView;

    public AnsViewHolder(View itemView) {
        super(itemView);

        ansTextView = itemView.findViewById(R.id.list_ans);
        photoView = itemView.findViewById(R.id.list_ans_photo);
    }

    public void setAnsTextView(String ans) {
        ansTextView.setText(ans);
    }

    public void setPhotoView(Drawable image) {
        photoView.setImageDrawable(image);
    }
}
