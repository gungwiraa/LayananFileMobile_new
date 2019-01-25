package pkg.enkrip;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;

public class MainActivity extends Activity {
    String hasil="" ;
    String isiText ;
    TextView cipherText ;
    TextView plainText ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btEnkrip = (Button)findViewById(R.id.btEnkrip) ;
        Button btDekrip = (Button)findViewById(R.id.bt_dekrip);
        plainText =(TextView)findViewById(R.id.txtPlain);
        cipherText =(TextView)findViewById(R.id.txtCipher);
        // Button Enkrip
        btEnkrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                hasil ="";
                isiText = plainText.getText().toString() ;
                // algoritma enkripsi
                for (int i = 0; i < isiText.length(); i++) {
                    int index = isiText.charAt(i);
                    char s = (char)(index+1) ;
                    hasil = hasil + String.valueOf(s);
                }
                cipherText.setText(hasil);
                plainText.setText(null);
            }
        });
        //Button Dekrip
        btDekrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil = "" ;
                isiText = cipherText.getText().toString();
                // algoritma dekripsi
                for (int i = 0 ; i < isiText.length(); i++) {
                    int index = isiText.charAt(i);
                    char s = (char)(index-1) ;
                    hasil = hasil + String.valueOf(s);
                }
                plainText.setText(hasil);
                cipherText.setText(null);
            }
        });
    }
}