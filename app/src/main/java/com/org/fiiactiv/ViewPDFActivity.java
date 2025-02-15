package com.org.fiiactiv;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.github.barteksc.pdfviewer.PDFView;

public class ViewPDFActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.view_pdf_activity);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        PDFView pdfView = findViewById(R.id.pdfview);
        pdfView.fromAsset("material.pdf").load();
        Button bottomRightButton = findViewById(R.id.btn_send);

        bottomRightButton.setOnClickListener(view -> {
            Intent intent = new Intent(ViewPDFActivity.this, MainActivity.class);
            startActivity(intent);
        });

    }
}
