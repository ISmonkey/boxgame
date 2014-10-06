package jp.co.monkey.layout;

import jp.co.monkey.activity.MainActivity;
import jp.co.monkey.button.BlueButton;
import jp.co.monkey.button.RedButton;
import jp.co.monkey.button.YellowButton;
import jp.co.monkey.jsbapp.R;
import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainLayout extends LinearLayout {

    private final int MP = LinearLayout.LayoutParams.MATCH_PARENT;
    private final int WC = LinearLayout.LayoutParams.WRAP_CONTENT;

    public static Button redButton;
    public static Button blueButton;
    public static Button yellowButton;

    public static ImageView boxImageView;

    private LinearLayout linearLayout;
    private TextView timerTextView;

    public static LinearLayout listLayout;

    // private CountDownTimer cdt;

    public MainLayout(Context context) {
        super(context);

        ListLayout.redItemNumber = 0;
        MainActivity.number = 0;

        layout();
    }

    public void layout() {

        // 全体のレイアウト
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setBackgroundColor(Color.WHITE);
        addView(frameLayout);

        linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        frameLayout.addView(linearLayout);

        // 上のレイアウト
        LinearLayout topLayout = new LinearLayout(getContext());
        LayoutParams params3 = new LayoutParams(MP, MP);
        params3.weight = 3.0f;
        linearLayout.addView(topLayout, params3);

        // 左側　ボタンのレイアウト
        LinearLayout btnLayout = new LinearLayout(getContext());
        btnLayout.setOrientation(LinearLayout.VERTICAL);
        btnLayout.setBackgroundResource(R.drawable.back002);
        LayoutParams params5 = new LayoutParams(WC, WC);
        params5.weight = 3.0f;
        topLayout.addView(btnLayout, params5);

        LinearLayout btnTop = new LinearLayout(getContext());
        btnLayout.addView(btnTop);

        ImageView test01 = new ImageView(getContext());
        test01.setBackgroundResource(R.drawable.kara01);
        LayoutParams parm = new LayoutParams(WC, WC);
        parm.weight = 0.2f;
        btnTop.addView(test01, parm);

        //赤いボタン呼び出し
        RedButton redBtn = new RedButton(getContext());
        btnTop.addView(redBtn);
        
        ImageView test02 = new ImageView(getContext());
        test02.setBackgroundResource(R.drawable.kara01);
        btnTop.addView(test02, parm);

        LinearLayout btnMidle = new LinearLayout(getContext());
        btnLayout.addView(btnMidle);

        //青いボタン呼び出し
        BlueButton blueBtn = new BlueButton(getContext());
        btnMidle.addView(blueBtn);

        //黄色いボタン呼び出し
        YellowButton yellowBtn = new YellowButton(getContext());
        btnMidle.addView(yellowBtn);

        LinearLayout midleLayout = new LinearLayout(getContext());
        topLayout.addView(midleLayout);

        // 真ん中のスペース
        ImageView test2ImageView = new ImageView(getContext());
        test2ImageView.setImageResource(R.drawable.kara03);
        midleLayout.addView(test2ImageView, params5);

        // 右側　リストのレイアウト
        listLayout = new LinearLayout(getContext());
        listLayout.setBackgroundResource(R.drawable.list002);
        listLayout.setOrientation(LinearLayout.VERTICAL);
        LayoutParams params4 = new LayoutParams(WC, WC);
        params4.weight = 1.8f;
        params4.gravity = Gravity.CENTER_HORIZONTAL;
        topLayout.addView(listLayout, params4);

        // リストの上部分
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setBackgroundResource(R.drawable.list002);
        LayoutParams paramslist = new LayoutParams(WC, WC);
        paramslist.weight = 2.0f;
        listLayout.addView(frameLayout2, paramslist);

        timerTextView = new TextView(getContext());
        timerTextView.setText("あと何秒");
        timerTextView.setTextSize(28);
        frameLayout2.addView(timerTextView);

        // リストレイアウトのクラスを呼ぶ
        ListLayout mainListLayout = new ListLayout(getContext());
        LayoutParams paramslist2 = new LayoutParams(WC, WC);
        paramslist2.weight = 1.0f;
        listLayout.addView(mainListLayout, paramslist2);

        ImageView listBottomImageView = new ImageView(getContext());
        listBottomImageView.setBackgroundResource(R.drawable.list002);
        LayoutParams paramslist3 = new LayoutParams(WC, WC);
        paramslist3.weight = 2.0f;
        listLayout.addView(listBottomImageView, paramslist3);

        // 下のレイアウト
        LinearLayout bottomLayout = new LinearLayout(getContext());
        bottomLayout.setOrientation(LinearLayout.VERTICAL);
        LayoutParams params6 = new LayoutParams(MP, MP);
        params6.weight = 7.0f;
        linearLayout.addView(bottomLayout, params6);

        boxImageView = new ImageView(getContext());
        boxImageView.setImageResource(R.drawable.box002);
        LayoutParams params2 = new LayoutParams(WC, WC);
        params2.weight = 1.0f;
        bottomLayout.addView(boxImageView, params2);

        ImageView beltConveyorImageView = new ImageView(getContext());
        beltConveyorImageView.setImageResource(R.drawable.belt001);
        LayoutParams params1 = new LayoutParams(MP, MP);
        params1.weight = 2.0f;
        bottomLayout.addView(beltConveyorImageView, params1);

        // ディスプレイのインスタンス生成
        // WindowManager wm = (WindowManager) getSystemService(WINDOW_SERVICE);
        // Display display = wm.getDefaultDisplay();
        // float width = display.getWidth();

        TranslateAnimation translateStart = new TranslateAnimation(-200, 0, 0, 0); // (0,0)から(100,100)に移動
        translateStart.setDuration(1000); // 3000msかけてアニメーションする

        // アニメーション終了時の表示状態を維持する
        translateStart.setFillEnabled(true);
        translateStart.setFillAfter(true);

        boxImageView.startAnimation(translateStart); // アニメーション適用

    }

}
