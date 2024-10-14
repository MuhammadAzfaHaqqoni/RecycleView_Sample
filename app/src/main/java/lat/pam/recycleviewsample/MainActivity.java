package lat.pam.recycleviewsample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

import lat.pam.recyclerviewsample.CustomAdapter;
import lat.pam.recycleviewsample.R;
import lat.pam.samplerecyclerview.ItemsViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get the    RecyclerView by its ID
        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        // Create a vertical LinearLayoutManager
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Create an ArrayList of ItemsViewModel (Java equivalent)
        ArrayList<ItemsViewModel> data = new ArrayList<>();

        // Loop to create 20 items
        for (int i = 1; i <= 20; i++) {
            data.add(new ItemsViewModel("Item " + i));
        }

        // Create a CustomAdapter instance with the data
        CustomAdapter adapter = new CustomAdapter(data);
        Log.d("test string", "Jumlah data: " + data.size());

        // Set the adapter to the RecyclerView
        recyclerView.setAdapter(adapter);
    }
}