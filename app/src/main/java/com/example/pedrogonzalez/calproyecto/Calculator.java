package com.example.pedrogonzalez.calproyecto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Calculator extends AppCompatActivity {

    public static final String ZERO = "0";
    public static final String ONE = "1";
    public static final String TWO = "2";
    public static final String THREE = "3";
    public static final String FOUR = "4";
    public static final String FIVE = "5";
    public static final String SIX = "6";
    public static final String SEVEN = "7";
    public static final String EIGHT = "8";
    public static final String NINE = "9";
    public static final String POINT = ".";


    Button zero, one, two, three, four,
            five, six, seven, eight, nine,
            point, sign, product, divide, minus,
            plus, erase, equals, history, clean;

    int op, pos = 0, p = 0;

    double num1, num2;
    TextView exit;
    String InComing;
    String past[] = new String[5];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular);

        history = (Button) findViewById(R.id.button_history);
        history.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                InComing = past[0];
                exit.setText(InComing);
            }
        });

        point = (Button) findViewById(R.id.button_point);
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p < 1) {
                    p++;
                    exit = (TextView) findViewById(R.id.screen);

                    InComing = exit.getText().toString() + POINT;
                  
                    InComing  = exit.getText().toString() + POINT;
                  
                    exit.setText(InComing);
                }
            }
        });

        zero = (Button) findViewById(R.id.button_0);
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                InComing = exit.getText().toString() + ZERO;
                exit.setText(InComing);
            }
        });

        one = (Button) findViewById(R.id.button_1);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                InComing = exit.getText().toString() + ONE;
                exit.setText(InComing);
            }
        });

        two = (Button) findViewById(R.id.button_2);
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                InComing = exit.getText().toString() + TWO;
                exit.setText(InComing);
            }
        });

        three = (Button) findViewById(R.id.button_3);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                InComing = exit.getText().toString() + THREE;
                exit.setText(InComing);

            }
        });
        four = (Button) findViewById(R.id.button_4);
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                InComing = exit.getText().toString() + FOUR;
                exit.setText(InComing);
            }
        });

        five = (Button) findViewById(R.id.button_5);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                InComing = exit.getText().toString() + FIVE;
                exit.setText(InComing);
            }
        });

        six = (Button) findViewById(R.id.button_6);
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                InComing = exit.getText().toString() + SIX;
                exit.setText(InComing);

            }
        });

        seven = (Button) findViewById(R.id.button_7);
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                InComing = exit.getText().toString() + SEVEN;
                exit.setText(InComing);

            }
        });

        eight = (Button) findViewById(R.id.button_8);
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                InComing = exit.getText().toString() + EIGHT;
                exit.setText(InComing);

            }
        });

        nine = (Button) findViewById(R.id.button_9);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                InComing = exit.getText().toString() + NINE;
                exit.setText(InComing);

            }
        });

        clean = (Button) findViewById(R.id.clean);
        clean.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit.setText("");
                p = 0;
                num1 = 0;
                num2 = 0;
            }


        });

        erase = (Button) findViewById(R.id.button_back);
        erase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                if (exit.getText().length() > 0) {
//                    if(true)
                    InComing = InComing.substring(0, exit.getText().length() - 1);
                    exit.setText(InComing);
                }
            }
        });

        plus = (Button) findViewById(R.id.button_plus);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                if (exit.getText().length() > 0 && !exit.getText().equals(POINT)) {

                    op = 1;
                    num1 = Double.valueOf(exit.getText().toString());
                    exit.setText("");
                    p = 0;
                }
            }
        });


        minus = (Button) findViewById(R.id.button_minus);
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                if (exit.getText().length() > 0 && !exit.getText().equals(POINT)) {
                    op = 2;
                    num1 = Double.valueOf(exit.getText().toString());
                    exit.setText("");
                    p = 0;
                }
            }
        });


        product = (Button) findViewById(R.id.button_product);
        product.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                if (exit.getText().length() > 0 && !exit.getText().equals(POINT)) {
                    op = 3;
                    num1 = Double.valueOf(exit.getText().toString());
                    exit.setText("");
                    p = 0;
                }
            }
        });


        divide = (Button) findViewById(R.id.button_divide);
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);
                if (exit.getText().length() > 0 && !exit.getText().equals(POINT)) {
                    op = 4;
                    num1 = Double.valueOf(exit.getText().toString());
                    exit.setText("");
                    p = 0;
                }
            }
        });

        sign = (Button) findViewById(R.id.button_sign);
        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exit = (TextView) findViewById(R.id.screen);

                if (exit.getText().length() > 0 && !exit.getText().equals(POINT)) {
                    num2 = Double.valueOf(exit.getText().toString()) * (-1);
                    exit.setText(String.valueOf(num2));
                }
            }
        });

        equals = (Button) findViewById(R.id.button_equal);

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                exit = (TextView) findViewById(R.id.screen);
                pos = 0;

                if (exit.getText().length() > 0 && !exit.getText().equals(POINT)) {
                    num2 = Double.valueOf(exit.getText().toString());

                    if (op == 1) {
                        InComing = String.valueOf(plus(num1, num2));
                    }

                    if (op == 2) {
                        InComing = String.valueOf(minus(num1, num2));
                    }

                    if (op == 3) {
                        InComing = String.valueOf(product(num1, num2));
                    }

                    if (op == 4) {
                        InComing = (divide(num1, num2));
                    }
                    exit.setText(InComing);
                }
            }
        });
    }

    private double plus(double a, double b) {
        double result;
        result = a + b;
        String his = String.format("%s+%s = %s", a, b, result);
        past[pos] = his;

        return result;
    }

    private double minus(double a, double b) {
        double result;

        result = a - b;
        String his = String.format("%s-%s = %s", a, b, result);
        past[pos] = his;
        return result;
    }

    private double product(double a, double b) {
        double result;

        result = a * b;
        String his = String.format("%s*%s = %s", a, b, result);
        past[0] = his;
        return result;
    }

    private String divide(double a, double b) {
        double result;
        String data;
        if (b != 0) {
            result = a / b;
            data = String.valueOf(result);
            String his = String.format("%s/%s = %s", a, b, result);
            past[pos] = his;
        } else {
            data = ("Error");
        }
        return data;
    }
}