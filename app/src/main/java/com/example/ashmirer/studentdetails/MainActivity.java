package com.example.ashmirer.studentdetails;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    EditText etRollno;
    TextView tvMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etRollno=findViewById(R.id.etRollno);
        tvMessage=findViewById(R.id.tvMessage);
    }
    public void btnSubmit_Onclick(View v) {

        String data = etRollno.getText().toString();
        if ((data.length() == 10) && (data != null) && (Integer.parseInt(data) != 0)) {
            int batch = Integer.parseInt(data.substring(0, 2));
            int college_code = Integer.parseInt(data.substring(2, 5));
            String college_name;
            String course;
            switch (college_code) {
                case 476:
                    college_name = "Future Institute of Engineering and Techhnology ,Bareilly";
                    break;
                case 14:
                    college_name = "Shri Ram Murti Smarak CET ,Bareilly";
                    break;
                case 15:
                    college_name = "Invertis Institute of Mgmt. Studies ,Bareilly";
                    break;
                case 16:
                    college_name = "RBMI Bareilly";
                    break;
                case 142:
                    college_name = "KCMT Bareilly";
                    break;
                case 191:
                    college_name = "Invertis Institute Bareilly";
                    break;
                case 474:
                    college_name = "SSVGI Bareilly";
                    break;
                case 479:
                    college_name = "Rajshree College of engineering and technology Bareilly";
                    break;
                case 486:
                    college_name = "ANA College Bareilly";
                    break;
                case 566:
                    college_name = "Future Institute of management and technology Bareilly";
                    break;
                default:
                    college_name = "College Details not found";
                    break;
            }
            int branch = Integer.parseInt(data.substring(5, 7));
            switch (branch) {
                case 00:
                    course = "Civil Engg.";
                    break;
                case 10:
                    course = "Computer Science Engg.";
                    break;
                case 13:
                    course = "Information Technology";
                    break;
                case 20:
                    course = "Electrical Engg.";
                    break;
                case 21:
                    course = "Electrical and Electronics Engg.";
                    break;
                case 31:
                    course = "Electronics and communication Engg.";
                    break;
                case 50:
                    course = "Bachelor of Pharmacy";
                    break;
                case 70:
                    course = "MBA";
                    break;
                default:
                    course = "Branch Details Not Found";
                    break;
            }
            int roll_no = Integer.parseInt(data.substring(7, 10));
            String message = "Student Information for the roll_no :" + data + "\n\n "
                    + "Batch :20" + batch + "\n"
                    + "College :" + college_name + "\n"
                    + "Branch :" + course + "\n"
                    + "Class Roll Number :" + roll_no;
            tvMessage.setText(message);
        }
        else{
            String message="Enter Valid AKTU Roll Number";
            tvMessage.setText(message);
        }
    }
}
