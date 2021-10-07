package com.example.courtcounter_uwi

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

/**
 * This activity keeps track of the basketball score for 2 teams.
 */
class MainActivity : AppCompatActivity() {

    private lateinit var viewModel:ScoreViewModel

    protected override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this)[ScoreViewModel::class.java]
        displayForTeamA(viewModel.scoreTeamA)
        displayForTeamB(viewModel.scoreTeamB)
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    fun addOneForTeamA(v: View?) {
        viewModel.scoreTeamA = viewModel.scoreTeamA + 1
        displayForTeamA(viewModel.scoreTeamA)
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    fun addTwoForTeamA(v: View?) {
        viewModel.scoreTeamA = viewModel.scoreTeamA + 2
        displayForTeamA(viewModel.scoreTeamA)
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    fun addThreeForTeamA(v: View?) {
        viewModel.scoreTeamA = viewModel.scoreTeamA + 3
        displayForTeamA(viewModel.scoreTeamA)
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    fun addOneForTeamB(v: View?) {
        viewModel.scoreTeamB = viewModel.scoreTeamB + 1
        displayForTeamB(viewModel.scoreTeamB)
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    fun addTwoForTeamB(v: View?) {
        viewModel.scoreTeamB = viewModel.scoreTeamB + 2
        displayForTeamB(viewModel.scoreTeamB)
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    fun addThreeForTeamB(v: View?) {
        viewModel.scoreTeamB = viewModel.scoreTeamB + 3
        displayForTeamB(viewModel.scoreTeamB)
    }

    /**
     * Resets the score for both teams back to 0.
     */
    fun resetScore(v: View?) {
        viewModel.scoreTeamB = 0
        viewModel.scoreTeamB = 0
        displayForTeamA(viewModel.scoreTeamB)
        displayForTeamB(viewModel.scoreTeamB)
    }

    /**
     * Displays the given score for Team A.
     */
    fun displayForTeamA(score: Int) {
        val scoreView = findViewById(R.id.team_a_score) as TextView
        scoreView.text = score.toString()
    }

    /**
     * Displays the given score for Team B.
     */
    fun displayForTeamB(score: Int) {
        val scoreView = findViewById(R.id.team_b_score) as TextView
        scoreView.text = score.toString()
    }
}