package br.com.carloswgama.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import br.com.carloswgama.recycleview.model.Produto;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Produto> produtos = new ArrayList<Produto>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Lista de Produtos
        produtos.add(new Produto("Pendriver", 50, R.drawable.pendriver));
        produtos.add(new Produto("PlayStation", 1500.5, R.drawable.playstation));

    }
}
