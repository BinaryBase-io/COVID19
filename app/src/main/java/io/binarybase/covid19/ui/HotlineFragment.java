package io.binarybase.covid19.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import io.binarybase.covid19.R;
import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class HotlineFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_hotline, container, false);

        View hotlinePage = new AboutPage(getContext())
                .isRTL(false)
                .setDescription(getString(R.string.number_update))
                .addGroup("Hotline")
                .addItem(getCallElement("333"))
                .addItem(getCallElement("16263"))
                .addItem(getCallElement("01550064901"))
                .addItem(getCallElement("01550064902"))
                .addItem(getCallElement("01550064903"))
                .addItem(getCallElement("01550064904"))
                .addItem(getCallElement("01550064905"))
                .addItem(getCallElement("01401184551"))
                .addItem(getCallElement("01401184554"))
                .addItem(getCallElement("01401184555"))
                .addItem(getCallElement("01401184556"))
                .addItem(getCallElement("01401184559"))
                .addItem(getCallElement("01401184560"))
                .addItem(getCallElement("01401184563"))
                .addItem(getCallElement("01401184568"))
                .addItem(getCallElement("01927711784"))
                .addItem(getCallElement("01927711785"))
                .addItem(getCallElement("01937000011"))
                .addItem(getCallElement("01937110011"))
                .addGroup("Other contact addresses")
                .addFacebook("IedcrCOVID-19-Control-Room-104339737849330", "Iedcr,COVID-19 Control Room")
                .addEmail("iedcrcovid19@gmail.com", "IEDCR COVID-19 Email")
                .create();

        return hotlinePage;
    }

    private Element getCallElement(final String number) {
        Element callElement = new Element();
        callElement.setTitle("HOTLINE: " + number);
        callElement.setIconDrawable(R.drawable.ic_call_black_24dp);
        callElement.setIconTint(android.R.color.holo_red_dark);
        callElement.setIconNightTint(android.R.color.holo_red_dark);
        callElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                intent.setData(Uri.parse("tel:" + number));
                startActivity(intent);
            }
        });
        return callElement;
    }
}
