package viacheslav.chugunov.spy.internal.presentation.list

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import viacheslav.chugunov.spy.internal.data.EventStorage
import viacheslav.chugunov.spy.internal.data.inject

internal class SpyEventsViewModel private constructor(
    application: Application,
    storage: EventStorage
) : AndroidViewModel(application) {
    val allEventsFlow = storage.getAllEventsFlow()

    constructor(application: Application) : this(
        application = application,
        storage = inject(application)
    )
}