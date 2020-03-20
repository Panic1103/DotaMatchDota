package com.example.dotamatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.dotamatch.Post.Post;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MatchActivity extends AppCompatActivity {

    TextView textView;
    EditText etMatchID;
    Button btnInputID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match);

        initialization();

    }

    private void inquiryApi(int id) {
        NetworkService.getInstance()
                .getJSONApi()
                .getPostWithMatchId(id)
                .enqueue(new Callback<Post>() {
                    @Override
                    public void onResponse(Call<Post> call, Response<Post> response) {
                        Post post = response.body();

                        textView.append(post.getMatchId() + "\n");
                        textView.append(post.getReplayUrl() + "\n");
                        textView.append(post.getDireScore() + "\n");
                        textView.append(post.getRadiantScore() + "\n");

                    }

                    @Override
                    public void onFailure(Call<Post> call, Throwable t) {
                        textView.append("Error occurred while getting request!");
                        t.printStackTrace();
                    }
                });
    }

    private void initialization() {
        textView = findViewById(R.id.textView);
        etMatchID = findViewById(R.id.etMatchID);
        btnInputID = findViewById(R.id.btnInputID);
        btnInputID.setOnClickListener(this::onClick);
    }

    private void onClick(View view) {
        int match_ID = Integer.parseInt(etMatchID.getText().toString());
        inquiryApi(match_ID);
    }
}
