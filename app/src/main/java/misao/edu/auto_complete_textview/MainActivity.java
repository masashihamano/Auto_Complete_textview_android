package misao.edu.auto_complete_textview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    AutoCompleteTextView autoCompleteTextView1, autoCompleteTextView2,autoCompleteTextView3 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        autoCompleteTextView1 = findViewById( R.id.autoTv1 );
        autoCompleteTextView2 = findViewById( R.id.autoTv2 );
        autoCompleteTextView3 = findViewById( R.id.autoTv3 );


        String country[] = {"Afghanistan", "Albania", "Algeria", "American Samoa","Bermuda", "Bhutan", "Bolivia", "Bosnia and Herzegovina", "Botswana", "Bouvet Island",
                "Cambodia", "Cameroon", "Canada", "Cape Verde", "Cayman Islands", "Central African Republic", "Chad", "Chile", "China", "Christmas Island"};

        String number[] = {"170.1","170.2","170.3","170.4","170.5","170.6","170.7","170.8","170.9","171.0","171.1","171.2","171.3","171.4","171.5","171.6","171.7","171.8","171.9","172.0"};

        String blood[] = {"A","B","O","AB"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>( this,R.layout.support_simple_spinner_dropdown_item,country );
        autoCompleteTextView1.setAdapter( arrayAdapter );
        autoCompleteTextView1.setThreshold( 1 );

        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>( this,R.layout.support_simple_spinner_dropdown_item,number );
        autoCompleteTextView2.setAdapter( arrayAdapter2 );
        autoCompleteTextView2.setThreshold( 2 );//デフォルトで2文字目が設定されているので無くても良い

        ArrayAdapter<String> arrayAdapter3 = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,blood );
        autoCompleteTextView3.setAdapter( arrayAdapter3 );
        autoCompleteTextView3.setThreshold( 1 );

    }
}


/*
main.xmlでTextViewとAutoCompleteTextViewを作成
AutoCompleteTextViewを宣言、初期化しデータ（配列）を準備
ArrayAdapterを<String>でインスタンス化し、R.layout.support_simple_spinner_dropdown_itemを入れる
autoCompleteTextViewに表示
 */