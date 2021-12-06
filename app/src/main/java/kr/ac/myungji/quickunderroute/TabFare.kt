package kr.ac.myungji.quickunderroute

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [tab_fare.newInstance] factory method to
 * create an instance of this fragment.
 */
class TabFare : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var infoTime: TextView
    private lateinit var infoDist: TextView
    private lateinit var infoFare: TextView
    private lateinit var infoTrans: TextView
    private lateinit var infoRoute: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var v: View = inflater.inflate(R.layout.fragment_tab_fare, container, false)

        infoTime = v.findViewById(R.id.info_time3)
        infoDist = v.findViewById(R.id.info_dist3)
        infoFare = v.findViewById(R.id.info_fare3)
        infoTrans = v.findViewById(R.id.info_trans3)
        infoRoute = v.findViewById(R.id.info_route3)

        infoTime.text = MyApplication.prefs.getString("time3", null)
        infoDist.text = MyApplication.prefs.getString("dist3", null)
        infoFare.text = MyApplication.prefs.getString("fare3", null)
        infoTrans.text = MyApplication.prefs.getString("trans3", null)
        infoRoute.text = MyApplication.prefs.getString("route3", null)

        return v
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment tab_fare.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            TabFare().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}