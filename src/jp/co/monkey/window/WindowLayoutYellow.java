package jp.co.monkey.window;

import jp.co.monkey.jsbapp.R;
import android.content.Context;
import android.view.Gravity;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class WindowLayoutYellow extends LinearLayout {

    // private final int MP = LinearLayout.LayoutParams.MATCH_PARENT;
    private final int WC = LinearLayout.LayoutParams.WRAP_CONTENT;

    public static Button okBtn;
    public static ImageView[] yellowItem;
    public static ImageView[] buyItem;
    public static LinearLayout mainYellowLinerLayout;
    /**
     * 画像の表示非表示のフラグ
     */
    boolean imageFlag[];

    public WindowLayoutYellow(Context context) {
        super(context);

        windowYellowLayout();
    }

    public void windowYellowLayout() {
        mainYellowLinerLayout = new LinearLayout(getContext());
        mainYellowLinerLayout.setOrientation(LinearLayout.VERTICAL);
        this.addView(mainYellowLinerLayout);

        yellowItem = new ImageView[5];
        buyItem = new ImageView[5];
        imageFlag = new boolean[5];

        LinearLayout fristLayout = new LinearLayout(getContext());
        mainYellowLinerLayout.addView(fristLayout);

        yellowItem[0] = new ImageView(getContext());
        yellowItem[0].setImageResource(R.drawable.banana);
        yellowItem[0].setOnTouchListener((OnTouchListener) getContext());
        fristLayout.addView(yellowItem[0]);

        yellowItem[1] = new ImageView(getContext());
        yellowItem[1].setImageResource(R.drawable.lemon);
        yellowItem[1].setOnTouchListener((OnTouchListener) getContext());
        fristLayout.addView(yellowItem[1]);

        LinearLayout secondLayout = new LinearLayout(getContext());
        mainYellowLinerLayout.addView(secondLayout);

        yellowItem[2] = new ImageView(getContext());
        yellowItem[2].setImageResource(R.drawable.pineapple);
        yellowItem[2].setOnTouchListener((OnTouchListener) getContext());
        secondLayout.addView(yellowItem[2]);

        yellowItem[3] = new ImageView(getContext());
        yellowItem[3].setImageResource(R.drawable.persimmon);
        yellowItem[3].setOnTouchListener((OnTouchListener) getContext());
        secondLayout.addView(yellowItem[3]);

        LinearLayout thirdItemLayout = new LinearLayout(getContext());
        mainYellowLinerLayout.addView(thirdItemLayout);

        FrameLayout frameLayoutItem5 = new FrameLayout(getContext());
        thirdItemLayout.addView(frameLayoutItem5);

        yellowItem[4] = new ImageView(getContext());
        yellowItem[4].setImageResource(R.drawable.orange);
        yellowItem[4].setOnTouchListener((OnTouchListener) getContext());
        frameLayoutItem5.addView(yellowItem[4]);

        buyItem[4] = new ImageView(getContext());
        imageFlag[4] = true;
        frameLayoutItem5.addView(buyItem[4]);

        LinearLayout okBtnLayout = new LinearLayout(getContext());
        LayoutParams btnParams = new LayoutParams(WC, WC);
        btnParams.weight = 2.0f;
        btnParams.gravity = Gravity.CENTER_HORIZONTAL;
        thirdItemLayout.addView(okBtnLayout, btnParams);

        okBtn = new Button(getContext());
        okBtn.setBackgroundResource(R.drawable.okbtn);
        okBtn.setOnClickListener((OnClickListener) getContext());
        okBtnLayout.addView(okBtn);

    }

}
