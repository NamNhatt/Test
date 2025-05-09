package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {
    EditText edt_nhap;
    TextView tv_kq;
    Button btn_xoa, num7, num8, num9, div, num4, num5, num6, mul, num1, num2, num3, minus, dot, num0, equal, plus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_nhap = findViewById(R.id.edt_nhap);
        tv_kq = findViewById(R.id.tv_kq);
        btn_xoa = findViewById(R.id.btn_xoa);

        num0 = findViewById(R.id.num0);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        num4 = findViewById(R.id.num4);
        num5 = findViewById(R.id.num5);
        num6 = findViewById(R.id.num6);
        num7 = findViewById(R.id.num7);
        num8 = findViewById(R.id.num8);
        num9 = findViewById(R.id.num9);

        dot = findViewById(R.id.dot);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        minus = findViewById(R.id.minus);
        equal = findViewById(R.id.equal);
        plus = findViewById(R.id.plus);

        btn_xoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt_nhap.setText("");
                tv_kq.setText("0");
            }
        });
        num0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt_nhap.setText(edt_nhap.getText() + "0");
            }
        });
        num1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt_nhap.setText(edt_nhap.getText() + "1");
            }
        });
        num2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt_nhap.setText(edt_nhap.getText() + "2");
            }
        });
        num3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt_nhap.setText(edt_nhap.getText() + "3");
            }
        });
        num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt_nhap.setText(edt_nhap.getText() + "4");
            }
        });
        num5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt_nhap.setText(edt_nhap.getText() + "5");
            }
        });
        num6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt_nhap.setText(edt_nhap.getText() + "6");
            }
        });
        num7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt_nhap.setText(edt_nhap.getText() + "7");
            }
        });
        num8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt_nhap.setText(edt_nhap.getText() + "8");
            }
        });
        num9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt_nhap.setText(edt_nhap.getText() + "9");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt_nhap.setText(edt_nhap.getText() + "+");
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt_nhap.setText(edt_nhap.getText() + "-");
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt_nhap.setText(edt_nhap.getText() + "*");
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt_nhap.setText(edt_nhap.getText() + "÷");
            }
        });
        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edt_nhap.setText(edt_nhap.getText() + ".");
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String chuoi = edt_nhap.getText().toString();
                chuoi = chuoi.replaceAll("÷", "/");
                Expression exp = new ExpressionBuilder(chuoi).build();
                double kq = exp.evaluate();
                DecimalFormat df = new DecimalFormat("#.##");
                String formattedResult = df.format(kq);
                tv_kq.setText(String.valueOf(formattedResult));
            }
        });


    }
}