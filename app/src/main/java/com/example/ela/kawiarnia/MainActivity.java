package com.example.ela.kawiarnia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import butterknife.BindView;
import butterknife.OnClick;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txt_edittext)
    EditText Edit_Cofee ;

    @BindView(R.id.btn_wybierzdanie)
    Button btn_wybierzdanie ;

    @BindView(R.id.btn_zamow)
    Button btn_zamow;

    @BindView(R.id.txt_longtex)
    TextView txt_longtex;

    @BindView(R.id.txt_welcomtocafee)
    TextView txt_welcometocafee;

    @OnClick(R.id.btn_wybierzdanie)
    void onClick1(View view){

        Intent intent = new Intent( MainActivity.this, Main2Activity.class);
        Bundle bundle = new Bundle();
        String wpisanyTekst = Edit_Cofee.getText().toString();
        bundle.putString("KEY", wpisanyTekst);
        intent.putExtras(bundle);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
