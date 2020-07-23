package com.example.detaylirecyclerviewkullanimi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FilmAdapter extends RecyclerView.Adapter<FilmAdapter.CardViewTasarimNesneleriniTutucu> {

    private Context mContext;
    private List<Filmler> filmlerList;

    public FilmAdapter(Context mContext, List<Filmler> filmlerList) {
        this.mContext = mContext;
        this.filmlerList = filmlerList;
    }
    //görsel nesneleri temsil eder
    public class CardViewTasarimNesneleriniTutucu extends RecyclerView.ViewHolder {

        public ImageView imageViewFilmAfis;
        public TextView textViewFilmBaslik;
        public TextView textViewFilmFiyat;
        public Button buttonSepeteEkle;

        public CardViewTasarimNesneleriniTutucu(@NonNull View itemView) {
            super(itemView);

            imageViewFilmAfis = itemView.findViewById(R.id.imageViewFilmAfis);
            textViewFilmBaslik = itemView.findViewById(R.id.textViewFilmBaslik);
            textViewFilmFiyat = itemView.findViewById(R.id.textViewFilmFiyat);
            buttonSepeteEkle = itemView.findViewById(R.id.buttonSepeteEkle);
        }
    }

    @NonNull
    @Override
    //tasarımı temsil eder
    public CardViewTasarimNesneleriniTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        //tasarımı bağladık
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_film_tasarim,parent,false);

        return new CardViewTasarimNesneleriniTutucu(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewTasarimNesneleriniTutucu holder, int position) {

        final Filmler film = filmlerList.get(position);

        holder.textViewFilmBaslik.setText(film.getFilmAdi());
        holder.textViewFilmFiyat.setText(film.getFilmFiyat()+"TL");
        holder.imageViewFilmAfis.setImageResource(mContext.getResources()
                .getIdentifier(film.getFilmResim(),"drawable",mContext.getPackageName()));
        holder.buttonSepeteEkle.setOnClickListener(new View.OnClickListener( ) {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,film.getFilmAdi()+" Sepete Eklendi",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return filmlerList.size();
    }
}
