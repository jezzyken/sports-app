package com.jezrelljolampong.sportsv2;

import android.content.Intent;
import android.speech.RecognizerIntent;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.jezrelljolampong.sportsv2.Adapter.MenuAdapter;
import com.jezrelljolampong.sportsv2.Model.Menus;
import com.miguelcatalan.materialsearchview.MaterialSearchView;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    private MaterialSearchView searchView;

    RecyclerView listshowrcy;
    List<Menus> menulist = new ArrayList<>();
    MenuAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Menu();

        searchView = (MaterialSearchView) findViewById(R.id.search_view);
        searchView.setVoiceSearch(false);
        searchView.setEllipsize(true);
        searchView.setSuggestions(getResources().getStringArray(R.array.query_suggestions));
        searchView.setOnQueryTextListener(new MaterialSearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
//                Snackbar.make(findViewById(R.id.container), "Query: " + query, Snackbar.LENGTH_LONG)
//                        .show();


                Intent i;


                switch(query){

                    case "Basketball":
                         i = new Intent(getApplicationContext(), BasketballInformation.class);
                        i.putExtra("key", query);
                        startActivity(i);
                        break;
                    case "Basketball Defensive Strategy":
                         i = new Intent(getApplicationContext(), BasketballInformation.class);
                        i.putExtra("key", query);
                        startActivity(i);
                        break;
                    case "Duration":
                         i = new Intent(getApplicationContext(), BasketballInformation.class);
                        i.putExtra("key", query);
                        startActivity(i);
                        break;
                    case "Moving the ball":
                         i = new Intent(getApplicationContext(), BasketballInformation.class);
                        i.putExtra("key", query);
                        startActivity(i);
                        break;
                    case "Offensive Basketball Strategy":
                         i = new Intent(getApplicationContext(), BasketballInformation.class);
                        i.putExtra("key", query);
                        startActivity(i);
                        break;

                        //badminton
                    case "Badminton":
                        i = new Intent(getApplicationContext(), BadmintonInformation.class);
                        i.putExtra("key", query);
                        startActivity(i);
                        break;

                    case "Badminton Guidelines":
                        i = new Intent(getApplicationContext(), BadmintonInformation.class);
                        i.putExtra("key", query);
                        startActivity(i);
                        break;

                    case "Badminton Rules":
                        i = new Intent(getApplicationContext(), BadmintonInformation.class);
                        i.putExtra("key", query);
                        startActivity(i);
                        break;

                    case "Badminton Basic principles":
                        i = new Intent(getApplicationContext(), BadmintonInformation.class);
                        i.putExtra("key", query);
                        startActivity(i);
                        break;

                    case "Doubles Badminton Strategies":
                        i = new Intent(getApplicationContext(), BadmintonInformation.class);
                        i.putExtra("key", query);
                        startActivity(i);
                        break;


                        //tennis
                    case "First aid for acute injuries in tennis":
                        i = new Intent(getApplicationContext(), TennisInformation.class);
                        i.putExtra("key", query);
                        startActivity(i);
                        break;

                    case "Tennis":
                        i = new Intent(getApplicationContext(), TennisInformation.class);
                        i.putExtra("key", query);
                        startActivity(i);
                        break;

                    case "Tennis Gear":
                        i = new Intent(getApplicationContext(), TennisInformation.class);
                        i.putExtra("key", query);
                        startActivity(i);
                        break;

                    case "Tennis Guidelines":
                        i = new Intent(getApplicationContext(), TennisInformation.class);
                        i.putExtra("key", query);
                        startActivity(i);
                        break;

                    case "Tennis Rules and Regulations":
                        i = new Intent(getApplicationContext(), TennisInformation.class);
                        i.putExtra("key", query);
                        startActivity(i);
                        break;

                        //football
                    case "4 Essential First Aid Tips for Football":
                        i = new Intent(getApplicationContext(), FootballInformation.class);
                        i.putExtra("key", query);
                        startActivity(i);
                        break;

                    case "Defensive Football Strategy":
                        i = new Intent(getApplicationContext(), FootballInformation.class);
                        i.putExtra("key", query);
                        startActivity(i);
                        break;

                    case "Offensive Football Strategy":
                        i = new Intent(getApplicationContext(), FootballInformation.class);
                        i.putExtra("key", query);
                        startActivity(i);
                        break;

                    case "Football":
                        i = new Intent(getApplicationContext(), FootballInformation.class);
                        i.putExtra("key", query);
                        startActivity(i);
                        break;

                    case "Warm-Up for Football":
                        i = new Intent(getApplicationContext(), FootballInformation.class);
                        i.putExtra("key", query);
                        startActivity(i);
                        break;

                        //Volleyball
                    case "Common Youth Volleyball Injuries":
                        i = new Intent(getApplicationContext(), VolleyballInformation.class);
                        i.putExtra("key", query);
                        startActivity(i);
                        break;

                    case "Volleyball: Guidelines":
                        i = new Intent(getApplicationContext(), VolleyballInformation.class);
                        i.putExtra("key", query);
                        startActivity(i);
                        break;

                    case "Volleyball":
                        i = new Intent(getApplicationContext(), VolleyballInformation.class);
                        i.putExtra("key", query);
                        startActivity(i);
                        break;

                    case "Warm-Up for Volleyball":
                        i = new Intent(getApplicationContext(), VolleyballInformation.class);
                        i.putExtra("key", query);
                        startActivity(i);
                        break;

                    case "Volleyball: Strategy and Team Play":
                        i = new Intent(getApplicationContext(), VolleyballInformation.class);
                        i.putExtra("key", query);
                        startActivity(i);
                        break;


                }



                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                //Do some magic
                return false;
            }
        });

        searchView.setOnSearchViewListener(new MaterialSearchView.SearchViewListener() {
            @Override
            public void onSearchViewShown() {
                //Do some magic
            }

            @Override
            public void onSearchViewClosed() {
                //Do some magic
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);

        MenuItem item = menu.findItem(R.id.action_search);
        searchView.setMenuItem(item);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            startActivity(new Intent(this, AboutActivity.class));
            return true;
        }

        if (id == R.id.action_exit) {

            finish();
            return true;

        }


        return super.onOptionsItemSelected(item);
    }



    @Override
    public void onBackPressed() {
        if (searchView.isSearchOpen()) {
            searchView.closeSearch();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == MaterialSearchView.REQUEST_VOICE && resultCode == RESULT_OK) {
            ArrayList<String> matches = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
            if (matches != null && matches.size() > 0) {
                String searchWrd = matches.get(0);
                if (!TextUtils.isEmpty(searchWrd)) {
                    searchView.setQuery(searchWrd, false);
                }
            }

            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    public void Menu(){
        menulist.add(new Menus("Basketball",
                R.drawable.basketball_main));
        menulist.add(new Menus("Badminton",
                R.drawable.badminton_main));
        menulist.add(new Menus("Football",
                R.drawable.football_main));
        menulist.add(new Menus("Tennis",
                R.drawable.tennis_main));
        menulist.add(new Menus("Voleyball",
                R.drawable.volleyball_main));
        menulist.add(new Menus("Bookmarks",
                R.drawable.bookmark));
        menulist.add(new Menus("Offline Videos",
                R.drawable.videos_main));
        menulist.add(new Menus("Online Videos",
                R.drawable.video_olmain));

        listshowrcy = findViewById(R.id.listshow);
        StaggeredGridLayoutManager gridLayoutManager =
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        gridLayoutManager.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_MOVE_ITEMS_BETWEEN_SPANS);
        listshowrcy.setLayoutManager(gridLayoutManager);

        adapter = new MenuAdapter(menulist, this);
        listshowrcy.setAdapter(adapter);
    }





}
