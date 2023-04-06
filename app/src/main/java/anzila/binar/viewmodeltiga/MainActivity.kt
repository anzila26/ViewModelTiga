package anzila.binar.viewmodeltiga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import anzila.binar.viewmodeltiga.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var filmVm: FilmViewModel
    lateinit var filmAdapter: FilmAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initFilm()
        filmVm = ViewModelProvider(this).get(FilmViewModel::class.java)
        filmVm.getFilmList()

        filmVm.filmList.observe(this, Observer {
            filmAdapter.setFilmData(it as ArrayList<DataFilm>)
        })
    }

    fun initFilm() {
        filmAdapter = FilmAdapter(ArrayList())
        binding.rvFilm.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvFilm.adapter = filmAdapter
    }

    fun setDataFilm() {

    }
}