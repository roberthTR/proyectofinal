package com.example.for012;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    private List<Post> listaPosts;

    public PostAdapter(List<Post> listaPosts) {
        this.listaPosts = listaPosts;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_post, parent, false);
        return new PostViewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        Post post = listaPosts.get(position);
        holder.textoTitulo.setText(post.getTitulo());
        holder.textoContenido.setText(post.getContenido());
    }

    @Override
    public int getItemCount() {
        return listaPosts.size();
    }

    public static class PostViewHolder extends RecyclerView.ViewHolder {
        TextView textoTitulo;
        TextView textoContenido;

        public PostViewHolder(View vistaItem) {
            super(vistaItem);
            textoTitulo = vistaItem.findViewById(R.id.textTitle);
            textoContenido = vistaItem.findViewById(R.id.textContent);
        }
    }
}

