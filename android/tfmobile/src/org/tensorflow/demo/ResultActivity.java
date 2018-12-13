package org.tensorflow.demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends Activity{

    private ImageView animal_image;
    private TextView content;
    private TextView animal_face;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        animal_image = (ImageView) findViewById(R.id.animal_image);

        content = (TextView) findViewById(R.id.content);

        animal_face = (TextView) findViewById(R.id.animal_face);

        String result = getIntent().getStringExtra("result");

        if(result.contains("cat")){
            animal_face.setText("고양이상입니다.");
            animal_image.setImageResource(R.drawable.cat);
            content.setText(getResources().getText(R.string.cat_content));
        }
        else if(result.contains("dog")){
            animal_face.setText("강아지상입니다.");
            animal_image.setImageResource(R.drawable.dog);
            content.setText(getResources().getText(R.string.dog_content));
        }
        else if(result.contains("fox")){
            animal_face.setText("여우상입니다.");
            content.setText(getResources().getText(R.string.fox_content));
        }
        else if(result.contains("deer")){
            animal_face.setText("사슴상입니다.");
            animal_image.setImageResource(R.drawable.deer);
            content.setText(getResources().getText(R.string.deer_content));
        }
        else if(result.contains("bear")){
            animal_face.setText("곰상입니다.");
            animal_image.setImageResource(R.drawable.bear);
            content.setText(getResources().getText(R.string.bear_content));
        }
//
//        t_result = (TextView) findViewById(R.id.t_result);
//
//        t_result.setText(result);

    }

}
