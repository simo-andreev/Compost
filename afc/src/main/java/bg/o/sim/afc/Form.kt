package bg.o.sim.afc

import android.widget.FrameLayout
import androidx.ui.core.Text
import androidx.ui.core.setContent

fun androidx.fragment.app.Fragment.setFormContentView(formName: String): FrameLayout {
    val f = FrameLayout(context)
    f.setContent {
        Text("Sup Bruh \\m/")
    }

    return f
}

