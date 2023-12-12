package lesson22

fun main() {


}

data class MainScreenState(val data: String?, val isLoading: Boolean)

class MainScreenViewModel {
    private var mainScreenState: MainScreenState = MainScreenState(null, false)
    fun loadData() {
        //отсутствие данных
        mainScreenState = mainScreenState.copy(data = null, isLoading = false)
        //загрузка данных
        mainScreenState = mainScreenState.copy(data = "Данные загружаются", isLoading = true)
        //наличие загруженных данных
        mainScreenState = mainScreenState.copy(data = "Загруженные данные", isLoading = false)
    }
}