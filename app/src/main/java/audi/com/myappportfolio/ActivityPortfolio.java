package audi.com.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class ActivityPortfolio extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);

        findViewById(R.id.bMovies).setOnClickListener(this);
        findViewById(R.id.bStock).setOnClickListener(this);
        findViewById(R.id.bBuilt).setOnClickListener(this);
        findViewById(R.id.bMaterial).setOnClickListener(this);
        findViewById(R.id.bUbiquitous).setOnClickListener(this);
        findViewById(R.id.bCapstone).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        String msg;

        switch (view.getId()) {
            case R.id.bMovies:
                msg = getString(R.string.t_popular_movies);
                break;
            case R.id.bBuilt:
                msg = getString(R.string.t_built_big);
                break;
            case R.id.bStock:
                msg = getString(R.string.t_stock_hawk);
                break;
            case R.id.bMaterial:
                msg = getString(R.string.t_app_material);
                break;
            case R.id.bUbiquitous:
                msg = getString(R.string.t_ubiquitous);
                break;
            case R.id.bCapstone:
                msg = getString(R.string.t_capstone);
                break;
            default:
                msg = "I don't know what you clicked";
        }

        Toast.makeText(this,msg,Toast.LENGTH_LONG).show();
    }
}
