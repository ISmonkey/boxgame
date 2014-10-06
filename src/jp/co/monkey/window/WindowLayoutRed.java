package jp.co.monkey.window;

import jp.co.monkey.jsbapp.R;
import android.content.Context;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class WindowLayoutRed extends LinearLayout {

    // private final int MP = LinearLayout.LayoutParams.MATCH_PARENT;
    private final int WC = LinearLayout.LayoutParams.WRAP_CONTENT;

    public static Button okBtn;
    public static ImageView[] redItem;
    public static ImageView[] buyItem;
    public static LinearLayout mainRedLinerLayout;
    /**
     * 画像の表示非表示のフラグ
     */
    boolean imageFlag[];

    public WindowLayoutRed(Context context) {
        super(context);
        windowsRedLayout();
        setTouch();
    }

    public void windowsRedLayout() {
        mainRedLinerLayout = new LinearLayout(getContext());
        mainRedLinerLayout.setOrientation(LinearLayout.VERTICAL);
        this.addView(mainRedLinerLayout);

        redItem = new ImageView[5];
        buyItem = new ImageView[5];
        imageFlag = new boolean[5];

        LinearLayout fristItemLayout = new LinearLayout(getContext());
        mainRedLinerLayout.addView(fristItemLayout);

        FrameLayout frameLayoutItem1 = new FrameLayout(getContext());
        fristItemLayout.addView(frameLayoutItem1);

        redItem[0] = new ImageView(getContext());
        redItem[0].setImageResource(R.drawable.cherriesbig);
        redItem[0].setOnTouchListener((OnTouchListener) getContext());
        frameLayoutItem1.addView(redItem[0]);

        buyItem[0] = new ImageView(getContext());
        imageFlag[0] = true;
        frameLayoutItem1.addView(buyItem[0]);

        FrameLayout frameLayoutItem2 = new FrameLayout(getContext());
        fristItemLayout.addView(frameLayoutItem2);

        redItem[1] = new ImageView(getContext());
        redItem[1].setImageResource(R.drawable.applebig);
        redItem[1].setOnTouchListener((OnTouchListener) getContext());
        frameLayoutItem2.addView(redItem[1]);

        buyItem[1] = new ImageView(getContext());
        imageFlag[1] = true;
        frameLayoutItem2.addView(buyItem[1]);

        LinearLayout secondItemLayout = new LinearLayout(getContext());
        mainRedLinerLayout.addView(secondItemLayout);

        FrameLayout frameLayoutItem3 = new FrameLayout(getContext());
        secondItemLayout.addView(frameLayoutItem3);

        redItem[2] = new ImageView(getContext());
        redItem[2].setImageResource(R.drawable.raspberrybig);
        redItem[2].setOnTouchListener((OnTouchListener) getContext());
        frameLayoutItem3.addView(redItem[2]);

        buyItem[2] = new ImageView(getContext());
        imageFlag[2] = true;
        frameLayoutItem3.addView(buyItem[2]);

        FrameLayout frameLayoutItem4 = new FrameLayout(getContext());
        secondItemLayout.addView(frameLayoutItem4);

        redItem[3] = new ImageView(getContext());
        redItem[3].setImageResource(R.drawable.peachbig);
        redItem[3].setOnTouchListener((OnTouchListener) getContext());
        frameLayoutItem4.addView(redItem[3]);

        buyItem[3] = new ImageView(getContext());
        imageFlag[3] = true;
        frameLayoutItem4.addView(buyItem[3]);

        LinearLayout thirdItemLayout = new LinearLayout(getContext());
        mainRedLinerLayout.addView(thirdItemLayout);

        FrameLayout frameLayoutItem5 = new FrameLayout(getContext());
        thirdItemLayout.addView(frameLayoutItem5);

        redItem[4] = new ImageView(getContext());
        redItem[4].setImageResource(R.drawable.strawberrybig);
        redItem[4].setOnTouchListener((OnTouchListener) getContext());
        frameLayoutItem5.addView(redItem[4]);

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

    public void setTouch() {
        for (int i = 0; i < redItem.length; i++) {
            redItem[i].setOnTouchListener(new OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    for (int i = 0; i < buyItem.length; i++) {
                        if (v == redItem[i]) {
                            if (imageFlag[i]) {
                                buyItem[i].setImageResource(R.drawable.buy);
                                buyItem[i].setVisibility(View.VISIBLE);
                                imageFlag[i] = false;
                                break;
                            } else {
                                buyItem[i].setVisibility(View.INVISIBLE);
                                imageFlag[i] = true;
                                break;
                            }
                        }
                    }
                    return false;
                }
            });
        }
    }
}
