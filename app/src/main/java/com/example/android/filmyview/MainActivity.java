package com.example.android.filmyview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button search = (Button) findViewById(R.id.button);

        final TextView textView = (TextView) findViewById(R.id.search);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String value = textView.getText().toString();

                if(!TextUtils.isEmpty(value)&& !(value == null) ) {

                    Intent intent = new Intent(MainActivity.this, MovieDetails.class);

                    intent.putExtra("Search", value);

                    startActivity(intent);
                } else {

                    textView.setError("Nothing To Search");


                }

            }
        });
    }
}
