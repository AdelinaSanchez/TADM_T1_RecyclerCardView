package mx.edu.ittepic.tadm_t1_recyclercardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Adaptador adapter;

    List<ProveedorDatos> productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        productList = new ArrayList<>();

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Aquí va la adición de elementos a la lista
        productList.add(
                new ProveedorDatos("POP", "Maroon5", 1,R.drawable.pop)
        );
        productList.add(
                new ProveedorDatos("ROCK", "Mago de Oz", 5,R.drawable.rock)
        );
        productList.add(
                new ProveedorDatos("RAP", "Eminemm", 2,R.drawable.rap)
        );
        productList.add(
                new ProveedorDatos("REGGAETON", "Maluma", 3,R.drawable.regg)
        );


        adapter = new Adaptador(this,productList);
        recyclerView.setAdapter(adapter);
    }
}
