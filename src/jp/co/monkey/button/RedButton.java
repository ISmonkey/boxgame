package jp.co.monkey.button;

import jp.co.monkey.activity.MainActivity;
import jp.co.monkey.jsbapp.R;
import jp.co.monkey.window.WindowLayoutRed;
import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class RedButton extends LinearLayout {

    private final int WC = LinearLayout.LayoutParams.WRAP_CONTENT;
    private Button redButton;

    public RedButton(Context context) {
        super(context);
        setLayout();
        setListener();
    }

    public void setLayout() {
        redButton = new Button(getContext());
        redButton.setBackgroundResource(R.drawable.redbtn);
        redButton.setOnClickListener((OnClickListener) getContext());
        LayoutParams paramsex = new LayoutParams(WC, WC);
        paramsex.gravity = Gravity.CENTER_HORIZONTAL;
        this.addView(redButton, paramsex);
    }

    private void setListener() {
        redButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                WindowLayoutRed windowsRed = new WindowLayoutRed(getContext());
                MainActivity.popupWindow.setContentView(windowsRed);
                if (MainActivity.popupWindow.isShowing()) {
                    MainActivity.popupWindow.dismiss();
                } else {
                    int xoff = BlueButton.blueButton.getWidth();
                    int yoff = BlueButton.blueButton.getHeight();
                    WindowLayoutRed.mainRedLinerLayout.setBackgroundColor(Color.argb(70, 255, 0, 0));
                    MainActivity.popupWindow.showAsDropDown(BlueButton.blueButton, xoff / 10,
                            -yoff / 50);
                }
            }
        });
    }
}
