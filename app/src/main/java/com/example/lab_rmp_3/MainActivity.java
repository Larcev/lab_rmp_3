package com.example.lab_rmp_3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Массив с drawable-ресурсами для переключения изображений
    private int[] images = {R.drawable.sample_image1, R.drawable.sample_image2, R.drawable.sample_image3};
    private int currentImageIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Переключатель: true – показать просмотр изображений,
        // false – показать окно чата (LinearLayout)
        boolean showImageViewer = true; // Измените на false для демонстрации окна чата

        if (showImageViewer) {
            setContentView(R.layout.activity_image_viewer);
            ImageView imageView = findViewById(R.id.imageView);
            ImageButton btnChangeImage = findViewById(R.id.btnChangeImage);

            btnChangeImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Циклически переключаем изображение
                    currentImageIndex = (currentImageIndex + 1) % images.length;
                    imageView.setImageResource(images[currentImageIndex]);
                }
            });
        } else {
            // Для демонстрации окна чата с LinearLayout
            setContentView(R.layout.activity_main_linear);

            // Пример обработки нажатия кнопки "Отправить"
            Button btnSend = findViewById(R.id.btnSend);
            btnSend.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Логика отправки сообщения
                }
            });
        }
    }
}
