package com.tajammal99.tictactoe;



import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
import com.tajammal99.tictactoe.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private ImageView btnOne,btnTwo,btnThree,btnFour,
            btnFive,btnSix,btnSeven,btnEight,btnNine;
    private TextView winner,playerMove;
    private boolean p11,p12,p13,p14,p15,p16,p17,p18,p19;
    private boolean p21,p22,p23,p24,p25,p26,p27,p28,p29;
    private boolean one,two,three,four,five,six,seven,eight,nine;
    private String playerType,playerOne = "Player one",playerTwo = "Player Two";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        initialized();

        playerMove.setText(playerOne);

        buttonsListener();
    }

    private void buttonsListener()
    {
        binding.reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                reset();
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                playerType = playerMove.getText().toString();
                if(playerType.equals("Player one"))
                {
                    playerMove.setText(playerTwo);
                    one = true;
                    p11 = true;
                    btnOne.setImageResource(R.drawable.ic_baseline_panorama_fish_eye_24);
                }
                else
                {
                    playerMove.setText(playerOne);
                    one = true;
                    p21 = true;
                    btnOne.setImageResource(R.drawable.ic_baseline_close_24);
                }
                btnOne.setEnabled(false);

                calculationsOffWinner();

            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                playerType = playerMove.getText().toString();
                if(playerType.equals("Player one"))
                {
                    playerMove.setText(playerTwo);
                    two = true;
                    p12 = true;
                    btnTwo.setImageResource(R.drawable.ic_baseline_panorama_fish_eye_24);
                }
                else
                {
                    playerMove.setText(playerOne);
                    two = true;
                    p22 = true;
                    btnTwo.setImageResource(R.drawable.ic_baseline_close_24);
                }

                btnTwo.setEnabled(false);
                calculationsOffWinner();

            }
        });

        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                playerType = playerMove.getText().toString();
                if(playerType.equals("Player one"))
                {
                    playerMove.setText(playerTwo);
                    three = true;
                    p13 = true;
                    btnThree.setImageResource(R.drawable.ic_baseline_panorama_fish_eye_24);
                }
                else
                {
                    playerMove.setText(playerOne);
                    three = true;
                    p23 = true;
                    btnThree.setImageResource(R.drawable.ic_baseline_close_24);
                }
                btnThree.setEnabled(false);
                calculationsOffWinner();

            }
        });

        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                playerType = playerMove.getText().toString();
                if(playerType.equals("Player one"))
                {
                    playerMove.setText(playerTwo);
                    four = true;
                    p14 = true;
                    btnFour.setImageResource(R.drawable.ic_baseline_panorama_fish_eye_24);
                }
                else
                {
                    playerMove.setText(playerOne);
                    four = true;
                    p24 = true;
                    btnFour.setImageResource(R.drawable.ic_baseline_close_24);
                }
                btnFour.setEnabled(false);
                calculationsOffWinner();

            }
        });

        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                playerType = playerMove.getText().toString();
                if(playerType.equals("Player one"))
                {
                    playerMove.setText(playerTwo);
                    five = true;
                    p15 = true;
                    btnFive.setImageResource(R.drawable.ic_baseline_panorama_fish_eye_24);
                }
                else
                {
                    playerMove.setText(playerOne);
                    five = true;
                    p25 = true;
                    btnFive.setImageResource(R.drawable.ic_baseline_close_24);
                }
                btnFive.setEnabled(false);

                calculationsOffWinner();

            }
        });

        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                playerType = playerMove.getText().toString();
                if(playerType.equals("Player one"))
                {
                    playerMove.setText(playerTwo);
                    six = true;
                    p16 = true;
                    btnSix.setImageResource(R.drawable.ic_baseline_panorama_fish_eye_24);
                }
                else
                {
                    playerMove.setText(playerOne);
                    six = true;
                    p26 = true;
                    btnSix.setImageResource(R.drawable.ic_baseline_close_24);
                }
                btnSix.setEnabled(false);

                calculationsOffWinner();

            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                playerType = playerMove.getText().toString();
                if(playerType.equals("Player one"))
                {
                    playerMove.setText(playerTwo);
                    seven = true;
                    p17 = true;
                    btnSeven.setImageResource(R.drawable.ic_baseline_panorama_fish_eye_24);
                }
                else
                {
                    playerMove.setText(playerOne);
                    seven = true;
                    p27 = true;
                    btnSeven.setImageResource(R.drawable.ic_baseline_close_24);
                }
                btnSeven.setEnabled(false);

                calculationsOffWinner();

            }
        });

        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                playerType = playerMove.getText().toString();
                if(playerType.equals("Player one"))
                {
                    playerMove.setText(playerTwo);
                    eight = true;
                    p18 = true;
                    btnEight.setImageResource(R.drawable.ic_baseline_panorama_fish_eye_24);
                }
                else
                {
                    playerMove.setText(playerOne);
                    eight = true;
                    p28 = true;
                    btnEight.setImageResource(R.drawable.ic_baseline_close_24);
                }
                btnEight.setEnabled(false);

                calculationsOffWinner();

            }
        });

        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                playerType = playerMove.getText().toString();
                if(playerType.equals("Player one"))
                {
                    playerMove.setText(playerTwo);
                    nine = true;
                    p19 = true;
                    btnNine.setImageResource(R.drawable.ic_baseline_panorama_fish_eye_24);
                }
                else
                {
                    playerMove.setText(playerOne);
                    nine = true;
                    p29 = true;
                    btnNine.setImageResource(R.drawable.ic_baseline_close_24);
                }
                btnNine.setEnabled(false);

                calculationsOffWinner();

            }
        });
    }

    private void initialized()
    {
        btnOne = binding.one;
        btnTwo = binding.two;
        btnThree = binding.three;
        btnFour = binding.four;
        btnFive = binding.five;
        btnSix = binding.six;
        btnSeven = binding.seven;
        btnEight = binding.eight;
        btnNine = binding.nine;

        winner = binding.winners;
        playerMove = binding.playerMove;
    }

    private void calculationsOffWinner()
    {
        if (one &&  two && three)
        {
            if (p11 && p12 && p13) {
                winner.setText("Player one wins");
                DialogFinish();
            }
            else if (p21 && p22 && p23) {
                winner.setText("Player two wins");
                DialogFinish();
            }
            if (allTrue() && winner.getText()==null) {
                winner.setText("Game Over");
                DialogFinish();
            }
        }

        if (one &&  four && seven)
        {
            if (p11 && p14 && p17) {
                winner.setText("Player one wins");
                DialogFinish();
            }
            else if (p21 && p24 && p27) {
                winner.setText("Player two wins");
                DialogFinish();
            }
            if (allTrue() && winner.getText()==null) {
                winner.setText("Game Over");
                DialogFinish();
            }
        }

        if (one &&  five && nine)
        {
            if (p11 && p15 && p19) {
                winner.setText("Player one wins");
                DialogFinish();
            }
            else if (p21 && p25 && p29) {
                winner.setText("Player two wins");
                DialogFinish();
            }
            if (allTrue() && winner.getText()==null) {
                winner.setText("Game Over");
                DialogFinish();
            }
        }

        if (four &&  five && six)
        {
            if (p14 && p15 && p16) {
                winner.setText("Player one wins");
                DialogFinish();
            }
            else if (p24 && p25 && p26) {
                winner.setText("Player two wins");
                DialogFinish();
            }
            if (allTrue() && winner.getText()==null) {
                winner.setText("Game Over");
                DialogFinish();
            }
        }

        if (seven &&  eight && nine)
        {
            if (p17 && p18 && p19) {
                winner.setText("Player one wins");
                DialogFinish();
            }
            else if (p27 && p28 && p29) {
                winner.setText("Player two wins");
                DialogFinish();
            }
            if (allTrue() && winner.getText()==null) {
                winner.setText("Game Over");
                DialogFinish();
            }
        }

        if (two &&  five && eight)
        {
            if (p12 && p15 && p18) {
                winner.setText("Player one wins");
                DialogFinish();
            }
            else if (p22 && p25 && p28) {
                winner.setText("Player two wins");
                DialogFinish();
            }
            if (allTrue() && winner.getText()==null) {
                winner.setText("Game Over");
                DialogFinish();
            }
        }

        if (three &&  six && nine)
        {
            if (p13 && p16 && p19) {
                winner.setText("Player one wins");
                DialogFinish();
            }
            else if (p23 && p26 && p29) {
                winner.setText("Player two wins");
                DialogFinish();
            }
            if (allTrue() && winner.getText()==null) {
                winner.setText("Game Over");
                DialogFinish();
            }
        }

        if (three &&  five && seven)
        {
            if (p13 && p15 && p17) {
                winner.setText("Player one wins");
                DialogFinish();
            }
            if (p23 && p25 && p27) {
                winner.setText("Player two wins");
                DialogFinish();
            }
            if (allTrue() && winner.getText()==null) {
                winner.setText("Game Over");
                DialogFinish();
            }
        }
    }

    private void reset() {
        winner.setText(null);
        btnOne.setImageResource(R.color.white);
        btnTwo.setImageResource(R.color.white);
        btnThree.setImageResource(R.color.white);
        btnFour.setImageResource(R.color.white);
        btnFive.setImageResource(R.color.white);
        btnSix.setImageResource(R.color.white);
        btnSeven.setImageResource(R.color.white);
        btnEight.setImageResource(R.color.white);
        btnNine.setImageResource(R.color.white);

        btnOne.setEnabled(true);
        btnTwo.setEnabled(true);
        btnThree.setEnabled(true);
        btnFour.setEnabled(true);
        btnFive.setEnabled(true);
        btnSix.setEnabled(true);
        btnSeven.setEnabled(true);
        btnEight.setEnabled(true);
        btnNine.setEnabled(true);

        p11 = false;
        p12 = false;
        p13 = false;
        p14 = false;
        p15 = false;
        p16 = false;
        p17 = false;
        p18 = false;
        p19 = false;

        p21 = false;
        p22 = false;
        p23 = false;
        p24 = false;
        p25 = false;
        p26 = false;
        p27 = false;
        p28 = false;
        p29 = false;

        one = false;
        two = false;
        three = false;
        four = false;
        five = false;
        six = false;
        seven = false;
        eight = false;
        nine = false;

    }

    private void DialogFinish()
    {
        AlertDialog alertDialog =  new MaterialAlertDialogBuilder(MainActivity.this,R.style.MyRounded_MaterialComponents_MaterialAlertDialog)  // for fragment you can use getActivity() instead of this
                .setView(R.layout.game_finish) // custom layout is here
                .show();

        TextView winnerName = alertDialog.findViewById(R.id.winnerTxt);

        assert winnerName != null;
        winnerName.setText(winner.getText().toString());

        Button btnExit,btnNewGame;
        btnExit = alertDialog.findViewById(R.id.exitGame);
        btnNewGame = alertDialog.findViewById(R.id.btnNewGame);

        assert btnExit != null;
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        assert btnNewGame != null;
        btnNewGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                alertDialog.dismiss();
                reset();

            }
        });

    }

    private boolean allTrue()
    {
        boolean value =false;
        if (one && two && three && four && five && six && seven && eight && nine)
            value =true;

        return value;
    }
}