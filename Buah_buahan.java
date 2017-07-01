//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package com.zadi.kosakataarab;

import android.app.ActionBar;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView.ScaleType;
import android.widget.ViewSwitcher.ViewFactory;

public class Buah_Buahan extends Activity implements ViewFactory {
    Integer[] imageIDs = new Integer[]{Integer.valueOf(2130837514), Integer.valueOf(2130837649), Integer.valueOf(2130837511), Integer.valueOf(2130837552), Integer.valueOf(2130837643), Integer.valueOf(2130837591), Integer.valueOf(2130837610), Integer.valueOf(2130837648), Integer.valueOf(2130837653), Integer.valueOf(2130837658), Integer.valueOf(2130837681), Integer.valueOf(2130837692), Integer.valueOf(2130837689), Integer.valueOf(2130837701), Integer.valueOf(2130837669), Integer.valueOf(2130837703), Integer.valueOf(2130837541), Integer.valueOf(2130837531), Integer.valueOf(2130837635), Integer.valueOf(2130837507), Integer.valueOf(2130837687), Integer.valueOf(2130837614), Integer.valueOf(2130837654), Integer.valueOf(2130837680), Integer.valueOf(2130837673), Integer.valueOf(2130837565), Integer.valueOf(2130837659), Integer.valueOf(2130837582), Integer.valueOf(2130837730), Integer.valueOf(2130837558), Integer.valueOf(2130837515), Integer.valueOf(2130837621), Integer.valueOf(2130837641), Integer.valueOf(2130837564), Integer.valueOf(2130837532), Integer.valueOf(2130837554)};
    String[] txt = new String[]{"Apel", "Manggis", "Anggur", "Chery", "Lemon", "Jeruk", "Kelapa", "Mangga", "Melon", "Nanas", "Pisang", "Semangka", "Salak", "Sirsak", "Pepaya", "Strawberry", "Buah Naga", "Belimbing", "Kurma", "Alpukat", "Rambutan", "Kelengkeng", "Mengkudu", "Buah Pir", "Persik", "Durian", "Nangka", "Jambu", "Zaitun", "Delima", "Aprikot", "Kiwi", "Leci", "Duku", "Berry", "Coklat"};
    String[] txtarab = new String[]{"تُفَّاحٌ", "مَانْغُوسْتِيْن", "نَبِيْذٌ", "شَيْرِيْ", "لَيْمُوْنٌ", "اَلبُرْتُقَالِيُّ", "جُوزَةُالْهِنْد", "مَانْجُوْ", "شَمَامٌ", "اَنَانَاسْ", "مَوْزٌ", "بِطّيْخْ", "لِحَاءٌ", "قَشْطَةٌ شَائِكَةْ", "بَابَايَا", "فَرَاوِلَةْ", "فَاكِهَةُ التَّنِيْنْ", "فَاكِهَةُ النَّجْمِ\u202c", "تَمْرٌ", "أَفُوكَادُو", "رَامْبُوْتَان", "لُوْنْجَانْ", "نُوْنِيْ", "إِجَاصٌ", "خُوْخٌ", "أَبُو شَوْكٍ", "نَنْجَكَ", "سَفَرْجَلٌ", "زَيْتُوْن", "رُمَّان", "اَلْمَشْمَشْ", "اَلْكِيْوِيْ", "فَاكِهَةٌ لِيْتْشِيْ\u202c", "دُوْكُوْ", "اَلتُّوْتْ", "شُكُولاَتَةٌ"};
    int[] voice = new int[]{2131034123, 2131034233, 2131034120, 2131034155, 2131034228, 2131034187, 2131034201, 2131034232, 2131034237, 2131034241, 2131034263, 2131034275, 2131034272, 2131034285, 2131034252, 2131034286, 2131034141, 2131034134, 2131034221, 2131034116, 2131034269, 2131034205, 2131034238, 2131034142, 2131034256, 2131034165, 2131034242, 2131034178, 2131034307, 2131034161, 2131034124, 2131034212, 2131034226, 2131034164, 2131034136, 2131034157};
    private ImageSwitcher imageswitcher;
    private TextView tv;
    private TextView tv2;
    private Gallery gallery;
    private MediaPlayer mp3;
    private Typeface faceArab;
    private Typeface faceIndo;

