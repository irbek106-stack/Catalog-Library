package com.example.library_catalog;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class AddActivity extends AppCompatActivity {
    private EditText bookTitle;
    private EditText bookAuthor;
    private EditText bookCategory;
    private Button btnSafe;
    private Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        initViews();
        setupClickListener();
    }

    private void initViews() {
        bookTitle = findViewById(R.id.book_title);
    }
    private void setupClickListener() {
        btnSafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                safeBook();
            }
        });
    }


}
