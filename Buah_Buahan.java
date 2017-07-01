package com.zadi.kosakataarab;


import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Gallery.LayoutParams;
import android.widget.ViewSwitcher.ViewFactory;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.media.MediaPlayer;
import android.view.View.OnClickListener;


public class Buah_Buahan extends Activity implements ViewFactory {
//tottal 36 buah kosakata
	Integer[] imageIDs = {
R.drawable.apel,R.drawable.manggis,R.drawable.anggur,R.drawable.chery,R.drawable.lemon,
R.drawable.jeruk,R.drawable.kelapa,R.drawable.mangga,R.drawable.melon,R.drawable.nanas,
R.drawable.pisang,R.drawable.semangka,R.drawable.salak,	R.drawable.sirsak,R.drawable.pepaya,
R.drawable.strawberry,R.drawable.buah_naga,R.drawable.belimbing,R.drawable.kurma,R.drawable.alpukat,
R.drawable.rambutan,R.drawable.kelengkeng,R.drawable.mengkudu,R.drawable.pir,R.drawable.persik,
R.drawable.durian,R.drawable.nangka,R.drawable.jambu,R.drawable.zaitun,R.drawable.delima,
R.drawable.aprikot,R.drawable.kiwi,R.drawable.leci,R.drawable.duku,R.drawable.berry,
R.drawable.coklat
	};
	String[] txt = {	
"Apel","Manggis","Anggur","Chery","Lemon",
"Jeruk","Kelapa","Mangga","Melon","Nanas",
"Pisang","Semangka","Salak","Sirsak","Pepaya",
"Strawberry","Buah Naga","Belimbing","Kurma","Alpukat",
"Rambutan","Kelengkeng","Mengkudu","Buah Pir","Persik",
"Durian","Nangka","Jambu","Zaitun","Delima",
"Aprikot","Kiwi","Leci","Duku","Berry",
"Coklat"
	};
	String[] txtarab = {
"تُفَّاحٌ","مَانْغُوسْتِيْن","نَبِيْذٌ","شَيْرِيْ","لَيْمُوْنٌ",
"اَلبُرْتُقَالِيُّ","جُوزَةُالْهِنْد","مَانْجُوْ","شَمَامٌ","اَنَانَاسْ",
"مَوْزٌ","بِطّيْخْ","لِحَاءٌ","قَشْطَةٌ شَائِكَةْ","بَابَايَا",
"فَرَاوِلَةْ","فَاكِهَةُ التَّنِيْنْ","فَاكِهَةُ النَّجْمِ‬","تَمْرٌ","أَفُوكَادُو",
"رَامْبُوْتَان","لُوْنْجَانْ","نُوْنِيْ","إِجَاصٌ","خُوْخٌ",
"أَبُو شَوْكٍ","نَنْجَكَ","سَفَرْجَلٌ","زَيْتُوْن","رُمَّان",
"اَلْمَشْمَشْ","اَلْكِيْوِيْ","فَاكِهَةٌ لِيْتْشِيْ‬","دُوْكُوْ","اَلتُّوْتْ",
"شُكُولاَتَةٌ"
	};
	
