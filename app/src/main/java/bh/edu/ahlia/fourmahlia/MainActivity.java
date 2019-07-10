package bh.edu.ahlia.fourmahlia;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {


    RadioGroup rg1, rg2;

    EditText firstName, scoundName, thirdName, SureName, dateofbirth, countryofbirth, cpr, nationalty, passportnumber, passportexpiry, religion, maritial, mothername, house, building, road, block, area, country, house1, building1, road1, block1, area1, country1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        rg1 = findViewById( R.id.rg1 );
        rg2 = findViewById( R.id.rg2 );
        firstName = findViewById( R.id.txtFN );
        scoundName = findViewById( R.id.txtSN );
        thirdName = findViewById( R.id.txtTN );
        SureName = findViewById( R.id.txtSUN );
        dateofbirth = findViewById( R.id.txtDOB );
        countryofbirth = findViewById( R.id.txtCOB );
        cpr = findViewById( R.id.txtCPR );
        nationalty = findViewById( R.id.txtNa );
        passportnumber = findViewById( R.id.txtPas );
        passportexpiry = findViewById( R.id.txtpassNa );
        religion = findViewById( R.id.txtReg );
        maritial = findViewById( R.id.txtMS );
        mothername = findViewById( R.id.txtMoN );
        house = findViewById( R.id.txthf1 );
        house1 = findViewById( R.id.txthf2 );
        building = findViewById( R.id.txtbuild );
        building1 = findViewById( R.id.txtbuild2 );
        road = findViewById( R.id.txtroad );
        road1 = findViewById( R.id.txtroad2 );
        block = findViewById( R.id.txtblock );
        block1 = findViewById( R.id.txtblock1 );
        area = findViewById( R.id.txtarea );
        area1 = findViewById( R.id.txtarea1 );
        country = findViewById( R.id.txtcoun );
        country1 = findViewById( R.id.txtcoun1 );

    }

    public void clear(View view) {
        rg1.clearCheck();
        rg2.clearCheck();
        firstName.setText("");
        scoundName.setText("");
        thirdName.setText("");
        SureName.setText("");
        dateofbirth.setText("");
        countryofbirth.setText("");
        cpr.setText("");
        nationalty.setText("");
        passportnumber.setText("");
        passportexpiry.setText("");
        religion.setText("");
        maritial.setText("");
        mothername.setText("");
        house.setText("");
        house1.setText("");
        building.setText("");
        building1.setText("");
        road.setText("");
        road1.setText("");
        block.setText("");
        block1.setText("");
        area.setText("");
        area1.setText("");
        country.setText("");
        country1.setText("");
        Toast.makeText(getApplicationContext(),"Clear", Toast.LENGTH_SHORT).show();


    }

    public void Submit(View view) {

        if (firstName.length() == 0 || scoundName.length() == 0 || SureName.length() == 0 || dateofbirth.length() == 0 || countryofbirth.length() == 0 || cpr.length() == 0 || nationalty.length() == 0
                || passportnumber.length() == 0 || passportexpiry.length() == 0 || religion.length() == 0 || maritial.length() == 0 || mothername.length() == 0
                || house.length() == 0 || building.length() == 0 || road.length() == 0 || block.length() == 0 || area.length() == 0
                || country.length() == 0){

            Toast.makeText( getApplicationContext(), "Please fill the blanks", Toast.LENGTH_SHORT ).show();


        } else {

            rg1.clearCheck();
            rg2.clearCheck();
            firstName.setText("");
            scoundName.setText("");
            thirdName.setText("");
            SureName.setText("");
            dateofbirth.setText("");
            countryofbirth.setText("");
            cpr.setText("");
            nationalty.setText("");
            passportnumber.setText("");
            passportexpiry.setText("");
            religion.setText("");
            maritial.setText("");
            mothername.setText("");
            house.setText("");
            house1.setText("");
            building.setText("");
            building1.setText("");
            road.setText("");
            road1.setText("");
            block.setText("");
            block1.setText("");
            area.setText("");
            area1.setText("");
            country.setText("");
            country1.setText("");
            Toast.makeText(getApplicationContext(),"All information Valid", Toast.LENGTH_SHORT).show();

        }
    }
}