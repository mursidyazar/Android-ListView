package org.kod5.android;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private ListView listView;
	//�lleri diziye koyuyoruz.
	private String[] iller = {"01 Adana","02 Ad�yaman","03 Afyon","04 A�r�","05 Amasya","06 Ankara","07 Antalya","08 Artvin",
			"09 Ayd�n","10 Bal�kesir","11 Bilecik","12 Bing�l","13 Bitlis","14 Bolu","15 Burdur","16 Bursa","17 �anakkale",
			"18 �ank�r�","19 �orum","20 Denizli","21 Diyarbak�r","22 Edirne","23 Elaz��","24 Erzincan","25 Erzurum","26 Eski�ehir",
			"27 Gaziantep","28 Giresun","29 G�m��hane","30 Hakkari","31 Hatay","32 Isparta","33 ܍el","34 �stanbul","35 �zmir",
			"36 Kars","37 Kastamonu","38 Kayseri","39 K�rklareli","40 K�r�ehir","41 Kocaeli","42 Konya","43 K�tahya","44 Malatya",
			"45 Manisa","46 K.mara�","47 Mardin","48 Mu�la","49 Mu�","50 Nev�ehir","51 Ni�de","52 Ordu","53 Rize","54 Sakarya",
			"55 Samsun","56 Siirt","57 Sinop","58 Sivas","59 Tekirda�","60 Tokat","61 Trabzon","62 Tunceli","63 �anl�urfa","64 U�ak",
			"65 Van","66 Yozgat","67 Zonguldak","68 Aksaray","69 Bayburt","70 Karaman","71 K�r�kkale","72  Batman","73 ��rnak",
			"74 Bart�n","75 Ardahan","76 I�d�r","77 Yalova","78 Karab�k","79 Kilis","80 Osmaniye","81 D�zce"};
	
    @Override
    protected void onCreate(Bundle savedInstanceState) { //Bu metod uygulama a��ld���nda �al��t�r�lan metod.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);     
        
        //listView'i tasar�mdakiyle ba�l�yoruz.
        listView = (ListView)findViewById(R.id.listView1);
        
        //ArrayAdapter'i haz�rl�yoruz.
        ArrayAdapter<String> adapter = new  ArrayAdapter<String>(this, 
        		android.R.layout.simple_list_item_1, android.R.id.text1, iller);
        
        //listView i�in haz�rlad���m�z adapter'i ayarl�yoruz.
        listView.setAdapter(adapter);
        
        //Listede bir sat�ra t�kland���nda yakal�yoruz.
        listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				
				Toast.makeText(getApplicationContext(),iller[position], Toast.LENGTH_LONG).show();

			}
		});
    }
}
