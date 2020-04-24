package io.binarybase.covid19;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.yariksoffice.lingver.Lingver;

import java.util.Calendar;

import io.binarybase.covid19.utils.Utils;
import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";

    private View aboutPage;
    private AlertDialog alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM);

        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_status, R.id.navigation_hotline, R.id.navigation_qa, R.id.navigation_video, R.id.navigation_labhospital)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
/*
        Dexter.withActivity(this)
                .withPermissions(
                        Manifest.permission.ACCESS_FINE_LOCATION,
                        Manifest.permission.ACCESS_COARSE_LOCATION
                )
                .withListener(new MultiplePermissionsListener() {
                    @Override
                    public void onPermissionsChecked(MultiplePermissionsReport report) {
                        mFusedLocationClient = LocationServices.getFusedLocationProviderClient(MainActivity.this);
                        locationUpdate();
                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(List<PermissionRequest> permissions, PermissionToken token) {

                    }
                }).check();*/

        aboutPage = new AboutPage(this)
                .isRTL(false)
                .setDescription(getResources().getString(R.string.about_text))
                //.addGroup(getResources().getString(R.string.courtesy))
                //.addItem(getCustom("https://www.bip.org.bd/", getResources().getString(R.string.bip), R.drawable.bir))
                .addGroup("Innovation and Developed by")
                .addItem(getLinkedIn("jubayerahsan", "Jubayer Ahsan - Innovation Lead"))
                .addItem(getLinkedIn("sazalns", "Noor Nabiul Alam Siddiqui - Innovation Dev Lead"))
                .addGitHub("sazal-ns")
                .addGroup(getResources().getString(R.string.more_info))
                .addWebsite("https://www.who.int/bangladesh/emergencies", "WHO Bangladesh")
                .addWebsite("https://www.iedcr.gov.bd/", "IEDCR")
                .addWebsite("https://www.worldometers.info/coronavirus/", "worldometers")
                .addItem(new Element().setTitle("Version " + BuildConfig.VERSION_NAME))
                .addItem(getCopyRightsElement())
                .create();

        alertDialog = new AlertDialog.Builder(this).create();
        alertDialog.setView(aboutPage);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.lang_switch, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId() == R.id.lang_swith_btn) {
            if (Lingver.getInstance().getLocale().toString().equals("bn_BD"))
                Lingver.getInstance().setLocale(this, "en");
            else
                Lingver.getInstance().setLocale(this, "bn", "BD");

            Intent i = new Intent(this, MainActivity.class);
            startActivity(i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK));
        }

        if (item.getItemId() == R.id.top_menu_about_btn) {
            alertDialog.show();
        }

        return super.onOptionsItemSelected(item);
    }


    private Element getCustom(String url, String title, int icon) {
        Element element = new Element();
        element.setTitle(title);
        element.setIconDrawable(icon);
        element.setValue(url);

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));

        element.setIntent(intent);

        return element;
    }

    private Element getLinkedIn(String url, String title) {
        Element linked = new Element();
        linked.setTitle(title);
        linked.setIconDrawable(R.drawable.ic_icons8_linkedin);
        linked.setIconTint(mehdi.sakout.aboutpage.R.color.about_item_icon_color);
        linked.setValue(url);
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.linkedin.com/in/" + url));

        if (Utils.isAppInstalled(getApplicationContext(), "com.linkedin.android")) {
            intent.setPackage("com.linkedin.android");
        }

        linked.setIntent(intent);

        return linked;
    }

    private Element getCopyRightsElement() {
        Element copyRightsElement = new Element();
        final String copyrights = String.format(getString(R.string.copy_right), Calendar.getInstance().get(Calendar.YEAR));
        copyRightsElement.setTitle(copyrights);
        copyRightsElement.setIconDrawable(R.drawable.copyright);
        copyRightsElement.setIconTint(mehdi.sakout.aboutpage.R.color.about_item_icon_color);
        copyRightsElement.setIconNightTint(android.R.color.white);
        copyRightsElement.setGravity(Gravity.CENTER);
        copyRightsElement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), copyrights, Toast.LENGTH_SHORT).show();
            }
        });
        return copyRightsElement;
    }
}
