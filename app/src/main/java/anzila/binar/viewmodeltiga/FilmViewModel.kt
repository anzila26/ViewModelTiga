package anzila.binar.viewmodeltiga

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FilmViewModel : ViewModel() {
    val list = arrayListOf(
        DataFilm("Parasite", "2019", R.drawable.filmsatu),
        DataFilm("Mariposa", "2020", R.drawable.filmdua),
        DataFilm("Geez & Ann", "2021", R.drawable.filmtiga),
        DataFilm("The Boss Baby 2", "2021",  R.drawable.filmempat),
        DataFilm("Alive", "2020",  R.drawable.filmlima)
    )

    val filmList : MutableLiveData<List<DataFilm>> = MutableLiveData()

    fun getFilmList(){
        var stu = list
        filmList.value = stu
    }

}