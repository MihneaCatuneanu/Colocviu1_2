package ro.pub.cs.systems.eim.Colocviu1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Colocviul_2SecondaryActivity extends AppCompatActivity {

    private EditText nexterm;
    private EditText allterms;
    private Button addButton;
    private Button computeButton;
    int suma = 0;


    private ButtonClickListener buttonClickListener = new ButtonClickListener();
    private class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {

            switch(view.getId()) {
                case R.id.add_button:
                    int numar_introdus = Integer.valueOf(nexterm.getText().toString());
                    suma = suma + numar_introdus;
                    break;
                case R.id.compute_button:
                    computeButton.setText(String.valueOf(suma));


            }
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_2_main);

        nexterm = (EditText)findViewById(R.id.next_term);
        allterms = (EditText)findViewById(R.id.all_terms);
        addButton = (Button)findViewById(R.id.add_button);
        computeButton = (Button)findViewById(R.id.compute_button);
        addButton.setOnClickListener(buttonClickListener);
        computeButton.setOnClickListener(buttonClickListener);



    }
}