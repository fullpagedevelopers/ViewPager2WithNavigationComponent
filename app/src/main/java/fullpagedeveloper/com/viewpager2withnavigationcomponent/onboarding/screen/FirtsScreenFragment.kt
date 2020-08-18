package fullpagedeveloper.com.viewpager2withnavigationcomponent.onboarding.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import fullpagedeveloper.com.viewpager2withnavigationcomponent.R
import kotlinx.android.synthetic.main.fragment_firts_screen.view.*

class FirtsScreenFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_firts_screen, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager2)

        view.textView_Next.setOnClickListener {
            viewPager?.currentItem = 1
        }

        return view
    }

}