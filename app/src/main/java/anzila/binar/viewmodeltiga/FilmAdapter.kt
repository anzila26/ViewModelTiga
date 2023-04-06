package anzila.binar.viewmodeltiga

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FilmAdapter(var listFilm : ArrayList<DataFilm>):RecyclerView.Adapter<FilmAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var judul = itemView.findViewById<TextView>(R.id.filmJudul)
        var tahun = itemView.findViewById<TextView>(R.id.filmTahun)
        var img = itemView.findViewById<ImageView>(R.id.filmImg)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FilmAdapter.ViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_film, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: FilmAdapter.ViewHolder, position: Int) {
        var data = listFilm[position]
        holder.judul.text = data.judul
        holder.tahun.text = data.tahun
        holder.img.setImageResource(data.img)
    }

    override fun getItemCount(): Int {
        return listFilm.size
    }

    fun setFilmData(listFilm: ArrayList<DataFilm>)
    {
        this.listFilm=listFilm
//        notifyDataSetChanged()
    }

}