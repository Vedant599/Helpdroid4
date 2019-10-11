package com.example.helpdroid1223;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.helpdroid1223.R;

import java.util.List;

public class My_Speech_Recognizer extends AppCompatActivity {

    public SpeechRecognizer speechRecognizer;
    private Button Call;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my__speech__recognizer);
        Call=findViewById(R.id.Button);
        Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
                intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
                intent.putExtra(RecognizerIntent.EXTRA_MAX_RESULTS,1);
                speechRecognizer.startListening(intent);
            }
        });
        InitSpeechRecognizer();
    }

    private void InitSpeechRecognizer() {
        if(SpeechRecognizer.isRecognitionAvailable(this))
        {
            speechRecognizer=SpeechRecognizer.createSpeechRecognizer(this);
            speechRecognizer.setRecognitionListener(new RecognitionListener() {
                @Override
                public void onReadyForSpeech(Bundle params) {

                }

                @Override
                public void onBeginningOfSpeech() {

                }

                @Override
                public void onRmsChanged(float rmsdB) {

                }

                @Override
                public void onBufferReceived(byte[] buffer) {

                }

                @Override
                public void onEndOfSpeech() {

                }

                @Override
                public void onError(int error) {

                }

                @Override
                public void onResults(Bundle results) {
                    List<String> result_of_speech=results.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
                    processResult(result_of_speech.get(0));
                }

                @Override
                public void onPartialResults(Bundle partialResults) {

                }

                @Override
                public void onEvent(int eventType, Bundle params) {

                }
            });
        }}

    private void processResult(String command) {
        command= command.toLowerCase();
        if(command.contains("help"))
        {
            if(command.contains("fire"))
            {
                Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(My_Speech_Recognizer.this,EmergencyContactsActivity.class));
            }
        }
    }
}

