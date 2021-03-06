package pl.pam.receiptsaver.titleFragment

import android.os.Bundle
import android.view.*
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import pl.pam.receiptsaver.R
import pl.pam.receiptsaver.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //Zbindowanie odpowiedniego widoku z katalogu layout
        val binding = DataBindingUtil.inflate<FragmentTitleBinding>(
            inflater, R.layout.fragment_title, container, false
        )

        binding.addReceiptButton.setOnClickListener { v: View ->
            v.findNavController()
                .navigate(TitleFragmentDirections.actionTitleFragmentToSaveReceiptFragment())
        }

        binding.showReceiptHistoryButton.setOnClickListener { v: View ->
            v.findNavController()
                .navigate(TitleFragmentDirections.actionTitleFragmentToHistoryRecycle())
        }

        binding.showExpenseStats.setOnClickListener { v: View ->
            v.findNavController()
                .navigate(TitleFragmentDirections.actionTitleFragmentToExpenseStatsFragment())
        }

        setHasOptionsMenu(true)
        return binding.root
    }
}