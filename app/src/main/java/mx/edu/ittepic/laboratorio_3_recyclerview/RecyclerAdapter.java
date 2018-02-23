package mx.edu.ittepic.laboratorio_3_recyclerview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
Context context;
    private String[] nombres;
    private String[] carreras;
    private String[] matriculas;

    public RecyclerAdapter(String[] nombres,String[] carreras,String[] matriculas) {
        this.nombres = nombres;
        this.carreras=carreras;
        this.matriculas=matriculas;
    }


    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.campo_nombre.setText(nombres[position]);
        holder.campo_matricula.setText(matriculas[position]);
        holder.campo_carrera.setText(carreras[position]);
    }

    //retorna el mismo numero para los 3 TXT
    @Override
    public int getItemCount() {
        return nombres.length;
    }




    public static class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView campo_nombre,campo_matricula,campo_carrera;

        //C O N S T R U C T O R
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            campo_nombre = itemView.findViewById(R.id.alumno);
            campo_matricula = itemView.findViewById(R.id.numControl);
            campo_carrera = itemView.findViewById(R.id.carrera);
        }
    }

}
