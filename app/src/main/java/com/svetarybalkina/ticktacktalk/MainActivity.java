package com.svetarybalkina.ticktacktalk;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.CountDownTimer;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import static java.lang.Boolean.parseBoolean;

public class MainActivity extends AppCompatActivity {

    SeekBar timerSeekBar;
    TextView timerTextView;
    Button controllerButton;
    Boolean counterIsActive = false;
    CountDownTimer countDownTimer;
    String secondsInQuotes = "01";

    private SoundPool soundPool;

    private AudioManager audioManager;

    private static final int MAX_STREAMS = 1;

    private static final int streamType = AudioManager.STREAM_MUSIC;

    private boolean loaded;

    private int soundIdOne;
    private int soundIdTwo;
    private int soundIdThree;
    private int soundIdFour;
    private int soundIdFive;
    private int soundIdSix;
    private int soundIdSeven;
    private int soundIdEight;
    private int soundIdNine;
    private int soundIdTen;
    private int soundIdEleven;
    private int soundIdTwelve;
    private int soundIdThirteen;
    private int soundIdFourteen;
    private int soundIdFifteen;
    private int soundIdSixteen;
    private int soundIdSeventeen;
    private int soundIdEighteen;
    private int soundIdNineteen;
    private int soundIdTwenty;
    private int soundIdTwenty_one;
    private int soundIdTwenty_two;
    private int soundIdTwenty_three;
    private int soundIdTwenty_four;
    private int soundIdTwenty_five;
    private int soundIdTwenty_six;
    private int soundIdTwenty_seven;
    private int soundIdTwenty_eight;
    private int soundIdTwenty_nine;
    private int soundIdThirty;
    private int soundIdThirty_one;
    private int soundIdThirty_two;
    private int getSoundIdThirty_three;
    private int soundIdThirty_four;
    private int soundIdThirty_five;
    private int soundIdThirty_six;
    private int soundIdThirty_seven;
    private int soundIdThirty_eight;
    private int soundIdThirty_nine;
    private int soundIdFourty;
    private int soundIdFourty_one;
    private int soundIdFourty_two;
    private int soundIdFourty_three;
    private int soundIdFourty_four;
    private int soundIdFourty_five;
    private int soundIdFourty_six;
    private int soundIdFourty_seven;
    private int soundIdFourty_eight;
    private int soundIdFourty_nine;
    private int soundIdFifty;
    private int soundIdFifty_one;
    private int soundIdFifty_two;
    private int soundIdFifty_three;
    private int soundIdFifty_four;
    private int soundIdFifty_five;
    private int soundIdFifty_six;
    private int soundIdFifty_seven;
    private int soundIdFifty_eight;
    private int soundIdFifty_nine;
    private int soundIdOne_minute;
    private int soundIdTwo_minutes;
    private int soundIdThree_minutes;
    private int soundIdFour_minutes;
    private int soundIdFive_minutes;
    private int soundIdSix_minutes;
    private int soundIdSeven_minutes;
    private int soundIdEight_minutes;
    private int soundIdNine_minutes;
    private int soundIdTen_minutes;
    private float volume;

    public void resetTimer() {

        timerTextView.setText("0:30");
        timerSeekBar.setProgress(30);
        countDownTimer.cancel();
        controllerButton.setText("Go");
        timerSeekBar.setEnabled(true);
        counterIsActive = false;

    }

