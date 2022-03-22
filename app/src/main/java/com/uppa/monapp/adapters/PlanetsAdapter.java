package com.uppa.monapp.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.uppa.monapp.databinding.PlanetItemBinding;
import com.uppa.monapp.model.Planet;
import com.uppa.monapp.viewholders.PlanetViewHolder;

import java.util.ArrayList;

public class PlanetsAdapter  extends RecyclerView.Adapter<PlanetViewHolder> {
    ArrayList<Planet> planets;
    OnItemClickListener listener ;
  public PlanetsAdapter(ArrayList<Planet> list){
      planets= list;
  }
public interface OnItemClickListener{
      void onItemClick(int postition);
}
public void setOnItemClickListener(OnItemClickListener listener){
      this.listener = listener;
      notifyDataSetChanged();

}
    @Override
    public int getItemCount() {
        return  planets.size();
    }

    @NonNull
    @Override
    public PlanetViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        PlanetItemBinding ui = PlanetItemBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
     return  new PlanetViewHolder(ui);
  }

    @Override
    public void onBindViewHolder(@NonNull PlanetViewHolder holder, int position) {
        Planet planet = planets.get(position);
        holder.setPlanet(planet);
        holder.setOnItemClickListener(this.listener);
    }
}
