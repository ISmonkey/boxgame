package jp.co.monkey.window;

import jp.co.monkey.jsbapp.R;
import android.content.Context;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class WindowLayoutBlue extends LinearLayout {

    // private final int MP = LinearLayout.LayoutParams.MATCH_PARENT;
    private final int WC = LinearLayout.LayoutParams.WRAP_CONTENT;

    public static Button okBtn;
    public static ImageView[] blueItem;
    public static ImageView[] buyItem;
    public static LinearLayout mainBlueLinerLayout;

    /**
     * 画像の表示非表示のフラグ
     */
    boolean imageFlag[];

    public WindowLayoutBlue(Context context) {
        super(context);

        windowBlueLayout();
    }

    public void windowBlueLayout() {
        mainBlueLinerLayout = new LinearLayout(getContext());
        mainBlueLinerLayout.setOrientation(LinearLayout.VERTICAL);
        this.addView(mainBlueLinerLayout);

        blueItem = new ImageView[5];
        buyItem = new ImageView[5];
        imageFlag = new boolean[5];

        LinearLayout fristLayout = new LinearLayout(getContext());
        mainBlueLinerLayout.addView(fristLayout);

        blueItem[0] = new ImageView(getContext());
        blueItem[0].setImageResource(R.drawable.blueberry);
        blueItem[0].setOnTouchListener((OnTouchListener) getContext());
        fristLayout.addView(blueItem[0]);

        blueItem[1] = new ImageView(getContext());
        blueItem[1].setImageResource(R.drawable.prunes);
        blueItem[1].setOnTouchListener((OnTouchListener) getContext());
        fristLayout.addView(blueItem[1]);

        LinearLayout secondLayout = new LinearLayout(getContext());
        mainBlueLinerLayout.addView(secondLayout);

        blueItem[2] = new ImageView(getContext());
        blueItem[2].setImageResource(R.drawable.grape);
        blueItem[2].setOnTouchListener((OnTouchListener) getContext());
        secondLayout.addView(blueItem[2]);

        blueItem[3] = new ImageView(getContext());
        blueItem[3].setImageResource(R.drawable.mellon);
        blueItem[3].setOnTouchListener((OnTouchListener) getContext());
        secondLayout.addView(blueItem[3]);

        LinearLayout thirdItemLayout = new LinearLayout(getContext());
        mainBlueLinerLayout.addView(thirdItemLayout);

        FrameLayout frameLayoutItem5 = new FrameLayout(getContext());
        thirdItemLayout.addView(frameLayoutItem5);

        blueItem[4] = new ImageView(getContext());
        blueItem[4].setImageResource(R.drawable.muscat);
        blueItem[4].setOnTouchListener((OnTouchListener) getContext());
        frameLayoutItem5.addView(blueItem[4]);

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
        for (int i = 0; i < blueItem.length; i++) {
            blueItem[i].setOnTouchListener(new OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    for (int i = 0; i < buyItem.length; i++) {
                        if (v == blueItem[i]) {
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
