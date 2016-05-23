package com.example.jhoan.toastshow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

public final class ToastShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toast_show_activity);
        Button showButton = (Button) findViewById(R.id.toast_show_button);
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ToastShowActivity.this, "TOAST!!!", Toast.LENGTH_SHORT).show();
            }
        });

        ImageView imageView = (ImageView) findViewById(R.id.toast_show_image);

        DisplayImageOptions options = new DisplayImageOptions.Builder()
                .cacheInMemory(true)
                .cacheOnDisk(true)
                .showImageOnLoading(0)
                .build();

        ImageLoaderConfiguration config = new ImageLoaderConfiguration.Builder(this)
                .defaultDisplayImageOptions(options)
                .build();
        ImageLoader imageLoader = ImageLoader.getInstance();
        imageLoader.init(config);

        imageLoader.displayImage("https://i.ytimg.com/vi/4Q8_TbNdGnI/maxresdefault.jpg", imageView);
    }
}
