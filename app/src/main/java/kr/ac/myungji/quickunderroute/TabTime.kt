package kr.ac.myungji.quickunderroute

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [TabTime.newInstance] factory method to
 * create an instance of this fragment.
 */
class TabTime : Fragment() {
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
        return inflater.inflate(R.layout.fragment_tab_time, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        infoTime = view.findViewById(R.id.info_time1)
        infoDist = view.findViewById(R.id.info_dist1)
        infoFare = view.findViewById(R.id.info_fare1)
        infoTrans = view.findViewById(R.id.info_trans1)
        infoRoute = view.findViewById(R.id.info_route1)

        infoTime.text = MyApplication.prefs.getString("time1", null)
        infoDist.text = MyApplication.prefs.getString("dist1", null)
        infoFare.text = MyApplication.prefs.getString("fare1", null)
        infoTrans.text = MyApplication.prefs.getString("trans1", null)
        infoRoute.text = MyApplication.prefs.getString("route1", null)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        infoTime.text = MyApplication.prefs.getString("time1", null)
        infoDist.text = MyApplication.prefs.getString("dist1", null)
        infoFare.text = MyApplication.prefs.getString("fare1", null)
        infoTrans.text = MyApplication.prefs.getString("trans1", null)
        infoRoute.text = MyApplication.prefs.getString("route1", null)
    }

    override fun onStart() {
        super.onStart()

        infoTime.text = MyApplication.prefs.getString("time1", null)
        infoDist.text = MyApplication.prefs.getString("dist1", null)
        infoFare.text = MyApplication.prefs.getString("fare1", null)
        infoTrans.text = MyApplication.prefs.getString("trans1", null)
        infoRoute.text = MyApplication.prefs.getString("route1", null)
    }

    override fun onResume() {
        super.onResume()

        infoTime.text = MyApplication.prefs.getString("time1", null)
        infoDist.text = MyApplication.prefs.getString("dist1", null)
        infoFare.text = MyApplication.prefs.getString("fare1", null)
        infoTrans.text = MyApplication.prefs.getString("trans1", null)
        infoRoute.text = MyApplication.prefs.getString("route1", null)
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment tab_time.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            TabTime().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}