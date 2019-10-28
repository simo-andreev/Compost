package bg.o.sim.compost

import android.app.Application
import com.ice.restring.Restring
import com.ice.restring.RestringConfig

class Applikation : Application() {
    override fun onCreate() {
        super.onCreate()

        val restringConfig = RestringConfig.Builder()
            .persist(false)
            .build()

        Restring.init(this, restringConfig)
    }
}