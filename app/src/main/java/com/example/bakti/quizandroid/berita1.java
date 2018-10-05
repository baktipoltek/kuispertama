package com.example.bakti.quizandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class berita1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berita1);
    }
    <ImageView
        android:id="@+id/imageView"
        android:layout_width="341dp"
        android:layout_height="483dp"
        app:srcCompat="@drawable/ber1"
        tools:layout_editor_absoluteX="22dp"
        tools:layout_editor_absoluteY="42dp" />

    <TextView
        android:id="@+id/textView"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="TextView"
        tools:layout_editor_absoluteX="81dp"
        tools:layout_editor_absoluteY="128dp" />

    <TextView
        android:id="@+id/textView11"
        android:layout_width="215dp"
        android:layout_height="78dp"
        android:text="PESAWAT ASING "
        tools:layout_editor_absoluteX="81dp"
        tools:layout_editor_absoluteY="121dp" />
</android.support.constraint.ConstraintLayout>
}
