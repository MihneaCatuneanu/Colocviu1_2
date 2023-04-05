package ro.pub.cs.systems.eim.Colocviu1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Colocviul1_2MainActivity extends AppCompatActivity {

    private EditText nexterm;
    private EditText allterms;
    private Button addButton;
    private Button computeButton;


    private ButtonClickListener buttonClickListener = new ButtonClickListener();
    private class ButtonClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {


            switch(view.getId()) {
                case R.id.add_button:
                    int numar_introdus = Integer.valueOf(nexterm.getText().toString());

                    allterms.setText(String.valueOf(numar_introdus) + " + " );
//                    allterms.setText(String.valueOf("+"));
                    break;


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



    }
}