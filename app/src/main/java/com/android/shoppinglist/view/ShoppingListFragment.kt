package com.android.shoppinglist.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.shoppinglist.R
import com.android.shoppinglist.viewmodel.ShoppingListViewModel

class ShoppingListFragment : Fragment() {

    companion object {
        fun newInstance() = ShoppingListFragment()
    }

    private lateinit var viewModel: ShoppingListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_shopping_list, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ShoppingListViewModel::class.java)
        // TODO: Use the ViewModel
    }

}