    public Buah_Buahan() {
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(2130903044);
        ActionBar actionBar = this.getActionBar();
        actionBar.setDisplayShowCustomEnabled(true);
        ColorDrawable colorDrawable = new ColorDrawable(this.getResources().getColor(2131099654));
        actionBar.setBackgroundDrawable(colorDrawable);
        int actionBarTitle = Resources.getSystem().getIdentifier("action_bar_title", "id", "android");
        TextView actionBarTitleView = (TextView)this.getWindow().findViewById(actionBarTitle);
        Typeface ARNOPRO_REGULAR = Typeface.createFromAsset(this.getAssets(), "fonts/ARNOPRO-REGULAR.OTF");
        if(actionBarTitleView != null) {
            actionBarTitleView.setTypeface(ARNOPRO_REGULAR);
            actionBarTitleView.setTextSize(1, 22.0F);
        }

        AlertDialog dialog = (new Builder(this)).setTitle("Pesan").setMessage("Geser dan Sentuh Gambar Di Bawah Untuk Memilih Kosakata Yang Cocok").setNeutralButton("Ok", new OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
            }
        }).show();
        this.tv = (TextView)this.findViewById(2131427338);
        this.tv2 = (TextView)this.findViewById(2131427339);
        this.faceArab = Typeface.createFromAsset(this.getAssets(), "fonts/MAJALLA.TTF");
        this.tv2.setTypeface(this.faceArab);
        this.faceIndo = Typeface.createFromAsset(this.getAssets(), "fonts/ARNOPRO-REGULAR.OTF");
        this.tv.setTypeface(this.faceIndo);
        this.imageswitcher = (ImageSwitcher)this.findViewById(2131427337);
        this.imageswitcher.setFactory(this);
        this.imageswitcher.setInAnimation(AnimationUtils.loadAnimation(this, 17432576));
        this.imageswitcher.setOutAnimation(AnimationUtils.loadAnimation(this, 17432577));
        this.gallery = (Gallery)this.findViewById(2131427340);
        this.gallery.setAdapter(new Buah_Buahan.ImageAdapter(this));
        this.gallery.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                Buah_Buahan.this.imageswitcher.setImageResource(Buah_Buahan.this.imageIDs[position].intValue());
                Buah_Buahan.this.tv.setText(Buah_Buahan.this.txt[position]);
                Buah_Buahan.this.tv2.setText(Buah_Buahan.this.txtarab[position]);
                Buah_Buahan.this.playSound(Buah_Buahan.this.voice[position]);
            }
        });
    }

    protected void onPause() {
        try {
            super.onPause();
            this.mp3.pause();
        } catch (Exception var2) {
            ;
        }

    }

    private void playSound(int gallery) {
        try {
            if(this.mp3.isPlaying()) {
                this.mp3.stop();
                this.mp3.release();
            }
        } catch (Exception var3) {
            ;
        }

        if(gallery == this.voice[0]) {
            this.mp3 = MediaPlayer.create(this, this.voice[0]);
        } else if(gallery == this.voice[1]) {
            this.mp3 = MediaPlayer.create(this, this.voice[1]);
        } else if(gallery == this.voice[2]) {
            this.mp3 = MediaPlayer.create(this, this.voice[2]);
        } else if(gallery == this.voice[3]) {
            this.mp3 = MediaPlayer.create(this, this.voice[3]);
        } else if(gallery == this.voice[4]) {
            this.mp3 = MediaPlayer.create(this, this.voice[4]);
        } else if(gallery == this.voice[5]) {
            this.mp3 = MediaPlayer.create(this, this.voice[5]);
        } else if(gallery == this.voice[6]) {
            this.mp3 = MediaPlayer.create(this, this.voice[6]);
        } else if(gallery == this.voice[7]) {
            this.mp3 = MediaPlayer.create(this, this.voice[7]);
        } else if(gallery == this.voice[8]) {
            this.mp3 = MediaPlayer.create(this, this.voice[8]);
        } else if(gallery == this.voice[9]) {
            this.mp3 = MediaPlayer.create(this, this.voice[9]);
        } else if(gallery == this.voice[10]) {
            this.mp3 = MediaPlayer.create(this, this.voice[10]);
        } else if(gallery == this.voice[11]) {
            this.mp3 = MediaPlayer.create(this, this.voice[11]);
        } else if(gallery == this.voice[12]) {
            this.mp3 = MediaPlayer.create(this, this.voice[12]);
        } else if(gallery == this.voice[13]) {
            this.mp3 = MediaPlayer.create(this, this.voice[13]);
        } else if(gallery == this.voice[14]) {
            this.mp3 = MediaPlayer.create(this, this.voice[14]);
        } else if(gallery == this.voice[15]) {
            this.mp3 = MediaPlayer.create(this, this.voice[15]);
        } else if(gallery == this.voice[16]) {
            this.mp3 = MediaPlayer.create(this, this.voice[16]);
        } else if(gallery == this.voice[17]) {
            this.mp3 = MediaPlayer.create(this, this.voice[17]);
        } else if(gallery == this.voice[18]) {
            this.mp3 = MediaPlayer.create(this, this.voice[18]);
        } else if(gallery == this.voice[19]) {
            this.mp3 = MediaPlayer.create(this, this.voice[19]);
        } else if(gallery == this.voice[20]) {
            this.mp3 = MediaPlayer.create(this, this.voice[20]);
        } else if(gallery == this.voice[21]) {
            this.mp3 = MediaPlayer.create(this, this.voice[21]);
        } else if(gallery == this.voice[22]) {
            this.mp3 = MediaPlayer.create(this, this.voice[22]);
        } else if(gallery == this.voice[23]) {
            this.mp3 = MediaPlayer.create(this, this.voice[23]);
        } else if(gallery == this.voice[24]) {
            this.mp3 = MediaPlayer.create(this, this.voice[24]);
        } else if(gallery == this.voice[25]) {
            this.mp3 = MediaPlayer.create(this, this.voice[25]);
        } else if(gallery == this.voice[26]) {
            this.mp3 = MediaPlayer.create(this, this.voice[26]);
        } else if(gallery == this.voice[27]) {
            this.mp3 = MediaPlayer.create(this, this.voice[27]);
        } else if(gallery == this.voice[28]) {
            this.mp3 = MediaPlayer.create(this, this.voice[28]);
        } else if(gallery == this.voice[29]) {
            this.mp3 = MediaPlayer.create(this, this.voice[29]);
        } else if(gallery == this.voice[30]) {
            this.mp3 = MediaPlayer.create(this, this.voice[30]);
        } else if(gallery == this.voice[31]) {
            this.mp3 = MediaPlayer.create(this, this.voice[31]);
        } else if(gallery == this.voice[32]) {
            this.mp3 = MediaPlayer.create(this, this.voice[32]);
        } else if(gallery == this.voice[33]) {
            this.mp3 = MediaPlayer.create(this, this.voice[33]);
        } else if(gallery == this.voice[34]) {
            this.mp3 = MediaPlayer.create(this, this.voice[34]);
        } else if(gallery == this.voice[35]) {
            this.mp3 = MediaPlayer.create(this, this.voice[35]);
        }

        this.mp3.setLooping(false);
        this.mp3.start();
    }

    public View makeView() {
        ImageView imageView = new ImageView(this);
        imageView.setScaleType(ScaleType.FIT_CENTER);
        imageView.setLayoutParams(new LayoutParams(-1, -1));
        return imageView;
    }

    public class ImageAdapter extends BaseAdapter {
        private Context context;
        private int itemBackground;

        public ImageAdapter(Context c) {
            this.context = c;
        }

        public int getCount() {
            return Buah_Buahan.this.imageIDs.length;
        }

        public Object getItem(int position) {
            return Integer.valueOf(position);
        }

        public long getItemId(int position) {
            return (long)position;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView = new ImageView(this.context);
            imageView.setImageResource(Buah_Buahan.this.imageIDs[position].intValue());
            imageView.setScaleType(ScaleType.FIT_CENTER);
            imageView.setLayoutParams(new android.widget.Gallery.LayoutParams(135, 100));
            return imageView;
        }
    }
}

