package hr.mosaicapps.sensio.ui.sensorselection


import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment

import hr.mosaicapps.sensio.R

class SensorSelectionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_sensor_selection, container, false)
    }
}
