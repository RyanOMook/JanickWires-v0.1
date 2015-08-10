package ryanmullings.janickwires;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.TextView;


public class MyActivity extends Activity {
    //Variables
    String sNum;
    double cost;
    int color; // 1- Red, 2-black, 3-Blue
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        Button add = (Button)this.findViewById(R.id.button); //Create button
        final TextView ans = (TextView)this.findViewById(R.id.listnum);
        Button remove = (Button)this.findViewById(R.id.button2); //Create button


        //Clear the list
        remove.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { //When clicked
                ans.setText("");
            }
                                  });

        //add to the list
        add.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) { //When clicked
                    EditText num = (EditText) findViewById(R.id.numb); //Gets the value that was entered
                    sNum = num.getText().toString();
                    cost = Double.parseDouble(num.getText().toString());
                    //check the color of the number before adding
                    if(cost % 2 == 0){
                        //If the number is even
                        if(cost ==2 ||cost == 8 ||cost == 14 ||cost == 20 ||cost == 26 ||cost == 32 ||cost == 38 ||cost == 44 ||cost == 50 ||cost == 56 ||cost == 62 ||cost == 68 ||cost == 74 ||cost == 80 ||cost == 86 ||cost == 92 ||cost == 98) {
                            color = 1;
                        }
                        else if(cost ==4 ||cost == 10 ||cost == 16 ||cost == 22 ||cost == 28 ||cost == 34 ||cost == 40 ||cost == 46 ||cost == 52 ||cost == 58 ||cost == 64 ||cost == 70 ||cost == 76 ||cost == 82 ||cost == 88 ||cost == 94 ||cost == 100) {
                            color = 2;
                        }
                        else{
                            color = 3;
                        }

                    }
                    else{
                        //If the number is odd
                        if(cost ==1 ||cost == 7 ||cost == 13 ||cost == 19 ||cost == 25 ||cost == 31 ||cost == 37 ||cost == 43 ||cost == 49 ||cost == 55 ||cost == 61 ||cost == 67 ||cost == 73 ||cost == 79 ||cost == 85 ||cost == 91 ||cost == 97) {
                            color = 1;
                        }
                        else if(cost ==3 ||cost == 9 ||cost == 15 ||cost == 21 ||cost == 27 ||cost == 33 ||cost == 39 ||cost == 45 ||cost == 51 ||cost == 57 ||cost == 63 ||cost == 69 ||cost == 75 ||cost == 81 ||cost == 87 ||cost == 93 ||cost == 99) {
                            color = 2;
                        }
                        else{
                            color = 3;
                        }

                    }
                    addList(ans,sNum,color);


    }

});
    }

    public void addList(TextView a, String b, int c){
        if(c ==1) {
            a.append(b + "-Red" +",");
        }
        else if (c ==2){
            a.append(b + "-Black" +",");
        }
        else{
            a.append(b + "-Blue" +",");
        }

    }
}
