package com.example.material_tester.ShowOrHide

import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.material_tester.R

class Flip: AppCompatActivity() {
    private var  showingBack=false;
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_flip_content_and_view);
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .add(R.id.container, CardFrontFragment())
                    .commit()
        }
    }
private fun flipCard() {
    if (showingBack) {
            supportFragmentManager.popBackStack()
            return
        }

        // Flip to the back.

        showingBack = true

        // Create and commit a new fragment transaction that adds the fragment
        // for the back of the card, uses custom animations, and is part of the
        // fragment manager's back stack.

        supportFragmentManager.beginTransaction()

                // Replace the default fragment animations with animator
                // resources representing rotations when switching to the back
                // of the card, as well as animator resources representing
                // rotations when flipping back to the front, such as when the
                // system Back button is tapped.
                .setCustomAnimations(
                        R.animator.card_flip_right_in,
                        R.animator.card_flip_right_out,
                        R.animator.card_flip_left_in,
                        R.animator.card_flip_left_out
                )

                // Replace any fragments in the container view with a fragment
                // representing the next page, indicated by the just-incremented
                // currentPage variable.
                .replace(R.id.container, CardBackFragment())

                // Add this transaction to the back stack, letting users press
                // the Back button to get to the front of the card.
                .addToBackStack(null)

                // Commit the transaction.
                .commit()
    }
}
class CardFrontFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_card_front, container, false)
}
class CardBackFragment : Fragment() {

    override fun onCreateView(
                inflater: LayoutInflater,
                container: ViewGroup?,
                savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_card_back, container, false)
}