import com.example.booking_stats_service.Stats

object Cars {

    private lateinit var _stats: Stats
    val stats: Stats
        get() {
            return _stats
        }

    fun init(stats: Stats) {
        _stats = stats
    }

}