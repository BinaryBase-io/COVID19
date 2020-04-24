package io.binarybase.covid19.ui;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import io.binarybase.covid19.R;
import io.binarybase.covid19.api.TheDoor;
import io.binarybase.covid19.api.TheRoad;
import io.binarybase.covid19.models.StatusBDNow;
import io.binarybase.covid19.utils.Utils;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class StatusFragment extends Fragment {

    TextView total_test, last_24_hour_test, total_infected, last_24_hour_infected, total_recover, total_death, world_total_infected, world_total_recover, world_total_death, updated_at;
    TheRoad theRoad;
    private SwipeRefreshLayout pullToRefresh;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_status, container, false);

        pullToRefresh = root.findViewById(R.id.pullToRefresh);
        // total_test = root.findViewById(R.id.test);
        // last_24_hour_test = root.findViewById(R.id.testLast);
        total_infected = root.findViewById(R.id.infected);
        last_24_hour_infected = root.findViewById(R.id.infectedLast);
        total_recover = root.findViewById(R.id.recovered);
        total_death = root.findViewById(R.id.death);
        world_total_infected = root.findViewById(R.id.globallyInfected);
        world_total_recover = root.findViewById(R.id.globallyRecovered);
        world_total_death = root.findViewById(R.id.globallyDeath);
        updated_at = root.findViewById(R.id.update);

        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());

        if (!Utils.isConnected(getContext())) {
            builder.setMessage("No Internet connectivity!!! Please connect to get data.").setTitle("Error");
            AlertDialog alert = builder.create();
            alert.show();
            pullToRefresh.setRefreshing(false);
        }

        theRoad = TheDoor.driveOnRoad();
        getData();

        pullToRefresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                getData();
            }
        });

        return root;
    }

    private void getData() {
        pullToRefresh.setRefreshing(true);
        theRoad.getStatus().enqueue(new Callback<StatusBDNow>() {
            @Override
            public void onResponse(Call<StatusBDNow> call, Response<StatusBDNow> response) {
                total_death.setText(response.body().getStatusBD().get(0).getTotalDeath());
                last_24_hour_infected.setText(response.body().getStatusBD().get(0).getLast24HourInfected());
                total_infected.setText(response.body().getStatusBD().get(0).getTotalInfected());
                world_total_infected.setText(response.body().getStatusBD().get(0).getWorldTotalInfected());
                world_total_death.setText(response.body().getStatusBD().get(0).getWorldTotalDeath());
                total_recover.setText(response.body().getStatusBD().get(0).getTotalRecover());
                world_total_recover.setText(response.body().getStatusBD().get(0).getWorldTotalRecover());
                // total_test.setText(response.body().getStatusBD().get(0).getTotalTest());
                // last_24_hour_test.setText(response.body().getStatusBD().get(0).getLast24HourTest());
                updated_at.setText("Last Update: " + response.body().getCreatedAt());
                pullToRefresh.setRefreshing(false);
            }

            @Override
            public void onFailure(Call<StatusBDNow> call, Throwable t) {
                t.printStackTrace();
                pullToRefresh.setRefreshing(false);
            }
        });
    }
}
