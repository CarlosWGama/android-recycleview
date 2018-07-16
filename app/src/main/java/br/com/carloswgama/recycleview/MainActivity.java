package br.com.carloswgama.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

import java.util.ArrayList;

import br.com.carloswgama.recycleview.model.Produto;
import br.com.carloswgama.recycleview.util.ProdutoAdapter;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Recycle View
        RecyclerView recyclerView = findViewById(R.id.recycleview_produto);

        //Lista de Produtos
        produtos.add(new Produto("Pendriver", 50, R.drawable.pendriver));
        produtos.add(new Produto("PlayStation", 1500.5, R.drawable.playstation));

        //Adapter
        ProdutoAdapter adapter = new ProdutoAdapter(produtos);
        recyclerView.setAdapter(adapter);

        //Linear Layout Manager
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

    }
}
