package sg.edu.np.mad.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button mButtonFollow;
    private Boolean follow_state = true;

    User user1 = new User("MAD",
            "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus orci ligula, interdum ut tortor non, porttitor sagittis diam. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Mauris in fringilla odio, vel posuere est. Proin pulvinar, ipsum sed posuere iaculis, turpis dui vulputate urna, eu porttitor ex lectus vel purus. Ut in nunc cursus, posuere orci ut, condimentum magna.",
            ListActivity.return_id(),
            true);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtonFollow =findViewById(R.id.btn_follow);

        TextView nameTxt = findViewById(R.id.helloWorldTv);
        String temp1 = user1.getName() + " ";
        String temp2 = String.valueOf(user1.getId());
        nameTxt.setText(temp1+temp2);

        TextView desTxt = findViewById(R.id.textView1);
        desTxt.setText(user1.getDescription());

        mButtonFollow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (follow_state) {
                    mButtonFollow.setText("Unfollow");
                    follow_state = false;
                    Toast.makeText(getApplicationContext(), "Unfollowed", Toast.LENGTH_LONG).show();
                } else{
                    mButtonFollow.setText("Follow");
                    follow_state = true;
                    Toast.makeText(getApplicationContext(), "Followed", Toast.LENGTH_LONG).show();
                }
            }
        });
    }


}