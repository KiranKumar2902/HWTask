package com.example.hwtask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

import org.w3c.dom.Text;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Australia/Sydney"), Locale.US);
        Calendar c2 = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"), Locale.US);
        Calendar c3 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Tokyo"), Locale.US);
        Calendar c4 = Calendar.getInstance(TimeZone.getTimeZone("Mexico/General"), Locale.US);
        Calendar c5 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Dubai"), Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        SimpleDateFormat sdf24 = new SimpleDateFormat("hh:mm aa");


        ConstraintLayout sydney = findViewById(R.id.sydney);
        TextView sydneyText = sydney.findViewById(R.id.textView);
        sydneyText.setText(R.string.sydney);
        TextView sydneyTime = sydney.findViewById(R.id.textView2);
        sdf.setCalendar(c1);
        sydneyTime.setText(sdf.format(c1.getTime()));
        TextView sydneyTime24 = sydney.findViewById(R.id.textView3);
        sdf24.setCalendar(c1);
        sydneyTime24.setText(sdf24.format(c1.getTime()));
        ImageView sydneyImg = sydney.findViewById(R.id.image);
        sydneyImg.setImageResource(R.drawable.sydney);

        ConstraintLayout newYork = findViewById(R.id.newyork);
        TextView newYorkText = newYork.findViewById(R.id.textView);
        newYorkText.setText(R.string.newYork);
        TextView newYorkTime = newYork.findViewById(R.id.textView2);
        sdf.setCalendar(c2);
        newYorkTime.setText(sdf.format(c2.getTime()));
        TextView newYorkTime24 = newYork.findViewById(R.id.textView3);
        sdf24.setCalendar(c2);
        newYorkTime24.setText(sdf24.format(c2.getTime()));
        ImageView newYorkImg = newYork.findViewById(R.id.image);
        newYorkImg.setImageResource(R.drawable.new_york);

        ConstraintLayout tokyo = findViewById(R.id.tokyo);
        TextView tokyoText = tokyo.findViewById(R.id.textView);
        tokyoText.setText(R.string.tokyo);
        TextView tokyoTime = tokyo.findViewById(R.id.textView2);
        sdf.setCalendar(c3);
        tokyoTime.setText(sdf.format(c3.getTime()));
        TextView tokyoTime24 = tokyo.findViewById(R.id.textView3);
        sdf24.setCalendar(c3);
        tokyoTime24.setText(sdf24.format(c3.getTime()));
        ImageView tokyoImg = tokyo.findViewById(R.id.image);
        tokyoImg.setImageResource(R.drawable.tokyo);

        ConstraintLayout mexicoCity = findViewById(R.id.mexicocity);
        TextView mexicoCityText = mexicoCity.findViewById(R.id.textView);
        mexicoCityText.setText(R.string.mexicoCity);
        TextView mexicoCityTime = mexicoCity.findViewById(R.id.textView2);
        sdf.setCalendar(c4);
        mexicoCityTime.setText(sdf.format(c4.getTime()));
        TextView mexicoCityTime24 = mexicoCity.findViewById(R.id.textView3);
        sdf24.setCalendar(c4);
        mexicoCityTime24.setText(sdf24.format(c4.getTime()));
        ImageView mexicoCityImg = mexicoCity.findViewById(R.id.image);
        mexicoCityImg.setImageResource(R.drawable.mexico_city);

        ConstraintLayout dubai = findViewById(R.id.dubai);
        TextView dubaiText = dubai.findViewById(R.id.textView);
        dubaiText.setText(R.string.dubai);
        TextView dubaiTime = dubai.findViewById(R.id.textView2);
        sdf.setCalendar(c5);
        dubaiTime.setText(sdf.format(c5.getTime()));
        TextView dubaiTime24 = dubai.findViewById(R.id.textView3);
        sdf24.setCalendar(c5);
        dubaiTime24.setText(sdf24.format(c5.getTime()));
        ImageView dubaiImg = dubai.findViewById(R.id.image);
        dubaiImg.setImageResource(R.drawable.dubai);

    }

    public void hide(View view) {

        ConstraintLayout sydney = findViewById(R.id.sydney);
        TextView sydneyView = sydney.findViewById(R.id.textView2);
        TextView sydneyView24 = sydney.findViewById(R.id.textView3);

        if (sydneyView.getVisibility() == View.VISIBLE || sydneyView24.getVisibility() == View.INVISIBLE) {
            sydneyView.setVisibility(View.INVISIBLE);
            sydneyView24.setVisibility(View.VISIBLE);
        } else if (sydneyView.getVisibility() == View.INVISIBLE || sydneyView24.getVisibility() == View.VISIBLE) {
            sydneyView.setVisibility(View.VISIBLE);
            sydneyView24.setVisibility(View.INVISIBLE);
        } else
            sydneyView.setVisibility(View.VISIBLE);

        ConstraintLayout newYork = findViewById(R.id.newyork);
        TextView newYorkView = newYork.findViewById(R.id.textView2);
        TextView newYorkView24 = newYork.findViewById(R.id.textView3);

        if (newYorkView.getVisibility() == View.VISIBLE || newYorkView24.getVisibility() == View.INVISIBLE) {
            newYorkView.setVisibility(View.INVISIBLE);
            newYorkView24.setVisibility(View.VISIBLE);
        } else if (newYorkView.getVisibility() == View.INVISIBLE || newYorkView24.getVisibility() == View.VISIBLE) {
            newYorkView.setVisibility(View.VISIBLE);
            newYorkView24.setVisibility(View.INVISIBLE);
        } else
            newYorkView.setVisibility(View.VISIBLE);

        ConstraintLayout tokyo = findViewById(R.id.tokyo);
        TextView tokyoView = tokyo.findViewById(R.id.textView2);
        TextView tokyoView24 = tokyo.findViewById(R.id.textView3);

        if (tokyoView.getVisibility() == View.VISIBLE || tokyoView24.getVisibility() == View.INVISIBLE) {
            tokyoView.setVisibility(View.INVISIBLE);
            tokyoView24.setVisibility(View.VISIBLE);
        } else if (tokyoView.getVisibility() == View.INVISIBLE || tokyoView24.getVisibility() == View.VISIBLE) {
            tokyoView.setVisibility(View.VISIBLE);
            tokyoView24.setVisibility(View.INVISIBLE);
        } else
            tokyoView.setVisibility(View.VISIBLE);

        ConstraintLayout mexicoCity = findViewById(R.id.mexicocity);
        TextView mexicoCityView = mexicoCity.findViewById(R.id.textView2);
        TextView mexicoCityView24 = mexicoCity.findViewById(R.id.textView3);

        if (mexicoCityView.getVisibility() == View.VISIBLE || mexicoCityView24.getVisibility() == View.INVISIBLE) {
            mexicoCityView.setVisibility(View.INVISIBLE);
            mexicoCityView24.setVisibility(View.VISIBLE);
        } else if (mexicoCityView.getVisibility() == View.INVISIBLE || mexicoCityView24.getVisibility() == View.VISIBLE) {
            mexicoCityView.setVisibility(View.VISIBLE);
            mexicoCityView24.setVisibility(View.INVISIBLE);
        } else
            mexicoCityView.setVisibility(View.VISIBLE);

        ConstraintLayout dubai = findViewById(R.id.dubai);
        TextView dubaiView = dubai.findViewById(R.id.textView2);
        TextView dubaiView24 = dubai.findViewById(R.id.textView3);

        if (dubaiView.getVisibility() == View.VISIBLE || dubaiView24.getVisibility() == View.INVISIBLE) {
            dubaiView.setVisibility(View.INVISIBLE);
            dubaiView24.setVisibility(View.VISIBLE);
        } else if (dubaiView.getVisibility() == View.INVISIBLE || dubaiView24.getVisibility() == View.VISIBLE) {
            dubaiView.setVisibility(View.VISIBLE);
            dubaiView24.setVisibility(View.INVISIBLE);
        } else
            dubaiView.setVisibility(View.VISIBLE);

    }

    public void hideCard(View view) {

        ConstraintLayout sydney = findViewById(R.id.sydney);
        ToggleButton sydneyButton = sydney.findViewById(R.id.button);
        CardView sydneyCard = sydney.findViewById(R.id.cardView);

        if (sydneyCard.getVisibility() == View.VISIBLE && !sydneyButton.isChecked()) {
            sydneyCard.setVisibility(View.INVISIBLE);
        } else if (sydneyCard.getVisibility() == View.INVISIBLE) {
            sydneyCard.setVisibility(View.VISIBLE);
        } else {
            sydneyCard.setVisibility(View.VISIBLE);
        }

        ConstraintLayout newYork = findViewById(R.id.newyork);
        ToggleButton newYorkButton = newYork.findViewById(R.id.button);
        CardView newYorkCard = newYork.findViewById(R.id.cardView);

        if (newYorkCard.getVisibility() == View.VISIBLE && !newYorkButton.isChecked()) {
            newYorkCard.setVisibility(View.INVISIBLE);
        } else if (newYorkCard.getVisibility() == View.INVISIBLE) {
            newYorkCard.setVisibility(View.VISIBLE);
        } else {
            newYorkCard.setVisibility(View.VISIBLE);
        }

        ConstraintLayout tokyo = findViewById(R.id.tokyo);
        ToggleButton tokyoButton = tokyo.findViewById(R.id.button);
        CardView tokyoCard = tokyo.findViewById(R.id.cardView);

        if (tokyoCard.getVisibility() == View.VISIBLE && !tokyoButton.isChecked()) {
            tokyoCard.setVisibility(View.INVISIBLE);
        } else if (tokyoCard.getVisibility() == View.INVISIBLE) {
            tokyoCard.setVisibility(View.VISIBLE);
        } else {
            tokyoCard.setVisibility(View.VISIBLE);
        }

        ConstraintLayout mexicoCity = findViewById(R.id.mexicocity);
        ToggleButton mexicoCityButton = mexicoCity.findViewById(R.id.button);
        CardView mexicoCityCard = mexicoCity.findViewById(R.id.cardView);

        if (mexicoCityCard.getVisibility() == View.VISIBLE && !mexicoCityButton.isChecked()) {
            mexicoCityCard.setVisibility(View.INVISIBLE);
        } else if (mexicoCityCard.getVisibility() == View.INVISIBLE) {
            mexicoCityCard.setVisibility(View.VISIBLE);
        } else {
            mexicoCityCard.setVisibility(View.VISIBLE);
        }

        ConstraintLayout dubai = findViewById(R.id.dubai);
        ToggleButton dubaiButton = dubai.findViewById(R.id.button);
        CardView dubaiCard = dubai.findViewById(R.id.cardView);

        if (dubaiCard.getVisibility() == View.VISIBLE && !dubaiButton.isChecked()) {
            dubaiCard.setVisibility(View.INVISIBLE);
        } else if (dubaiCard.getVisibility() == View.INVISIBLE) {
            dubaiCard.setVisibility(View.VISIBLE);
        } else {
            dubaiCard.setVisibility(View.VISIBLE);
        }

    }


}
