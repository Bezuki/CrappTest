package crapp.com.crapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class JustWorkPlease extends Activity {

    List<String> spinnerArray =  new ArrayList<String>();
    String nameText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_just_work_please);

        setRoleSpinner();
    }

    public void testClick(View view){
        System.out.println("The button works");
        setContentView(R.layout.activity_map_view);
        EditText inputTxt = (EditText) findViewById(R.id.editText);
        //nameText = inputTxt.getText().toString();

    }
    public void testClick2(View view){
        System.out.println("The button works");
        setContentView(R.layout.activity_just_work_please);
        EditText inputTxt = (EditText) findViewById(R.id.editText);
        inputTxt.setText("Test String");
        setRoleSpinner2();
    }

    public void setRoleSpinner(){
        spinnerArray.add("Leader");
        spinnerArray.add("Captain");
        spinnerArray.add("Master");
        spinnerArray.add("General");
        spinnerArray.add("Fuhrer");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, spinnerArray);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner sItems = (Spinner) findViewById(R.id.spinner);
        sItems.setAdapter(adapter);
    }
    //setRoleSpinner is used for initial setup, will change this later...probably
    public void setRoleSpinner2(){
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item, spinnerArray);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner sItems = (Spinner) findViewById(R.id.spinner);
        sItems.setAdapter(adapter);
    }
    public void popUpJesus(View view){
        startActivity(new Intent(JustWorkPlease.this, MapsActivity.class));
        System.out.println("popupplease");
    }

}
