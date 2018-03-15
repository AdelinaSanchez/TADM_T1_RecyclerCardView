package mx.edu.ittepic.tadm_t1_recyclercardview;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by adelina on 14/03/2018.
 */

public class Adaptador extends RecyclerView.Adapter<Adaptador.ProductViewHolder> {
    private Context mCtx;
    private List<ProveedorDatos> productList;

    public Adaptador(Context mCtx, List<ProveedorDatos> productList) {
        this.mCtx = mCtx;
        this.productList = productList;
    }
    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mCtx);
        View view = inflater.inflate(R.layout.card_layout,null);

        ProductViewHolder holder = new ProductViewHolder(view);

        return holder;
    }
    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        ProveedorDatos product = productList.get(position);
        holder.textViewTitle.setText(product.getTitle());
        holder.textViewDesc.setText(product.getShortdesc());
        holder.textViewRating.setText(String.valueOf(product.getRating()));
        holder.imageView.setImageDrawable(mCtx.getResources().getDrawable(product.getImage()));

        if (position ==0){
            holder.itemView.setBackgroundColor(Color.parseColor("#9933CC"));
        }
        if (position == 1) {
            holder.itemView.setBackgroundColor(Color.parseColor("#FF00FF"));
        }
            if (position == 2){
                holder.itemView.setBackgroundColor(Color.parseColor("#CC0099"));
            }
            if (position == 3){
                holder.itemView.setBackgroundColor(Color.parseColor("#CC3399"));
            }
            if (position == 4){
                holder.itemView.setBackgroundColor(Color.parseColor("#990066"));
            }
        }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    class ProductViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textViewTitle,textViewDesc,textViewRating;

        public ProductViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.imageView);
            textViewTitle = itemView.findViewById(R.id.textView1);
            textViewDesc = itemView.findViewById(R.id.textView2);
            textViewRating = itemView.findViewById(R.id.textView3);
        }
    }
}
