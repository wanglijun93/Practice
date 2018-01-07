package wanglijun.vip.practice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mSortMaoPao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSortMaoPao = (Button) findViewById(R.id.sortMaoPao);
        mSortMaoPao.setOnClickListener(this);
		
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sortMaoPao:
                SortMaoPao.SamllAndBig();
                break;
            default:
        }
    }
}
