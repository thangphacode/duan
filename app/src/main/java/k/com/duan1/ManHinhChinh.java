package k.com.duan1;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

public class ManHinhChinh extends AppCompatActivity {
    ImageButton imgbtnLogin, imgbtnSearch;
//    private DrawerLayout mDrawerLayout;
//    private ActionBarDrawerToggle toggle;

    //kkkkkkkkkkkkkkkkk
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_chinh);
//        mDrawerLayout = (DrawerLayout)findViewById(R.id.drawer);
//        toggle = new ActionBarDrawerToggle(this,mDrawerLayout,R.string.open,R.string.close);
//        mDrawerLayout.addDrawerListener(toggle);
//        toggle.syncState();
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        imgbtnLogin = (ImageButton) findViewById(R.id.imgbtnLogin);
        imgbtnSearch = (ImageButton) findViewById(R.id.imgbtnSearch);
        imgbtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intentLogin = new Intent(ManHinhChinh.this, Login.class);
                startActivity(intentLogin);
            }
        });
        imgbtnSearch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent intentSearch = new Intent(ManHinhChinh.this, Search.class);
                startActivity(intentSearch);
            }
        });
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if (toggle.onOptionsItemSelected(item)){
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
        public void perform_action(View v) {
        TextView tv = (TextView) findViewById(R.id.tvThuVien);
        //alter text of textview widget
        tv.setText("Thư Viện");
        //assign the textview forecolor
        tv.setTextColor(Color.GREEN);
    }

    public void Moi_Nhat(View view) {
        TextView tv = (TextView) findViewById(R.id.tvMoiNhat);
        //alter text of textview widget
        tv.setText("Mới Nhất");
        //assign the textview forecolor
        tv.setTextColor(Color.GREEN);
    }

    public void Anh_Cua_Toi(View view) {
        TextView tv = (TextView) findViewById(R.id.tvAnhCuaToi);
        Intent intentAnhCuaToi = new Intent(ManHinhChinh.this, AnhCuaToi.class);
        startActivity(intentAnhCuaToi);
        //alter text of textview widget
////        tv.setText("Anh Cua Tôi");
////        //assign the textview forecolor
////        tv.setTextColor(Color.GREEN);
    }

    public void Anh_Noi_Bat(View view) {
        final TextView tv = (TextView) findViewById(R.id.tvAnh_Noi_Bat);
        tv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
//Creating the instance of PopupMenu
                PopupMenu popup = new PopupMenu(ManHinhChinh.this, tv);
//Inflating the Popup using xml file
                popup.getMenuInflater().inflate(R.menu.menu_main, popup.getMenu());

////registering popup with OnMenuItemClickListener
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    public boolean onMenuItemClick(MenuItem item) {
                        Toast.makeText(ManHinhChinh.this, "You Clicked : " + item.getTitle(), Toast.LENGTH_SHORT).show();
                        return true;
                    }
                });

                popup.show();//showing popup menu
            }
        });//closing the setOnClickListener method
    }

}



