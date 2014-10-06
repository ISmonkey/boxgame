package jp.co.monkey.button;

import jp.co.monkey.activity.MainActivity;
import jp.co.monkey.jsbapp.R;
import jp.co.monkey.window.WindowLayoutBlue;
import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class BlueButton extends LinearLayout {

    private final int WC = LinearLayout.LayoutParams.WRAP_CONTENT;
    public static Button blueButton;

    public BlueButton(Context context) {
        super(context);
        setLayout();
        setListener();
    }

    public void setLayout() {
        blueButton = new Button(getContext());
        blueButton.setBackgroundResource(R.drawable.bluebtn);
        blueButton.setOnClickListener((OnClickListener) getContext());
        LayoutParams paramsex = new LayoutParams(WC, WC);
        paramsex.gravity = Gravity.CENTER_HORIZONTAL;
        this.addView(blueButton, paramsex);
    }

    private void setListener() {
        blueButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                WindowLayoutBlue windowsBlue = new WindowLayoutBlue(getContext());
                MainActivity.popupWindow.setContentView(windowsBlue);
                if (MainActivity.popupWindow.isShowing()) {
                    MainActivity.popupWindow.dismiss();
                } else {
                    int xoff = blueButton.getWidth();
                    int yoff = blueButton.getHeight();
                    WindowLayoutBlue.mainBlueLinerLayout.setBackgroundColor(Color
                            .argb(70, 0, 0, 255));
                    MainActivity.popupWindow.showAsDropDown(blueButton, xoff / 10,
                            -yoff / 50);
                }
            }
        });
    }
}
