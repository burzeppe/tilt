package com.example.tilt;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int len =110;
    Button[] batons = new Button[len];
    void MakeButtons(){
        batons[0] = findViewById(R.id.button1);
        batons[1] = findViewById(R.id.button2);
        batons[2] = findViewById(R.id.button3);
        batons[3] = findViewById(R.id.button4);
        batons[4] = findViewById(R.id.button5);
        batons[5] = findViewById(R.id.button6);
        batons[6] = findViewById(R.id.button7);
        batons[7] = findViewById(R.id.button8);
        batons[8] = findViewById(R.id.button9);
        batons[9] = findViewById(R.id.button10);
        batons[10] = findViewById(R.id.button11);
        batons[11] = findViewById(R.id.button12);
        batons[12] = findViewById(R.id.button13);
        batons[13] = findViewById(R.id.button14);
        batons[14] = findViewById(R.id.button15);
        batons[15] = findViewById(R.id.button16);
        batons[16] = findViewById(R.id.button17);
        batons[17] = findViewById(R.id.button18);
        batons[18] = findViewById(R.id.button19);
        batons[19] = findViewById(R.id.button20);
        batons[20] = findViewById(R.id.button21);
        batons[21] = findViewById(R.id.button22);
        batons[22] = findViewById(R.id.button23);
        batons[23] = findViewById(R.id.button24);
        batons[24] = findViewById(R.id.button25);
        batons[25] = findViewById(R.id.button26);
        batons[26] = findViewById(R.id.button27);
        batons[27] = findViewById(R.id.button28);
        batons[28] = findViewById(R.id.button29);
        batons[29] = findViewById(R.id.button30);
        batons[30] = findViewById(R.id.button31);
        batons[31] = findViewById(R.id.button32);
        batons[32] = findViewById(R.id.button33);
        batons[33] = findViewById(R.id.button34);
        batons[34] = findViewById(R.id.button35);
        batons[35] = findViewById(R.id.button36);
        batons[36] = findViewById(R.id.button37);
        batons[37] = findViewById(R.id.button38);
        batons[38] = findViewById(R.id.button39);
        batons[39] = findViewById(R.id.button40);
        batons[40] = findViewById(R.id.button41);
        batons[41] = findViewById(R.id.button42);
        batons[42] = findViewById(R.id.button43);
        batons[43] = findViewById(R.id.button44);
        batons[44] = findViewById(R.id.button45);
        batons[45] = findViewById(R.id.button46);
        batons[46] = findViewById(R.id.button47);
        batons[47] = findViewById(R.id.button48);
        batons[48] = findViewById(R.id.button49);
        batons[49] = findViewById(R.id.button50);
        batons[50] = findViewById(R.id.button51);
        batons[51] = findViewById(R.id.button52);
        batons[52] = findViewById(R.id.button53);
        batons[53] = findViewById(R.id.button54);
        batons[54] = findViewById(R.id.button55);
        batons[55] = findViewById(R.id.button56);
        batons[56] = findViewById(R.id.button57);
        batons[57] = findViewById(R.id.button58);
        batons[58] = findViewById(R.id.button59);
        batons[59] = findViewById(R.id.button61);
        batons[60] = findViewById(R.id.button62);
        batons[61] = findViewById(R.id.button63);
        batons[62] = findViewById(R.id.button64);
        batons[63] = findViewById(R.id.button65);
        batons[64] = findViewById(R.id.button66);
        batons[65] = findViewById(R.id.button67);
        batons[66] = findViewById(R.id.button68);
        batons[67] = findViewById(R.id.button69);
        batons[68] = findViewById(R.id.button70);
        batons[69] = findViewById(R.id.button71);
        batons[70] = findViewById(R.id.button72);
        batons[71] = findViewById(R.id.button73);
        batons[72] = findViewById(R.id.button74);
        batons[73] = findViewById(R.id.button75);
        batons[74] = findViewById(R.id.button76);
        batons[75] = findViewById(R.id.button77);
        batons[76] = findViewById(R.id.button78);
        batons[77] = findViewById(R.id.button79);
        batons[78] = findViewById(R.id.button80);
        batons[79] = findViewById(R.id.button81);
        batons[80] = findViewById(R.id.button85);
        batons[81] = findViewById(R.id.button86);
        batons[82] = findViewById(R.id.button87);
        batons[83] = findViewById(R.id.button88);
        batons[84] = findViewById(R.id.button89);
        batons[85] = findViewById(R.id.button90);
        batons[86] = findViewById(R.id.button91);
        batons[87] = findViewById(R.id.button92);
        batons[88] = findViewById(R.id.button93);
        batons[89] = findViewById(R.id.button94);
        batons[90] = findViewById(R.id.button95);
        batons[91] = findViewById(R.id.button96);
        batons[92] = findViewById(R.id.button97);
        batons[93] = findViewById(R.id.button98);
        batons[94] = findViewById(R.id.button99);
        batons[95] = findViewById(R.id.button100);
        batons[96] = findViewById(R.id.button101);
        batons[97] = findViewById(R.id.button102);
        batons[98] = findViewById(R.id.button103);
        batons[99] = findViewById(R.id.button107);
        batons[100] = findViewById(R.id.button108);
        batons[101] = findViewById(R.id.button109);
        batons[102] = findViewById(R.id.button110);
        batons[103] = findViewById(R.id.button111);
        batons[104] = findViewById(R.id.button112);
        batons[105] = findViewById(R.id.button113);
        batons[106] = findViewById(R.id.button114);
        batons[107] = findViewById(R.id.button115);
        batons[108] = findViewById(R.id.button116);
        batons[109] = findViewById(R.id.button117);
    }
    int TrueButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MakeButtons();
        for (int i = 0; i < len; i++) {
            batons[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    batons[TrueButton].setClickable(false);
                    batons[TrueButton].setBackgroundColor(Color.RED);
                    TrueButton = getRandom(len);
                    batons[TrueButton].setClickable(true);
                    batons[TrueButton].setBackgroundColor(0xffd10000);
                }
            });
        }
        for (int i = 0; i < len; i++) {
            batons[i].setBackgroundColor(Color.RED);
            batons[i].setClickable(false);
        }
        TrueButton = getRandom(len);
        batons[TrueButton].setClickable(true);
        batons[TrueButton].setBackgroundColor(0xffd10000);
    }
    public static int getRandom(int len) {
        int a=(int)(Math.random()*len);
        return a;
    }




}