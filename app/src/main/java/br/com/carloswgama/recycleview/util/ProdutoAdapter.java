package br.com.carloswgama.recycleview.util;

import android.content.ContentValues;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import br.com.carloswgama.recycleview.R;
import br.com.carloswgama.recycleview.model.Produto;

public class ProdutoAdapter extends RecyclerView.Adapter {

    public class ProdutoViewHolder extends RecyclerView.ViewHolder {
        private TextView produto;
        private TextView preco;
        private ImageView imagem;

        public ProdutoViewHolder(View itemView) {
            super(itemView);
            produto = itemView.findViewById(R.id.tv_produto_recycleview);
            preco = itemView.findViewById(R.id.tv_preco_recycleview);
            imagem = itemView.findViewById(R.id.iv_foto_recycleview);
            //Ação de Click
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String nome = produtos.get(getAdapterPosition()).getNome();
                    Log.d("Item:", nome);
                }
            });
        }

        public TextView getProduto() { return produto; }

        public TextView getPreco() { return preco; }

        public ImageView getImagem() { return imagem; }
    }


    private ArrayList<Produto> produtos;

    public ProdutoAdapter(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.recycleview_produtos, parent, false);
        return new ProdutoViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ProdutoViewHolder h = (ProdutoViewHolder) holder;
        h.getProduto().setText(produtos.get(position).getNome());
        h.getPreco().setText(String.format("R$ %.2f", produtos.get(position).getPreco()));
        h.getImagem().setImageResource(produtos.get(position).getImagem());
    }

    @Override
    public int getItemCount() {
        return produtos.size();
    }
}


