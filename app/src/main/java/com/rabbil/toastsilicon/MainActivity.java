package com.rabbil.toastsilicon;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.rabbil.toastsiliconlibrary.ToastSilicon;
public class MainActivity extends AppCompatActivity {
    private Button toastPrimary1,toastDanger1,toastWarning1,toastInfo1,toastSuccess1;
    private Button toastPrimary2,toastDanger2,toastWarning2,toastInfo2,toastSuccess2;
    private Button toastPrimary3,toastDanger3,toastWarning3,toastInfo3,toastSuccess3;
    private Button toastPrimary4,toastDanger4,toastWarning4,toastInfo4,toastSuccess4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toastPrimary1=findViewById(R.id.toastPrimary1);
        toastDanger1=findViewById(R.id.toastDanger1);
        toastWarning1=findViewById(R.id.toastWarning1);
        toastInfo1=findViewById(R.id.toastInfo1);
        toastSuccess1=findViewById(R.id.toastSuccess1);

        toastPrimary2=findViewById(R.id.toastPrimary2);
        toastDanger2=findViewById(R.id.toastDanger2);
        toastWarning2=findViewById(R.id.toastWarning2);
        toastInfo2=findViewById(R.id.toastInfo2);
        toastSuccess2=findViewById(R.id.toastSuccess2);


        toastPrimary3=findViewById(R.id.toastPrimary3);
        toastDanger3=findViewById(R.id.toastDanger3);
        toastWarning3=findViewById(R.id.toastWarning3);
        toastInfo3=findViewById(R.id.toastInfo3);
        toastSuccess3=findViewById(R.id.toastSuccess3);

        toastPrimary4=findViewById(R.id.toastPrimary4);
        toastDanger4=findViewById(R.id.toastDanger4);
        toastWarning4=findViewById(R.id.toastWarning4);
        toastInfo4=findViewById(R.id.toastInfo4);
        toastSuccess4=findViewById(R.id.toastSuccess4);

        toastPrimary1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               ToastSilicon.toastPrimaryOne(MainActivity.this,"This is toast primary",Toast.LENGTH_SHORT);
            }
        });
        toastDanger1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastSilicon.toastDangerOne(MainActivity.this,"This is toast danger",Toast.LENGTH_SHORT);
            }
        });
        toastWarning1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastSilicon.toastWarningOne(MainActivity.this,"This is toast warning",Toast.LENGTH_SHORT);
            }
        });
        toastInfo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastSilicon.toastInfoOne(MainActivity.this,"This is toast info",Toast.LENGTH_SHORT);
            }
        });
        toastSuccess1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastSilicon.toastSuccessOne(MainActivity.this,"This is toast success",Toast.LENGTH_SHORT);
            }
        });



        toastPrimary2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastSilicon.toastPrimaryTwo(MainActivity.this,"This is toast primary",Toast.LENGTH_SHORT);
            }
        });
        toastDanger2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastSilicon.toastDangerTwo(MainActivity.this,"This is toast danger",Toast.LENGTH_SHORT);
            }
        });
        toastWarning2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastSilicon.toastWarningTwo(MainActivity.this,"This is toast warning",Toast.LENGTH_SHORT);
            }
        });
        toastInfo2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastSilicon.toastInfoTwo(MainActivity.this,"This is toast info",Toast.LENGTH_SHORT);
            }
        });
        toastSuccess2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastSilicon.toastSuccessTwo(MainActivity.this,"This is toast success",Toast.LENGTH_SHORT);
            }
        });




        toastPrimary3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastSilicon.toastPrimaryThree(MainActivity.this,"Primary","This is toast primary",Toast.LENGTH_SHORT);
            }
        });
        toastDanger3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastSilicon.toastDangerThree(MainActivity.this,"Danger","This is toast danger",Toast.LENGTH_SHORT);
            }
        });
        toastWarning3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastSilicon.toastWarningThree(MainActivity.this,"Warning","This is toast warning",Toast.LENGTH_SHORT);
            }
        });
        toastInfo3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastSilicon.toastInfoThree(MainActivity.this,"Info","This is toast info",Toast.LENGTH_SHORT);
            }
        });
        toastSuccess3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastSilicon.toastSuccessThree(MainActivity.this,"Success","This is toast success",Toast.LENGTH_SHORT);
            }
        });




        toastPrimary4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastSilicon.toastPrimaryFour(MainActivity.this,"This is toast primary",Toast.LENGTH_SHORT);
            }
        });
        toastDanger4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastSilicon.toastDangerFour(MainActivity.this,"This is toast danger",Toast.LENGTH_SHORT);
            }
        });
        toastWarning4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastSilicon.toastWarningFour(MainActivity.this,"This is toast warning",Toast.LENGTH_SHORT);
            }
        });
        toastInfo4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastSilicon.toastInfoFour(MainActivity.this,"This is toast info",Toast.LENGTH_SHORT);
            }
        });
        toastSuccess4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastSilicon.toastSuccessFour(MainActivity.this,"This is toast success",Toast.LENGTH_SHORT);
            }
        });


    }
}
