package com.example.library_catalog;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;

import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btnAddBook;
    private Button btnDeleteBook;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        initViews();
        setupClickListener();

        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    private void initViews() {
        btnAddBook = findViewById(R.id.btn_add_book);
        btnDeleteBook = findViewById(R.id.btn_delete_book);
    }

    private void setupClickListener() {
        btnAddBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onAddBookClick();
            }
        });
        btnDeleteBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onDeleteBookClick();
            }
        });
    }
    private void onAddBookClick() {
        Toast.makeText(this, "Добавить книгу", Toast.LENGTH_SHORT).show();
    }
    private void onDeleteBookClick() {
        Toast.makeText(this, "Удалить книгу", Toast.LENGTH_SHORT).show();
    }
}














