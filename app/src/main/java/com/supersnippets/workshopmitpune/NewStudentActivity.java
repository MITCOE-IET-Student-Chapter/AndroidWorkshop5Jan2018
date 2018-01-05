package com.supersnippets.workshopmitpune;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import com.supersnippets.workshopmitpune.databinding.ActivityNewStudentBinding;

public class NewStudentActivity extends AppCompatActivity {
    private static final String TAG = "NewStudentActivity";
    ActivityNewStudentBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_new_student);

        //EditText edtAge = findViewById(R.id.edtAge);
        //binding.edtAge

        binding.btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: ");
            }
        });
    }
}
