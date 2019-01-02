package oak.shef.ac.uk.testrunningservicesbackgroundrelaunched;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class NumberOneActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_one);

        TextView textView = findViewById(R.id.textView);
        textView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(NumberOneActivity.this , NumberTwoActivity.class);
                startActivity(intent);
            }
        });
    }
}