    public void updateTimer(int secondsLeft) {

        int minutes = (int) secondsLeft / 60;
        int seconds = secondsLeft - minutes * 60;

        String secondString = Integer.toString(seconds);

        if (seconds <= 9 ) {

            secondString = "0" + secondString;
        }

        timerTextView.setText(Integer.toString(minutes) + ":" + secondString);

        float leftVolumn = volume;
        float rightVolumn = volume;
        Integer streamId;

        switch (secondString) {
            case "00":
                switch (minutes) {
                    case 1:    streamId = this.soundPool.play(this.soundIdOne_minute,leftVolumn, rightVolumn, 1, 0, 1f);
                                break;
                    case 2:     streamId = this.soundPool.play(this.soundIdTwo_minutes,leftVolumn, rightVolumn, 1, 0, 1f);
                                break;
                    case 3:     streamId = this.soundPool.play(this.soundIdThree_minutes,leftVolumn, rightVolumn, 1, 0, 1f);
                                break;
                    case 4:     streamId = this.soundPool.play(this.soundIdFour_minutes,leftVolumn, rightVolumn, 1, 0, 1f);
                                break;
                    case 5:     streamId = this.soundPool.play(this.soundIdFive_minutes,leftVolumn, rightVolumn, 1, 0, 1f);
                                break;
                    case 6:     streamId = this.soundPool.play(this.soundIdSix_minutes,leftVolumn, rightVolumn, 1, 0, 1f);
                                break;
                    case 7:     streamId = this.soundPool.play(this.soundIdSeven_minutes,leftVolumn, rightVolumn, 1, 0, 1f);
                                break;
                    case 8:     streamId = this.soundPool.play(this.soundIdEight_minutes,leftVolumn, rightVolumn, 1, 0, 1f);
                                break;
                    case 9:     streamId = this.soundPool.play(this.soundIdNine_minutes,leftVolumn, rightVolumn, 1, 0, 1f);
                                break;
                    case 10:    streamId = this.soundPool.play(this.soundIdTen_minutes,leftVolumn, rightVolumn, 1, 0, 1f);
                                break;
                }
                        break;

            case "01":  streamId = this.soundPool.play(this.soundIdOne,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "02":  streamId = this.soundPool.play(this.soundIdTwo,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "03":  streamId = this.soundPool.play(this.soundIdThree,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "04":   streamId = this.soundPool.play(this.soundIdFour,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "05":  streamId = this.soundPool.play(this.soundIdFive,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "06":  streamId = this.soundPool.play(this.soundIdSix,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "07":  streamId = this.soundPool.play(this.soundIdSeven,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "08":  streamId = this.soundPool.play(this.soundIdEight,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "09":  streamId = this.soundPool.play(this.soundIdNine,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "10":  streamId = this.soundPool.play(this.soundIdTen,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "11":  streamId = this.soundPool.play(this.soundIdEleven,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "12":  streamId = this.soundPool.play(this.soundIdTwelve,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "13":  streamId = this.soundPool.play(this.soundIdThirteen,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "14":  streamId = this.soundPool.play(this.soundIdFourteen,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "15":  streamId = this.soundPool.play(this.soundIdFifteen,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "16":  streamId = this.soundPool.play(this.soundIdSixteen,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "17":  streamId = this.soundPool.play(this.soundIdSeventeen,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "18":  streamId = this.soundPool.play(this.soundIdEighteen,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "19":  streamId = this.soundPool.play(this.soundIdNineteen,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "20":  streamId = this.soundPool.play(this.soundIdTwenty,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "21":  streamId = this.soundPool.play(this.soundIdTwenty_one,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "22":  streamId = this.soundPool.play(this.soundIdTwenty_two,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "23":  streamId = this.soundPool.play(this.soundIdTwenty_three,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "24":  streamId = this.soundPool.play(this.soundIdTwenty_four,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "25":  streamId = this.soundPool.play(this.soundIdTwenty_five,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "26":  streamId = this.soundPool.play(this.soundIdTwenty_six,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "27":  streamId = this.soundPool.play(this.soundIdTwenty_seven,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "28":  streamId = this.soundPool.play(this.soundIdTwenty_eight,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "29":  streamId = this.soundPool.play(this.soundIdTwenty_nine,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "30":  streamId = this.soundPool.play(this.soundIdThirty,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "31":  streamId = this.soundPool.play(this.soundIdThirty_one,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "32":  streamId = this.soundPool.play(this.soundIdThirty_two,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "33":  streamId = this.soundPool.play(this.getSoundIdThirty_three,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "34":  streamId = this.soundPool.play(this.soundIdThirty_four,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "35":  streamId = this.soundPool.play(this.soundIdThirty_five,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "36":  streamId = this.soundPool.play(this.soundIdThirty_six,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "37":  streamId = this.soundPool.play(this.soundIdThirty_seven,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "38":  streamId = this.soundPool.play(this.soundIdThirty_eight,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "39":  streamId = this.soundPool.play(this.soundIdThirty_nine,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "40":  streamId = this.soundPool.play(this.soundIdFourty,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "41":  streamId = this.soundPool.play(this.soundIdFourty_one,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "42":  streamId = this.soundPool.play(this.soundIdFourty_two,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "43":  streamId = this.soundPool.play(this.soundIdFourty_three,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "44":  streamId = this.soundPool.play(this.soundIdFourty_four,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "45":  streamId = this.soundPool.play(this.soundIdFourty_five,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "46":  streamId = this.soundPool.play(this.soundIdFourty_six,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "47":  streamId = this.soundPool.play(this.soundIdFourty_seven,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "48":  streamId = this.soundPool.play(this.soundIdFourty_eight,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "49":  streamId = this.soundPool.play(this.soundIdFourty_nine,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "50":  streamId = this.soundPool.play(this.soundIdFifty,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "51":  streamId = this.soundPool.play(this.soundIdFifty_one,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "52":  streamId = this.soundPool.play(this.soundIdFifty_two,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "53":  streamId = this.soundPool.play(this.soundIdFifty_three,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "54":  streamId = this.soundPool.play(this.soundIdFifty_four,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "55":  streamId = this.soundPool.play(this.soundIdFifty_five,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "56":  streamId = this.soundPool.play(this.soundIdFifty_six,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "57":  streamId = this.soundPool.play(this.soundIdFifty_seven,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "58":  streamId = this.soundPool.play(this.soundIdFifty_eight,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
            case "59":  streamId = this.soundPool.play(this.soundIdFifty_nine,leftVolumn, rightVolumn, 1, 0, 1f);
                        break;
        }

    }

    public void controlTimer(View view) {

        if (counterIsActive == false) {

            counterIsActive = true;
            timerSeekBar.setEnabled(false);
            controllerButton.setText("Stop");

            countDownTimer = new CountDownTimer(timerSeekBar.getProgress() * 1000 + 100, 1000) {

                @Override
                public void onTick(long millisUntilFinished) {

                    updateTimer((int) millisUntilFinished / 1000);

                }

                @Override
                public void onFinish() {

                    resetTimer();

                }
            }.start();

        } else {

            resetTimer();

        }

    };

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);

        float currentVolumeIndex = (float) audioManager.getStreamVolume(streamType);

        float maxVolumeIndex  = (float) audioManager.getStreamMaxVolume(streamType);

       this.volume = currentVolumeIndex / maxVolumeIndex;

        this.setVolumeControlStream(streamType);

        AudioAttributes audioAttrib = new AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_GAME)
                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
                .build();

        SoundPool.Builder builder= new SoundPool.Builder();
        builder.setAudioAttributes(audioAttrib).setMaxStreams(MAX_STREAMS);

        this.soundPool = builder.build();

        this.soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(SoundPool soundPool, int sampleId, int status) {
                loaded = true;
            }
        });

        this.soundIdOne = this.soundPool.load(this, R.raw.one,1);
        this.soundIdTwo = this.soundPool.load(this, R.raw.two,1);
        this.soundIdThree = this.soundPool.load(this, R.raw.three,1);
        this.soundIdFour = this.soundPool.load(this, R.raw.four,1);
        this.soundIdFive = this.soundPool.load(this, R.raw.five,1);
        this.soundIdSix = this.soundPool.load(this, R.raw.six,1);
        this.soundIdSeven = this.soundPool.load(this, R.raw.seven,1);
        this.soundIdEight = this.soundPool.load(this, R.raw.eight,1);
        this.soundIdNine = this.soundPool.load(this, R.raw.nine,1);
        this.soundIdTen = this.soundPool.load(this, R.raw.ten,1);
        this.soundIdEleven = this.soundPool.load(this, R.raw.eleven,1);
        this.soundIdTwelve = this.soundPool.load(this, R.raw.twelve,1);
        this.soundIdThirteen = this.soundPool.load(this, R.raw.thirteen,1);
        this.soundIdFourteen = this.soundPool.load(this, R.raw.fourteen,1);
        this.soundIdFifteen = this.soundPool.load(this, R.raw.fifteen,1);
        this.soundIdSixteen = this.soundPool.load(this, R.raw.sixteen,1);
        this.soundIdSeventeen = this.soundPool.load(this, R.raw.seventeen,1);
        this.soundIdEighteen = this.soundPool.load(this, R.raw.eighteen,1);
        this.soundIdNineteen = this.soundPool.load(this, R.raw.ninteen,1);
        this.soundIdTwenty = this.soundPool.load(this, R.raw.twenty,1);
        this.soundIdTwenty_one = this.soundPool.load(this, R.raw.twenty_one,1);
        this.soundIdTwenty_two = this.soundPool.load(this, R.raw.twenty_two,1);
        this.soundIdTwenty_three = this.soundPool.load(this, R.raw.twenty_three,1);
        this.soundIdTwenty_four = this.soundPool.load(this, R.raw.twenty_four,1);
        this.soundIdTwenty_five = this.soundPool.load(this, R.raw.twenty_five,1);
        this.soundIdTwenty_six = this.soundPool.load(this, R.raw.twenty_six,1);
        this.soundIdTwenty_seven = this.soundPool.load(this, R.raw.twenty_seven,1);
        this.soundIdTwenty_eight = this.soundPool.load(this, R.raw.twenty_eight,1);
        this.soundIdTwenty_nine = this.soundPool.load(this, R.raw.twenty_nine,1);
        this.soundIdThirty = this.soundPool.load(this, R.raw.thirty,1);
        this.soundIdThirty_one = this.soundPool.load(this, R.raw.thirty_one,1);
        this.soundIdThirty_two = this.soundPool.load(this, R.raw.thirty_two,1);
        this.getSoundIdThirty_three = this.soundPool.load(this, R.raw.thirty_three,1);
        this.soundIdThirty_four = this.soundPool.load(this, R.raw.thirty_four,1);
        this.soundIdThirty_five = this.soundPool.load(this, R.raw.thirty_five,1);
        this.soundIdThirty_six = this.soundPool.load(this, R.raw.thirty_six,1);
        this.soundIdThirty_seven = this.soundPool.load(this, R.raw.thirty_seven,1);
        this.soundIdThirty_eight = this.soundPool.load(this, R.raw.thirty_eight,1);
        this.soundIdThirty_nine = this.soundPool.load(this, R.raw.thirty_nine,1);
        this.soundIdFourty = this.soundPool.load(this, R.raw.fourty,1);
        this.soundIdFourty_one = this.soundPool.load(this, R.raw.fourty_one,1);
        this.soundIdFourty_two = this.soundPool.load(this, R.raw.fourty_two,1);
        this.soundIdFourty_three = this.soundPool.load(this, R.raw.fourty_three,1);
        this.soundIdFourty_four = this.soundPool.load(this, R.raw.fourty_four,1);
        this.soundIdFourty_five = this.soundPool.load(this, R.raw.fourty_five,1);
        this.soundIdFourty_six = this.soundPool.load(this, R.raw.fourty_six,1);
        this.soundIdFourty_seven = this.soundPool.load(this, R.raw.fourty_seven,1);
        this.soundIdFourty_eight = this.soundPool.load(this, R.raw.fourty_eight,1);
        this.soundIdFourty_nine = this.soundPool.load(this, R.raw.fourty_nine,1);
        this.soundIdFifty = this.soundPool.load(this, R.raw.fifty,1);
        this.soundIdFifty_one = this.soundPool.load(this, R.raw.fifty_one,1);
        this.soundIdFifty_two = this.soundPool.load(this, R.raw.fifty_two,1);
        this.soundIdFifty_three = this.soundPool.load(this, R.raw.fifty_three,1);
        this.soundIdFifty_four = this.soundPool.load(this, R.raw.fifty_four,1);
        this.soundIdFifty_five = this.soundPool.load(this, R.raw.fifty_five,1);
        this.soundIdFifty_six = this.soundPool.load(this, R.raw.fifty_six,1);
        this.soundIdFifty_seven = this.soundPool.load(this, R.raw.fifty_seven,1);
        this.soundIdFifty_eight = this.soundPool.load(this, R.raw.fifty_eight,1);
        this.soundIdFifty_nine = this.soundPool.load(this, R.raw.fifty_nine,1);
        this.soundIdOne_minute = this.soundPool.load(this, R.raw.one_minute,1);
        this.soundIdTwo_minutes = this.soundPool.load(this, R.raw.two_minutes,1);
        this.soundIdThree_minutes = this.soundPool.load(this, R.raw.three_minutes,1);
        this.soundIdFour_minutes = this.soundPool.load(this, R.raw.four_minutes,1);
        this.soundIdFive_minutes = this.soundPool.load(this, R.raw.five_minutes,1);
        this.soundIdSix_minutes = this.soundPool.load(this, R.raw.six_minutes,1);
        this.soundIdSeven_minutes = this.soundPool.load(this, R.raw.seven_minutes,1);
        this.soundIdEight_minutes= this.soundPool.load(this, R.raw.eight_minutes,1);
        this.soundIdNine_minutes = this.soundPool.load(this, R.raw.nine_minutes,1);
        this.soundIdTen_minutes = this.soundPool.load(this, R.raw.ten_minutes,1);

        timerSeekBar = (SeekBar)findViewById(R.id.timerSeekBar);
        timerTextView = (TextView)findViewById(R.id.timerTextView);
        controllerButton = (Button)findViewById(R.id.controllerButton);

        timerSeekBar.setMax(600);
        timerSeekBar.setProgress(30);

        timerSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

                updateTimer(progress);

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}