	int[] voice = {
R.raw.apel,R.raw.manggis,R.raw.anggur,R.raw.chery,R.raw.lemon,
R.raw.jeruk,R.raw.kelapa,R.raw.mangga,R.raw.melon,R.raw.nanas,
R.raw.pisang,R.raw.semangka,R.raw.salak,R.raw.sirsak,R.raw.pepaya,
R.raw.strawberry,R.raw.buahnaga,R.raw.belimbing,R.raw.kurma,R.raw.alpukat,
R.raw.rambutan,R.raw.kelengkeng,R.raw.mengkudu,R.raw.buahpir,R.raw.persik,
R.raw.durian,R.raw.nangka,R.raw.jambu,R.raw.zaitun,R.raw.delima,
R.raw.aprikot,R.raw.kiwi,R.raw.leci,R.raw.duku,R.raw.berry,
R.raw.coklat
	};
	private ImageSwitcher imageswitcher;
	private TextView tv;
	private TextView tv2;
	private Gallery gallery;
	private MediaPlayer mp3;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kategori);
		
		//Definisi ActionBar
	    ActionBar actionBar = getActionBar();
	    
	    //Mengubah mode ActionBar agar dapat dikustom
	    actionBar.setDisplayShowCustomEnabled(true);
	    
	    //Mengganti layout dari ActionBar
	   // actionBar.setCustomView(R.layout.kategori);
	    
	    //Membuat sebuah obyek ColorDrawable
	    ColorDrawable colorDrawable = new ColorDrawable(
	    		this.getResources().getColor(R.color.orange));
	    
	    //Mengubah latar ActionBar dengan obyek ColorDrawable
	    actionBar.setBackgroundDrawable(colorDrawable);
		
	    //MessageBox
	    new AlertDialog.Builder(this)
	    .setTitle("Pesan")
	    .setMessage("Geser dan Sentuh Gambar Di Bawah Untuk Memilih Kosakata Yang Cocok")
	    .setNeutralButton("Ok", new DialogInterface.OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		}).show();
		
		
	tv = (TextView) findViewById(R.id.textView1);
	
	tv2 = (TextView)findViewById(R.id.textView2);
	

	
	//Custom fonts Arab
		Typeface face = Typeface.createFromAsset(getAssets(), "fonts/MAJALLA.TTF");
		tv2.setTypeface(face);
	
	
		imageswitcher = (ImageSwitcher) findViewById(R.id.switcher1);
		imageswitcher.setFactory(this);
		imageswitcher.setInAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));
		imageswitcher.setOutAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_out));
		
		gallery  = (Gallery) findViewById(R.id.gallery1);
		gallery.setAdapter(new ImageAdapter(this));
		gallery.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView parent, View v, int position, long id)
			{
				// TODO Auto-generated method stub
				imageswitcher.setImageResource(imageIDs[position]);
				tv.setText(txt[position]);
				tv2.setText(txtarab[position]);
				playSound(voice[position]);
			}
		});
	}
	//VOICE
	@Override
	protected void onPause() {
		try{
			super.onPause();
			mp3.pause();
		}catch (Exception e){
		}
	}
	private void playSound(int gallery){
		try{
			if (mp3.isPlaying()){
				mp3.stop();
				mp3.release();
			}
		}catch(Exception e){
			//Toast.makeText(this, "Masuk Exception", Toast.LENGTH_LONG).show();
		}
		if (gallery == voice[0]){
			mp3=MediaPlayer.create(this, voice[0]);
		}
		else if (gallery == voice[1]){
			mp3=MediaPlayer.create(this, voice[1]);
		}
		else if (gallery == voice[2]){
			mp3=MediaPlayer.create(this, voice[2]);
		}
		else if (gallery == voice[3]){
			mp3=MediaPlayer.create(this, voice[3]);
		}
		else if (gallery == voice[4]){
			mp3=MediaPlayer.create(this, voice[4]);
		}
		else if (gallery == voice[5]){
			mp3=MediaPlayer.create(this, voice[5]);
		}
		else if (gallery == voice[6]){
			mp3=MediaPlayer.create(this, voice[6]);
		}
		else if (gallery == voice[7]){
			mp3=MediaPlayer.create(this, voice[7]);
		}
		else if (gallery == voice[8]){
			mp3=MediaPlayer.create(this, voice[8]);
		}
		else if (gallery == voice[9]){
			mp3=MediaPlayer.create(this, voice[9]);
		}
		else if (gallery == voice[10]){
			mp3=MediaPlayer.create(this, voice[10]);
		}
		else if (gallery == voice[11]){
			mp3=MediaPlayer.create(this, voice[11]);
		}
		else if (gallery == voice[12]){
			mp3=MediaPlayer.create(this, voice[12]);
		}
		else if (gallery == voice[13]){
			mp3=MediaPlayer.create(this, voice[13]);
		}
		else if (gallery == voice[14]){
			mp3=MediaPlayer.create(this, voice[14]);
		}
		else if (gallery == voice[15]){
			mp3=MediaPlayer.create(this, voice[15]);
		}
		else if (gallery == voice[16]){
			mp3=MediaPlayer.create(this, voice[16]);
		}
		else if (gallery == voice[17]){
			mp3=MediaPlayer.create(this, voice[17]);
		}
		else if (gallery == voice[18]){
			mp3=MediaPlayer.create(this, voice[18]);
		}
		else if (gallery == voice[19]){
			mp3=MediaPlayer.create(this, voice[19]);
		}
		else if (gallery == voice[20]){
			mp3=MediaPlayer.create(this, voice[20]);
		}
		else if (gallery == voice[21]){
			mp3=MediaPlayer.create(this, voice[21]);
		}
		else if (gallery == voice[22]){
			mp3=MediaPlayer.create(this, voice[22]);
		}
		else if (gallery == voice[23]){
			mp3=MediaPlayer.create(this, voice[23]);
		}
		else if (gallery == voice[24]){
			mp3=MediaPlayer.create(this, voice[24]);
		}
		else if (gallery == voice[25]){
			mp3=MediaPlayer.create(this, voice[25]);
		}
		else if (gallery == voice[26]){
			mp3=MediaPlayer.create(this, voice[26]);
		}
		else if (gallery == voice[27]){
			mp3=MediaPlayer.create(this, voice[27]);
		}
		else if (gallery == voice[28]){
			mp3=MediaPlayer.create(this, voice[28]);
		}
		else if (gallery == voice[29]){
			mp3=MediaPlayer.create(this, voice[29]);
		}
		else if (gallery == voice[30]){
			mp3=MediaPlayer.create(this, voice[30]);
		}
		else if (gallery == voice[31]){
			mp3=MediaPlayer.create(this, voice[31]);
		}
		else if (gallery == voice[32]){
			mp3=MediaPlayer.create(this, voice[32]);
		}
		else if (gallery == voice[33]){
			mp3=MediaPlayer.create(this, voice[33]);
		}
		else if (gallery == voice[34]){
			mp3=MediaPlayer.create(this, voice[34]);
		}
		else if (gallery == voice[35]){
			mp3=MediaPlayer.create(this, voice[35]);
		}
		
		mp3.setLooping(false);
		mp3.start();
	}

	@Override
	public View makeView() {
		// TODO Auto-generated method stub
		ImageView imageView = new ImageView(this);
		//imageView.setBackgroundColor(@drawable/bg_kosakata);
		imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
		imageView.setLayoutParams(new ImageSwitcher.LayoutParams(
				LayoutParams.FILL_PARENT,
				LayoutParams.FILL_PARENT));
		
		return imageView;
	}
	public class ImageAdapter extends BaseAdapter
	{
			private Context context;
			private int itemBackground;
	public ImageAdapter(Context c)
	{
		context = c;
	}
		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return imageIDs.length;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			// TODO Auto-generated method stub
			ImageView imageView = new ImageView(context);
			imageView.setImageResource(imageIDs[position]);
			imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
			imageView.setLayoutParams(new Gallery.LayoutParams(135,100));
		//	imageView.setBackgroundResource(itemBackground);
			return imageView;
		}
		
	}
}
